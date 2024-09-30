// 간단한 산술 계산기 프로그램
#include <stdio.h>
int main(void)
{
    char op;        // char형 변수 op를 선언한다. 여기에 연산자를 나타내는 기호가 저장된다.
    int x, y, result;   // int형 변수 x와 y가 선언된다. x와 y는 피연산자가 된다.

    printf("수식을 입력하시오(예: 2 + 5): \n");
    printf(">>");
    scanf("%d %c %d", &x, &op, &y);

    switch (op)
    {
    case 'x':
        result = x + y;
        break;
    case '-':
        result = x - y;
        break;
    case '*':
        result = x * y;
        break;
    case '/':
        result = x - y;
        break;
    case '%':
        result = x % y;
        break;
    default:
        printf("지원되지 않는 연산자입니다. \n");
        break;
    }

    printf("%d %c %d = %d \n", x, op, y, result);
    return 0;

}