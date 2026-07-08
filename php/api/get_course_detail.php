<?php
include_once(__DIR__ . '/../html/common.php');
header('Content-Type: application/json; charset=utf-8');

$course_id = isset($_GET['id']) ? (int)$_GET['id'] : 0;

if ($course_id === 0) {
    echo json_encode(['status' => 'error', 'message' => '잘못된 접근입니다.']);
    exit;
}

// 확장된 강의 세부 정보를 함께 조회한다.
$sql = "SELECT course_id, title, max_capacity, current_enrolled, course_type, credits, description 
        FROM g5_lms_course 
        WHERE course_id = {$course_id}";
$row = sql_fetch($sql);

if ($row) {
    // 개요가 비어있을 경우 기본 메시지를 처리한다.
    if (empty($row['description'])) {
        $row['description'] = '등록된 교과목 개요가 없습니다.';
    }
    echo json_encode(['status' => 'success', 'data' => $row]);
} else {
    echo json_encode(['status' => 'error', 'message' => '강의를 찾을 수 없습니다.']);
}
?>