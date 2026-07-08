<?php
// 시스템 코어를 로드한다.
include_once(__DIR__ . '/../html/common.php');

echo "<h1>강의별 수강 인원 통계 (Top 10)</h1>";

$start_time = microtime(true);

// 38만 건의 데이터를 강의별로 그룹화하여 카운트하고, 수강생이 많은 순으로 정렬한다.
$sql = "SELECT course_id, COUNT(mb_id) AS student_count 
        FROM g5_lms_enrollment 
        GROUP BY course_id 
        ORDER BY student_count DESC 
        LIMIT 10";
        
$result = sql_query($sql);

// 결과를 시각적으로 확인하기 위해 HTML 테이블로 출력한다.
echo "<table border='1' style='border-collapse:collapse; text-align:center;'>";
echo "<tr><th style='padding:8px;'>강의 ID</th><th style='padding:8px;'>수강 인원</th></tr>";

while ($row = sql_fetch_array($result)) {
    echo "<tr>";
    echo "<td style='padding:8px;'>{$row['course_id']}</td>";
    echo "<td style='padding:8px;'>{$row['student_count']}명</td>";
    echo "</tr>";
}
echo "</table><br>";

$end_time = microtime(true);
$duration = number_format($end_time - $start_time, 5);

echo "쿼리 소요 시간: <b>{$duration} 초</b><br>";
?>