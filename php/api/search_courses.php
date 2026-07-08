<?php
include_once(__DIR__ . '/../html/common.php');
header('Content-Type: application/json; charset=utf-8');

// 사용자 입력값 수신 및 보안 처리.
$keyword = isset($_GET['keyword']) ? trim($_GET['keyword']) : '';
$available_only = isset($_GET['available']) ? $_GET['available'] : 'false';

// 기본 쿼리 구성.
$sql = "SELECT course_id, title, max_capacity, current_enrolled FROM g5_lms_course WHERE 1=1";

// 검색어가 있을 경우 LIKE 조건 추가.
if ($keyword !== '') {
    $safe_keyword = mysqli_real_escape_string($g5['connect_db'], $keyword);
    $sql .= " AND title LIKE '%{$safe_keyword}%'";
}

// '수강 가능 강의만 보기' 필터 적용.
if ($available_only === 'true') {
    $sql .= " AND current_enrolled < max_capacity";
}

$sql .= " ORDER BY course_id DESC";
$result = sql_query($sql);
$courses = [];

while ($row = sql_fetch_array($result)) {
    $courses[] = [
        'id' => (int)$row['course_id'],
        'title' => $row['title'],
        'max' => (int)$row['max_capacity'],
        'current' => (int)$row['current_enrolled']
    ];
}

echo json_encode(['status' => 'success', 'data' => $courses]);
?>