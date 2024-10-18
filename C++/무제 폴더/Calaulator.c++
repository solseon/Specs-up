// Calaulator.cpp
#include <iostream>
using namespace std;

#include "Adder.h"
#include "Calculator.h"

void Calculator::run() {
    cout << "두 개의 수를 입력하세요>>";
    int a,b;
    cin >> a >> b;  // 정수 두 개 입력
    Adder adder(a, b);  // 덧셈기 생성
    cout << adder.process() << endl; // 덧셈 계산
}