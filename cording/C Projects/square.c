// while 문을 이용한 제곱갑 출력 프로그램
#include <stdio.h>

int main(void)
{
    int n;

    printf("=============\n");
    printf("    n    n의 제곱 \n");
    printf("=============\n");

    n = 1;

    while (n <= 10)
    {
        printf("%5d %5d\n", n, n*n); //%5d는 %d앞에 몇칸을 띄어쓰기 할지 정해주는 것이다.
        n++;
    }
    
    return 0;
}