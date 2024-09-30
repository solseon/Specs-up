// 21101830 안수범
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <time.h>

//올해 생일이 지나지 않았다면 (이번 연도 - 태어난 연도 -1 = 현재 나이)
//올해 생일이 지났다면 (이번 연도 - 태어난 연도 = 현재 나이)

int main(void)
{   

    time_t timer;
    struct tm* t;
    timer = time(NULL);     // 1970년 1월 1일 0시 0분 0초부터 시작하여 현재까지의 초
    t = localtime(&timer);      // 포맷팅을 위해 구조체에 넣기

    int year,month,day;     // 사용자가 입력할 연도,월,일 변수
    int myear;

    printf("사용자의 생년월일을 입력하시오(20xx.xx.xx): ");
    scanf("%d.%d.%d", &year, &month, &day);     // 사용자의 생년월일을 변수에 저장

    myear = (t->tm_year + 1900) - year;     // 만나이 계산 (현재년도 - 출생년도)

    if ((month < (t->tm_mon + 1)))
    {
        printf("당신의 만 나이:%d\n", myear);
    }
    else if (day <= (t->tm_mday))
    {
        printf("당신의 만 나이:%d\n", myear);
    }
    else
    {
        printf("당신의 만 나이:%d\n", myear-1);  
    }
    
    
    return 0;
}