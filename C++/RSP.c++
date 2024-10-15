// 상훈 수범의 가위바위보 프로그램
#include <iostream>
using namespace std;

int main() {
    string s;
    cout << "수범>>";
    cin >> s;

    string t;
    cout << "상훈>>";
    cin >> t;

    if ((s == "가위" && t == "보") || (s == "보" && t == "주먹") || (s == "주먹" && t == "가위"))
        cout << "수범이가 이겼습니다." << endl;
    else
        cout << "상훈이는 평생 이길 수 없습니다.. ㅠㅠ" << endl;
    
}