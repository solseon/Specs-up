/*변수에 관한 것들*/
#include <stdio.h>

int main(void)
{
    /*표준자료형은 정수형, 실수형, 문자형이 있다. 추가적으로 변수는 사용하기전에 선언되어야 한다*/
    int x;          //정수형 ex)short, int, long, long long
    float y;        //실수형 ex)float, double, long double
    char 수범;      //문자형 ex)char
    
    /*변수를 선언과 동시에 값을 넣는 방법은 변수 이름 뒤에 =을 붙이고 초기값을 적어 넣으면 된다. 이것을 변수의 초기화(initialization)라고 한다.*/
    x=100;  
    y=10;

    수범= x+y;
    printf("%d\n", 수범);

    return 0;
}

/*C언어에는 고유한 의미를 가지고 있는 특별한 단어가 있는데 그것이 키워드(keyword)이다 키워드는 예약어(reserved words)라고도 한다.*/
             /*키워드는 사용자가 정의하거나 사용하는 것이 금지되어있다.C언어에서는 다음과 같은 키워드가 있다.*/

     /*auto  double  int  struct  break  else  long  switch 
       case  enum  register  typedef  char  extern  return  union
       const  float  short  unsigned  continue  for  signed  void 
       default  goto  sizeof  volatile  do  if  static  while   */
    
