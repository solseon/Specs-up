// AND, OR, NOT 연산자 예제
#include <stdio.h>

int main(void)
{
    int x,y;

    printf("두개의 정수를 입력하시오: ");
    scanf("%d%d", &x, &y);      // 0이 아닌 정수는 참으로 간주되고 0은 거짓으로 간주된다. 여러가지 정수를 입력하여서 연산의 결과를 보도록 하자.

    printf("%d && %d의 결과값: %d\n", x, y, x && y);    // AND 연산
    printf("%d || %d의 결과값: %d\n", x, y, x || y );   // OR 연산
    printf("!%d의 결과값: %d\n", x, !x);    // NOT 연산

    return 0;
}