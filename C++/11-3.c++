// get(char*, int)을 이용한 문자열 입력
#include <iostream>
#include <cstring> // strcmp() 함수 사용때문
using namespace std;

int main() {
    char cmd[80];
    cout << "cin.get(char*, int)로 문자열을 읽습니다." << endl;
    while(true) {
        cout << "종료하려면 exit을 입력하세요 >> ";
        cin.get(cmd, 80); // <Enter> 키까지 문자열 읽기. 79개까지 문자 읽음
        if(strcmp(cmd, "exit") == 0) {
            cout << "프로그램을 종료합니다....";
            return 0;
        }
        else
            cin.ignore(1); // 버퍼에 남아 있는 <Enter> 키 ('\n') 제거
    }
}