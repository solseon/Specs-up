// 예외 상황에 대한 대처가 없는 프로그램 사례
/* 밑수(base)와 지수부(exponent)를 매개 변수로 지수 값을 계산하는 함수 사례이다. 이 함수는 양수
입력만 처리하도록 작성되어 있어  2의-3승에 대해 1이라고 계산하는 오류를 범하고 있다.*/
#include <iostream>
using namespace std;

int getExp(int base, int exp) { // base의 exp 지수승을 계산하여 리턴
    int value=1;
    for(int n=0; n<exp; n++)
        value = value * base; // base를 exp번 곱하여 지수 값 계산
    return value;
}

int main() {
    int v= getExp(2, 3); // 2의 3승 = 8
    cout << "2의 3승은  " << v << "입니다." <<endl;
    int e = getExp(2, -3); // 2의 -3승은 ?
    cout << "2의 -3승은 " << e << "입니다." << endl;
}