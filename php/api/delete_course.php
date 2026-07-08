<?php
// 시스템 코어 로드
include_once(__DIR__ . '/../html/common.php');
header('Content-Type: application/json; charset=utf-8');

// 1. POST 데이터 수신
$data = json_decode(file_get_contents('php://input'), true);
$course_id = (int)$data['id'];

// 2. 권한 검증: 최고관리자(10)만 삭제 가능
if (!$is_member || $member['mb_level'] < 10) {
    echo json_encode(['status' => 'error', 'message' => '삭제 권한이 없습니다.']);
    exit;
}

// 3. 데이터 무결성 검증 (선택 사항)
// 해당 강의에 이미 수강 신청한 학생이 있는지 확인하여 에러 방지
$check_sql = "SELECT count(*) as cnt FROM g5_lms_enrollment WHERE course_id = '{$course_id}'";
$row = sql_fetch($check_sql);
if ($row['cnt'] > 0) {
    echo json_encode(['status' => 'error', 'message' => '수강 신청자가 존재하여 삭제할 수 없습니다.']);
    exit;
}

// 4. 진짜 삭제 쿼리 실행
$sql = "DELETE FROM g5_lms_course WHERE course_id = '{$course_id}'";
if (sql_query($sql)) {
    echo json_encode(['status' => 'success', 'message' => '데이터베이스에서 완전히 삭제되었습니다.']);
} else {
    echo json_encode(['status' => 'error', 'message' => '삭제 실패: DB 오류']);
}
?>