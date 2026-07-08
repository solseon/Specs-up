<?php
// 시스템 코어 로드 시 세션 검증이 자동으로 수행된다.
include_once(__DIR__ . '/../html/common.php');

header('Content-Type: application/json; charset=utf-8');

$raw_data = file_get_contents('php://input');
$data = json_decode($raw_data, true);

$course_id = isset($data['course_id']) ? (int)$data['course_id'] : 0;

if ($course_id === 0) {
    echo json_encode(['status' => 'error', 'message' => '유효하지 않은 강의 ID입니다.']);
    exit;
}

// 1. 인증(Authentication) 방어벽: 로그인하지 않은 사용자의 접근을 차단한다.
if (!$is_member || empty($member['mb_id'])) {
    // HTTP 상태 코드를 401(Unauthorized)로 명시할 수도 있으나, 여기서는 일관된 JSON 응답 규격을 따른다.
    echo json_encode(['status' => 'error', 'message' => '로그인이 필요한 서비스입니다.']);
    exit;
}

// 2. 세션에 적재된 실제 유저 ID를 변수에 할당한다.
$mb_id = $member['mb_id']; 

sql_query("START TRANSACTION");

try {
    $sql_check = "SELECT max_capacity, current_enrolled FROM g5_lms_course WHERE course_id = '{$course_id}' FOR UPDATE";
    $course_info = sql_fetch($sql_check);

    if (!$course_info) {
        throw new Exception("존재하지 않는 강의입니다.");
    }

    if ($course_info['current_enrolled'] >= $course_info['max_capacity']) {
        throw new Exception("수강 정원이 초과되었습니다.");
    }

    $sql_dup = "SELECT count(*) as cnt FROM g5_lms_enrollment WHERE mb_id = '{$mb_id}' AND course_id = '{$course_id}'";
    $dup_check = sql_fetch($sql_dup);

    if ($dup_check['cnt'] > 0) {
        throw new Exception("이미 수강신청이 완료된 강의입니다.");
    }

    // 실제 로그인 세션 ID($mb_id)를 기반으로 삽입한다.
    $sql_insert = "INSERT INTO g5_lms_enrollment (mb_id, course_id) VALUES ('{$mb_id}', '{$course_id}')";
    sql_query($sql_insert);

    $sql_update = "UPDATE g5_lms_course SET current_enrolled = current_enrolled + 1 WHERE course_id = '{$course_id}'";
    sql_query($sql_update);

    sql_query("COMMIT");
    echo json_encode(['status' => 'success', 'message' => '수강신청이 완료되었습니다.']);

    $del_cart_sql = "DELETE FROM g5_lms_cart WHERE mb_id = '{$mb_id}' AND course_id = {$course_id}";
    sql_query($del_cart_sql);

} catch (Exception $e) {
    sql_query("ROLLBACK");
    echo json_encode(['status' => 'error', 'message' => $e->getMessage()]);
}
exit;
?>