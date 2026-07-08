<?php
include_once(__DIR__ . '/../html/common.php');
header('Content-Type: application/json; charset=utf-8');

// 관리자 권한 확인
if (!$is_member || $member['mb_level'] < 10) {
    echo json_encode(['status' => 'error', 'message' => '권한 없음']);
    exit;
}

$data = json_decode(file_get_contents('php://input'), true);
$id = (int)$data['id'];
$title = mysqli_real_escape_string($g5['connect_db'], $data['title']);
$max = (int)$data['max'];

// 유효성 검사
if ($max < 0) {
    echo json_encode(['status' => 'error', 'message' => '정원은 0명 이상이어야 합니다.']);
    exit;
}

// 실제 업데이트 쿼리
$sql = "UPDATE g5_lms_course SET title = '{$title}', max_capacity = {$max} WHERE course_id = {$id}";

if (sql_query($sql)) {
    echo json_encode(['status' => 'success', 'message' => '강의 정보가 수정되었습니다.']);
} else {
    echo json_encode(['status' => 'error', 'message' => 'DB 수정 실패']);
}
?>