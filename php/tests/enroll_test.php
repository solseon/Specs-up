<?php
// 0. 시스템 초기화 및 로직 수행 (여기서는 아무것도 echo 하지 않는다.)
include_once(__DIR__ . '/../html/common.php');

$mb_id = 'user_' . rand(1000, 9999);
$course_id = 1;
$result_msg = "";

// 1. 트랜잭션 시작 (이후 모든 작업은 원자적(Atomic)으로 처리됨)
sql_query("START TRANSACTION");

// 2. FOR UPDATE 락 사용 (중요)
// 이 SELECT 문이 실행되는 순간, 정원이 찰 때까지 해당 row를 다른 세션이 건드리지 못하게 잠급니다.
$sql = "SELECT max_capacity, current_enrolled FROM g5_lms_course WHERE course_id = '$course_id' FOR UPDATE";
$row = sql_fetch($sql);

if ($row['current_enrolled'] >= $row['max_capacity']) {
    sql_query("ROLLBACK"); // 락 해제
    echo "수강신청 실패: 정원이 꽉 찼습니다. (현재: {$row['current_enrolled']}/{$row['max_capacity']})";
    exit;
} else {
    // 3. 인원 증가 및 등록
    sql_query("UPDATE g5_lms_course SET current_enrolled = current_enrolled + 1 WHERE course_id = '$course_id'");
    sql_query("INSERT INTO g5_lms_enrollment (mb_id, course_id) VALUES ('$mb_id', '$course_id')");
    // 4. 트랜잭션 커밋 (최종 반영 및 락 해제)
    sql_query("COMMIT");
    $result_msg = "수강신청 성공: {$mb_id} 학생이 등록되었습니다.";
}
// 5. 모든 로직이 끝난 후 단 한 번만 화면에 출력
echo $result_msg;
?>