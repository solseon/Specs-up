<?php
// 시스템 코어를 로드한다.
include_once(__DIR__ . '/../html/common.php');
ini_set('display_errors', 1);
error_reporting(E_ALL);

/**
 * 시스템 감사 로그를 담당하는 클래스이다.
 * 오직 로그를 데이터베이스에 적재하는 책임만 가진다.
 */
class AuditLogger {
    public function write($mb_id, $action_type, $target_id, $status, $error_msg = '') {
        $ip = $_SERVER['REMOTE_ADDR'] ?? '127.0.0.1';
        $safe_mb = sql_real_escape_string($mb_id);
        $safe_action = sql_real_escape_string($action_type);
        $safe_target = sql_real_escape_string($target_id);
        $safe_status = sql_real_escape_string($status);
        $safe_msg = sql_real_escape_string($error_msg);

        $sql = "INSERT INTO g5_lms_audit_log 
                (mb_id, action_type, target_id, status, ip_address, error_message) 
                VALUES 
                ('{$safe_mb}', '{$safe_action}', '{$safe_target}', '{$safe_status}', '{$ip}', '{$safe_msg}')";
        sql_query($sql);
    }
}

/**
 * 역할 기반 권한 제어(RBAC)를 담당하는 클래스이다.
 * 데이터베이스를 조회하여 특정 사용자의 권한 여부를 불리언 값으로 반환한다.
 */
class AccessControl {
    public function hasPermission($mb_id, $permission) {
        $safe_mb_id = sql_real_escape_string($mb_id);
        $safe_permission = sql_real_escape_string($permission);
        
        $sql = "SELECT COUNT(*) as cnt 
                FROM g5_lms_user_role ur
                JOIN g5_lms_permission p ON ur.role_id = p.role_id
                WHERE ur.mb_id = '{$safe_mb_id}' AND p.permission_key = '{$safe_permission}'";
        $row = sql_fetch($sql);
        
        return (int)$row['cnt'] > 0;
    }
}

/**
 * 수강신청 비즈니스 로직을 처리하는 핵심 서비스 클래스이다.
 * 로깅과 권한 검증 로직은 외부 객체에 위임하여 결합도를 낮춘다.
 */
class CourseEnrollmentService {
    private $logger;
    private $auth;

    // 생성자를 통해 외부에서 생성된 객체를 주입받는다(Dependency Injection).
    public function __construct(AuditLogger $logger, AccessControl $auth) {
        $this->logger = $logger;
        $this->auth = $auth;
    }

    /**
     * 수강신청 트랜잭션을 실행한다.
     */
    public function enroll($mb_id, $course_id) {
        $action = 'enroll_course';

        // 1. 주입받은 권한 객체를 통해 검증을 수행한다.
        if (!$this->auth->hasPermission($mb_id, $action)) {
            $this->logger->write($mb_id, $action, $course_id, 'DENIED', 'RBAC 권한 검증 실패');
            return "시스템 거부: 권한이 없습니다.";
        }

        // 2. 트랜잭션을 시작하고 비관적 락을 건다.
        sql_query("START TRANSACTION");

        $sql = "SELECT max_capacity, current_enrolled FROM g5_lms_course WHERE course_id = '$course_id' FOR UPDATE";
        $row = sql_fetch($sql);

        // 3. 정원 초과 여부를 검증하고 필요시 롤백한다.
        if ($row['current_enrolled'] >= $row['max_capacity']) {
            sql_query("ROLLBACK");
            $this->logger->write($mb_id, $action, $course_id, 'FAIL', '정원 초과');
            return "수강신청 실패: 정원이 꽉 찼습니다.";
        }

        // 4. 수강신청을 확정하고 커밋한다.
        sql_query("UPDATE g5_lms_course SET current_enrolled = current_enrolled + 1 WHERE course_id = '$course_id'");
        sql_query("INSERT INTO g5_lms_enrollment (mb_id, course_id) VALUES ('$mb_id', '$course_id')");
        sql_query("COMMIT");

        $this->logger->write($mb_id, $action, $course_id, 'SUCCESS');
        return "수강신청 성공: {$mb_id} 학생이 등록되었습니다.";
    }
}

// ==========================================
// 실행부 (클라이언트 로직)
// ==========================================

// 필요한 의존성 객체들을 먼저 생성한다.
$auditLogger = new AuditLogger();
$accessControl = new AccessControl();

// 서비스 객체를 생성할 때 의존성을 주입한다.
$enrollmentService = new CourseEnrollmentService($auditLogger, $accessControl);

// 최종적으로 비즈니스 로직만 깔끔하게 호출한다.
echo "<h1>OOP 기반 수강신청 테스트</h1>";
$result = $enrollmentService->enroll('user_student', 1);
echo $result;

?>