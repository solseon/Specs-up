// 키보드에서 문자열 입력받고 출력
#include <iostream>
using namespace std;

int main() {
    cout << "이름을 입력하세요>>";

    char name[11];
    cin >> name;

    cout << "이름은" << name << "입니다\n";
}