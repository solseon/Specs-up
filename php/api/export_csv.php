<?php
error_reporting(E_ALL & ~E_NOTICE & ~E_WARNING);
include_once(__DIR__ . '/../html/common.php');

// 관리자 권한 확인
if (!$is_member || $member['mb_level'] < 10) {
    exit('권한이 없습니다.');
}

// 1. 파일명 설정
$filename = "course_stats_" . date('Ymd_His') . ".csv";

// 2. HTTP 헤더 설정: 브라우저가 이 응답을 파일 다운로드로 인식하게 함
header('Content-Type: text/csv; charset=utf-8');
header('Content-Disposition: attachment; filename="' . $filename . '"');

// 3. CSV 스트림 오픈
$output = fopen('php://output', 'w');

// 4. CSV 헤더 추가 (엑셀에서 한글 깨짐 방지를 위해 BOM 추가)
fprintf($output, chr(0xEF).chr(0xBB).chr(0xBF));
fputcsv($output, ['강의 ID', '강의명', '정원', '현재 인원', '수강률(%)', '상태']);

// 5. 데이터 조회 및 CSV 기록
$sql = "SELECT course_id, title, max_capacity, current_enrolled, 
        ROUND((current_enrolled / max_capacity) * 100, 1) AS fill_rate 
        FROM g5_lms_course";
$result = sql_query($sql);

while ($row = sql_fetch_array($result)) {
    $status = ($row['current_enrolled'] >= $row['max_capacity']) ? '마감' : '여유';
    fputcsv($output, [
        $row['course_id'], 
        $row['title'], 
        $row['max_capacity'], 
        $row['current_enrolled'], 
        $row['fill_rate'], 
        $status
    ]);
}

fclose($output);
exit;
?>