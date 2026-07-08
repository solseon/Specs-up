<?php
include_once(__DIR__ . '/../html/common.php');
header('Content-Type: application/json; charset=utf-8');

// 관리자 권한 체크
if (!$is_member || $member['mb_level'] < 10) {
    echo json_encode(['status' => 'error', 'message' => '권한 없음']);
    exit;
}

$data = json_decode(file_get_contents('php://input'), true);
$title = trim($data['title']);
$max = (int)$data['max'];

if (!$title || $max <= 0) {
    echo json_encode(['status' => 'error', 'message' => '데이터 오류']);
    exit;
}

// 강의 추가
$sql = "INSERT INTO g5_lms_course (title, max_capacity, current_enrolled) VALUES ('{$title}', {$max}, 0)";
if (sql_query($sql)) {
    echo json_encode(['status' => 'success', 'message' => '강의 개설 완료']);
} else {
    echo json_encode(['status' => 'error', 'message' => 'DB 입력 실패']);
}
?>