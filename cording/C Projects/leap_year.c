// 윤년 판단 프로그램 (if-else)
#include <stdio.h>

int main(void)
{
    int year;

    printf("연도를 입력하시오: ");
    scanf("%d", &year);

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) // 연산자 한번씩 해석해보는 연습하기
    {
        printf("%d년은 윤년입니다.\n", year);
    }
    else
    {
        printf("%d년은 윤년이 아닙니다.\n", year);
    }
    
    return 0;
}

// 윤년 판단 프로그램 (논리 연산자)

int year(void)
{
    int year, result;

    printf("연도를 입력하시오: ");
    scanf("%d", &year);

    result = ((year % 4 == 0) &&(year % 100 != 0)) || (year % 400 == 0);
    printf("result=%d \n", result);

    return 0;
}