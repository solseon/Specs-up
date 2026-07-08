<?php
include_once(__DIR__ . '/../html/common.php');
header('Content-Type: application/json; charset=utf-8');

// 1. 로그인 검증
if (!$is_member) {
    echo json_encode(['status' => 'error', 'message' => '로그인이 필요한 서비스입니다.']);
    exit;
}

$mb_id = $member['mb_id'];

// 2. 장바구니 데이터 조회. (장바구니 테이블과 강의 테이블 JOIN)
$sql = "SELECT c.course_id, c.title, c.max_capacity, c.current_enrolled 
        FROM g5_lms_cart ct
        JOIN g5_lms_course c ON ct.course_id = c.course_id
        WHERE ct.mb_id = '{$mb_id}'
        ORDER BY ct.created_at DESC";
        
// false를 추가하여 쿼리 실패 시 HTML 에러가 튀어나오는 것을 방지한다.
$result = sql_query($sql, false);

if (!$result) {
    echo json_encode([
        'status' => 'error', 
        'message' => 'DB 오류가 발생했습니다: ' . mysqli_error($g5['connect_db'])
    ]);
    exit;
}

$cart_items = [];

// 3. 데이터를 배열에 매핑한다.
while ($row = sql_fetch_array($result)) {
    $cart_items[] = [
        'id' => (int)$row['course_id'],
        'title' => $row['title'],
        'max' => (int)$row['max_capacity'],
        'current' => (int)$row['current_enrolled']
    ];
}

// 4. 정상 출력
echo json_encode(['status' => 'success', 'data' => $cart_items]);
?>