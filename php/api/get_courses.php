<?php
// 1. API 응답을 망치는 경고나 알림(Notice) 메시지 출력을 차단한다. (치명적 에러만 로깅)
error_reporting(E_ALL & ~E_NOTICE & ~E_WARNING);
ini_set('display_errors', 0);

// 시스템 코어를 로드한다.
include_once(__DIR__ . '/../html/common.php');
header('Content-Type: application/json; charset=utf-8');

// 2. 변수가 정의되어 있는지(isset) 먼저 확인하여 Undefined Variable 에러를 완벽히 방어한다.
$is_logged_in = (isset($is_member) && $is_member) ? true : false;
$current_user = ($is_logged_in && isset($member['mb_id'])) ? $member['mb_id'] : null;

// 현재 유저의 수강 내역을 해시 맵으로 적재한다.
$enrolled_map = [];
if ($is_logged_in && $current_user) {
    $sql_enroll = "SELECT course_id FROM g5_lms_enrollment WHERE mb_id = '{$current_user}'";
    $result_enroll = sql_query($sql_enroll);
    
    if ($result_enroll) {
        while ($row = sql_fetch_array($result_enroll)) {
            $enrolled_map[(int)$row['course_id']] = true;
        }
    }
}

// 전체 강의 목록을 조회한다.
$sql = "SELECT course_id, title, max_capacity, current_enrolled FROM g5_lms_course";
$result = sql_query($sql);

// (이전 코드 동일...)
$courses = [];
if ($result) {
    while ($row = sql_fetch_array($result)) {
        $course_id = (int)$row['course_id'];
        $courses[] = [
            'id' => $course_id,
            'name' => $row['title'],
            'max' => (int)$row['max_capacity'],
            'current' => (int)$row['current_enrolled'],
            'is_enrolled' => isset($enrolled_map[$course_id]),
            'debug_row' => $row // 💡 원인 추적을 위해 DB 원본 데이터를 추가!
        ];
    }
}
// (이하 json_encode 출력 동일...)

// 결과를 JSON으로 출력한다.
echo json_encode([
    'status' => 'success',
    'auth' => [
        'logged_in' => $is_logged_in,
        'user_id' => $current_user
    ],
    'data' => $courses
]);
exit;
?>