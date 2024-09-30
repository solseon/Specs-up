// 나머지 연산자 프로그램
#include <stdio.h>
#define SEC_PER_MINUTE 60 // #define문을 이용하여 SEC_PER_MINUTE라는 기호상수를 정의한다.
   
 int main(void)
 {
   int input, minute, second;

   printf("초를 입력하시오: ");
   scanf("%d", &input);

   minute = input / SEC_PER_MINUTE; // 초단위의 시간이 몇 분에 해당하는 지를 알기위하여 입력받은 초단위의 입력 시간을 SEC_PER_MINUTE로 나눈다.
   second = input % SEC_PER_MINUTE; /* 입력받은 시간이 몇 초인지를 알기위해서는 먼저 입력값에서 분에 해당하는 것들을 제거하고 남은 나머지를 알아야한다. 
   따라서 입력받은 시간을 SEC_PER_MINUTE로 나누어서 나온 나머지가 초에 해당한다. */
   
   printf("%d초는 %d분 %d초입니다. \n", input, minute, second);
   return 0;

 }