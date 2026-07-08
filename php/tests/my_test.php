<?php
// 그누보드 시스템 코어를 로드한다. 화면에 어떠한 출력도 발생하기 전에 실행되어야 헤더 관련 오류를 방지할 수 있다.
include_once('/var/www/html/html/common.php');

// 개발 단계에서의 명확한 디버깅을 위해 PHP 오류 출력을 활성화한다.
ini_set('display_errors', 1);
error_reporting(E_ALL);

// 1. 데이터 저장 로직이다.
$msg = "지투아이넷";
// SQL 인젝션을 방어하기 위해 특수문자를 이스케이프 처리한다.
$sql_msg = sql_real_escape_string($msg);

// 닫는 작은따옴표를 명확히 포함하여 완전한 SQL 쿼리문을 구성한다.
$sql = "INSERT INTO g5_my_log (message) VALUES ('$sql_msg')";
sql_query($sql);

// 2. 데이터 출력 로직이다. 모든 백엔드 연산이 끝난 후 최종적으로 화면에 렌더링한다.
echo "<h1>시스템 연결 및 테스트 성공</h1>";
$result = sql_query("SELECT * FROM g5_my_log ORDER BY id DESC");
while ($row = sql_fetch_array($result)) {
    echo "ID: {$row['id']} | 메시지: {$row['message']} | 시간: {$row['created_at']}<br>";
}
?>