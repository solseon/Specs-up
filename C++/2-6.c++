// cin.getline()을 이용하여 빈칸을 포함하는 문자열을 읽는  예를 보인다.
#include <iostream>
using namespace std;

int main() {
    cout << "주소를 입력하세요>>";

    char address[100];
    cin.getline(address, 100, '\n'); // 키보드로부터 주소 읽기

    cout << "주소는" << address << "입니다\n"; // 주소 출력
}