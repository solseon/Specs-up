<?php
// 그누보드 코어 시스템을 로드한다.
include_once(__DIR__ . '/../html/common.php');

ini_set('display_errors', 1);
error_reporting(E_ALL);

/**
 * 사용자의 권한 존재 여부를 데이터베이스 조인을 통해 검증한다.
 * 
 * @param string $mb_id 회원 아이디
 * @param string $permission 검증할 권한 키
 * @return bool 권한 보유 여부
 */
function check_user_permission($mb_id, $permission) {
    // SQL 인젝션 방지를 위해 인자를 필터링한다.
    $safe_mb_id = sql_real_escape_string($mb_id);
    $safe_permission = sql_real_escape_string($permission);

    // 유저의 역할과 역할에 매핑된 권한을 조인하여 카운트를 계산한다.
    $sql = "SELECT COUNT(*) as cnt
            FROM g5_lms_user_role ur
            JOIN g5_lms_permission p ON ur.role_id = p.role_id
            WHERE ur.mb_id = '{$safe_mb_id}' AND p.permission_key = '{$safe_permission}'";
            
    $row = sql_fetch($sql);
    
    // 카운트가 0보다 크면 권한이 존재하는 것으로 판단한다.
    return (int)$row['cnt'] > 0;
}

// 3. 시나리오 테스트 케이스 정의
$test_cases = [
    ['mb_id' => 'user_student', 'action' => 'enroll_course', 'desc' => '학생의 수강신청 시도'],
    ['mb_id' => 'user_student', 'action' => 'create_course', 'desc' => '학생의 강좌개설 시도'],
    ['mb_id' => 'user_professor', 'action' => 'create_course', 'desc' => '교수의 강좌개설 시도']
];

echo "<h1>LMS 권한 제어(RBAC) 시스템 테스트 검증 결과</h1>";

foreach ($test_cases as $case) {
    $has_access = check_user_permission($case['mb_id'], $case['action']);
    
    echo "이유: {$case['desc']}<br>";
    echo "결과: 유저 [{$case['mb_id']}] -> 권한 [{$case['action']}] = ";
    echo $has_access ? "<b style='color:green;'>인가 완료 (Access Granted)</b>" : "<b style='color:red;'>접근 거부 (Access Denied)</b>";
    echo "<hr>";
}
?>