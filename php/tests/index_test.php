<?php
include_once(__DIR__ . '/../html/common.php');

$target_mb_id = 'user_dummy_777';

echo "<h1>조회 성능 테스트</h1>";

$start_time = microtime(true);

// 특정 유저의 수강 내역을 조회한다.
$sql = "SELECT * FROM g5_lms_enrollment WHERE mb_id = '{$target_mb_id}'";
$result = sql_query($sql);

$count = 0;
while ($row = sql_fetch_array($result)) {
    $count++;
}

$end_time = microtime(true);
$duration = number_format($end_time - $start_time, 5);

echo "조회된 데이터 수: {$count}건<br>";
echo "쿼리 소요 시간: <b>{$duration} 초</b><br>";
?>