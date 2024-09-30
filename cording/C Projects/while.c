// While 문
#include <stdio.h>

int main(void)
{
    int i = 0;

    while (i < 5) // 조건식이 안에 들어간다 While문은 조건식의 값이 참인 동안에는 주어진 문장을 반복 실행한다. 조건식의 값이 거짓이 되면 반복을 중단한다.
    {
        printf("Hello World!\n");
        i++;    /*i++;이 없다면 i가 계속 0이기 때문에 반복은 무한히 계속될 것이다. 이러한 현상을 무한 루프(infinite loop)라고 한다. 
                이러한 무한 루프는 절대로 피해야할 오류로 반복문을 사용할깨에는 반드시 반복이 종료되는지를 확인해야한다.*/ 
    }
    
    return 0;
}