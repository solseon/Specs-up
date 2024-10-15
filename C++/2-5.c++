// strcmp를 이용한 문자열 비교 및 cstring 헤더파일 사용
#include <iostream>
#include <cstring> // strcmp() 함수를 사용하기 위한 헤더 파일
using namespace std;

int main() {
    char password[11];
    cout << "프로그램을 종료하려면 암호를 입력하세요." << endl;

    while(true) {
        cout << "암호:";
        cin >> password;
        if(strcmp(password, "C++") == 0) {
            cout << "프로그램을 정상 종료합니다." << endl;
            break;
        }
        else
            cout << "암호가 틀립니다~~" << endl;
    }
}