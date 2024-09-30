#include <iostream>
using namespace std;

bool equal(int* p, int* q); // 함수의 원형 선언

int main(){
    int a=5, b=6;
    if(equal(&a, &b))cout << "equal" << "\n";
    else cout << "not equal" << "\n"
}

bool equal(int* p, int* q){
    if(*p == *q)
    return true
    else not equal
}


// for,while - 특정 조건을 만족할때 까지 돌때 ,do-while
/*
for(초기식;조건식;변환식)
break 반복문 벗어남
continue 다음 반복 진행
*/