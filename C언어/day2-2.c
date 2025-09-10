#include <stdio.h>
#define _CRT_SECURE_NO_WARNINGS

int main(void) {
    int i, n; 
    double sum;          //변수 선언

    printf("정수를 입력하시오:"); // 입력 안내 메시지 출력
    scanf("%d", &n);            // 정수값 입력

    i = 1;                    // 변수 초기화
    sum = 1;

    while( i <= n) {
        sum *= i;    //sum = sum +i;와 같다.
        i++;        // i = i + 1과 같다.
    }

    printf("1부터 %d까지의 곱(팩토리얼)은 %lf입니다\n", n, sum);
    return 0;
}