// 구구단출력프로그램 goto 문
#include <stdio.h>

int main(void)
{
    int i = 1;

    loop:       // loop라는 이름의 레이블을 현 위치에 정의한다.
    printf("%d * %d = %d \n", 4, i, 4 * i);
    i++;
    if( i == 10 ) goto end; // i가 10이 되면 레이블 end로 점프한다.
    goto loop;  // 레이블 loop로 점프한다.

    end:
        return 0;
}

/* goto문이 필요 없는 이유 
    while이나 for를 사용하는 편이 훨씬 알기 쉽고 간결하다
    하지만 가끔 goto 문이 유용한 경우가 있다.
    특히 중첩된 반복문에서 오류가 발생하여서 외부로 빠져 나가려고 할때에는
    goto 문으로 한 번에 나가는 것이 가장 효율적이다 .*/