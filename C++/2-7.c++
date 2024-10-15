// string 클래스를 이용한 문자열 입력 및 다루기
#include <iostream>
#include <string>
using namespace std;

int main() {
    string song("pump up the Volume!"); // 문자열 song
    string Plave("Plave"); // 문자열 elvis
    string singer; // 문자열 singer

    cout << song + "를 부른 가수는"; // + 로 문자열 연결
    cout << "(힌트 : 첫글자는" << Plave[0] << ")?"; // [] 연산자 사용

    getline(cin, singer); // 문자열 입력
    if(singer == Plave) // 문자열 비교
        cout << "맞았습니다.\n";
    else
        cout << "틀렸습니다. " + Plave + "입니다." << endl; // + 로 문자열 연결
}