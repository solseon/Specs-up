<?php
error_reporting(E_ALL & ~E_NOTICE & ~E_WARNING);
ini_set('display_errors', 0);

include_once(__DIR__ . '/../html/common.php');
header('Content-Type: application/json; charset=utf-8');

// 관리자 권한 검증 (레벨 10)
if (!$is_member || $member['mb_level'] < 10) {
    echo json_encode(['status' => 'error', 'message' => '접근 권한이 없습니다.']);
    exit;
}

// SQL: 데이터베이스 엔진에서 통계 연산 수행 (마감 여부, 비율 계산)
$sql_stats = "
    SELECT 
        c.course_id,
        c.title,
        c.max_capacity,
        c.current_enrolled,
        ROUND((c.current_enrolled / c.max_capacity) * 100, 1) AS fill_rate,
        CASE 
            WHEN c.current_enrolled >= c.max_capacity THEN '마감'
            WHEN c.current_enrolled >= c.max_capacity * 0.5 THEN '마감임박'
            ELSE '여유'
        END AS status
    FROM g5_lms_course c
    ORDER BY fill_rate DESC
";

$result = sql_query($sql_stats);
$course_stats = [];

while ($row = sql_fetch_array($result)) {
    $course_stats[] = [
        'id' => (int)$row['course_id'],
        'title' => $row['title'],
        'max' => (int)$row['max_capacity'],
        'current' => (int)$row['current_enrolled'],
        'fill_rate' => (float)$row['fill_rate'],
        'status' => $row['status']
    ];
}

echo json_encode([
    'status' => 'success',
    'data' => ['courses' => $course_stats]
]);
exit;
?>