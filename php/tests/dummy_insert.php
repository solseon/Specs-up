<?php
// 시스템 코어를 로드한다.
include_once(__DIR__ . '/../html/common.php');
ini_set('display_errors', 1);
error_reporting(E_ALL);

// 대량 데이터 삽입 시 PHP 타임아웃을 방지하기 위해 실행 시간을 늘린다.
ini_set('max_execution_time', 300);

$total_rows = 100000;
$chunk_size = 5000; 

echo "<h1>더미 데이터 벌크 삽입 시작</h1>";
ob_flush(); flush(); // 화면에 즉시 출력한다.

$start_time = microtime(true);

for ($i = 0; $i < $total_rows; $i += $chunk_size) {
    $values = [];
    for ($j = 0; $j < $chunk_size; $j++) {
        // 난수를 활용하여 다양한 유저와 강의 데이터를 생성한다.
        $mb_id = 'user_dummy_' . rand(1, 50000);
        $course_id = rand(1, 100);
        $values[] = "('{$mb_id}', '{$course_id}')";
    }
    
    // 배열을 문자열로 결합하여 다중 삽입 쿼리를 구성한다.
    $values_str = implode(',', $values);
    // 1. INSERT 대신 INSERT IGNORE를 사용하여 중복 충돌 시 스킵하도록 한다.
    $sql = "INSERT IGNORE INTO g5_lms_enrollment (mb_id, course_id) VALUES {$values_str}";
    // 2. sql_query의 두 번째 파라미터로 false를 주어 그누보드가 강제로 스크립트를 죽이는 것을 차단한다.
    sql_query($sql, false);
}

$end_time = microtime(true);
$duration = number_format($end_time - $start_time, 3);

echo "데이터 10만 건 삽입 완료. (소요 시간: {$duration}초)<br>";
?>