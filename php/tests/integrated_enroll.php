<?php
// 시스템 코어를 로드한다.
include_once(__DIR__ . '/../html/common.php');
ini_set('display_errors', 1);
error_reporting(E_ALL);

/**
 * 시스템 내 중요 이벤트를 감사 로그 테이블에 기록한다.
 */
function write_audit_log($mb_id, $action_type, $target_id, $status, $error_msg = '') {
    // 클라이언트의 IP를 확보하며, 없을 경우 로컬호스트로 대체한다.
    $ip = $_SERVER['REMOTE_ADDR'] ?? '127.0.0.1';
    
    // SQL 인젝션 방지를 위해 모든 입력값을 이스케이프 처리한다.
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

function check_user_permission($mb_id, $permission) {
    $safe_mb_id = sql_real_escape_string($mb_id);
    $safe_permission = sql_real_escape_string($permission);
    $sql = "SELECT COUNT(*) as cnt 
            FROM g5_lms_user_role ur
            JOIN g5_lms_permission p ON ur.role_id = p.role_id
            WHERE ur.mb_id = '{$safe_mb_id}' AND p.permission_key = '{$safe_permission}'";
    $row = sql_fetch($sql);
    return (int)$row['cnt'] > 0;
}

$current_user = 'user_student'; // 테스트 시 'user_professor'로 변경하여 DENIED 로그를 확인한다.
$course_id = 1;
$action = 'enroll_course';

// 1. [Fail-Fast] 권한 검증
if (!check_user_permission($current_user, $action)) {
    // 권한이 없으므로 트랜잭션 시작 전에 즉시 로그를 남기고 종료한다.
    write_audit_log($current_user, $action, $course_id, 'DENIED', 'RBAC 권한 검증 실패');
    echo "<h1>시스템 거부</h1>수강신청 실패: 권한이 없습니다.";
    exit;
}

// 2. 트랜잭션 진입
sql_query("START TRANSACTION");

$sql = "SELECT max_capacity, current_enrolled FROM g5_lms_course WHERE course_id = '$course_id' FOR UPDATE";
$row = sql_fetch($sql);

if ($row['current_enrolled'] >= $row['max_capacity']) {
    // 3. 트랜잭션 롤백
    sql_query("ROLLBACK");
    
    // 주의: 롤백이 완전히 끝난 후 로그를 기록해야 데이터가 소멸하지 않는다.
    write_audit_log($current_user, $action, $course_id, 'FAIL', '정원 초과');
    $result_msg = "수강신청 실패: 정원이 꽉 찼습니다.";
} else {
    // 4. 데이터 갱신 및 커밋
    sql_query("UPDATE g5_lms_course SET current_enrolled = current_enrolled + 1 WHERE course_id = '$course_id'");
    sql_query("INSERT INTO g5_lms_enrollment (mb_id, course_id) VALUES ('$current_user', '$course_id')");
    sql_query("COMMIT");
    
    // 정상 처리 로그 기록
    write_audit_log($current_user, $action, $course_id, 'SUCCESS');
    $result_msg = "수강신청 성공: {$current_user} 학생이 등록되었습니다.";
}

echo "<h1>시스템 처리 완료</h1>" . $result_msg;
?>