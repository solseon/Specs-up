// C언어에서는 제어식의 값에 따라서 여러 경로 중에서 하나를 선택할 수 있는 제어 구조인 switch 문이 제공된다.

/* switc문에서 주의할 점
    switc 문에서 제어식의 값은 반드시 정수값으로 계산되어야 한다는 점
    또한 상수이어야한다. 따라서 case 절에 실수나 변수, 수식, 문자열
    을 사용하는 것은 컴파일 오류이다.
    but 하나의 문자는 아스키 코드로 표현되고 아스키 코드는 정수이므로 사용이 가능하다
    하지만 문자열은 사용 불가능하다.*/

#include <stdio.h>

int main(void)
{

int number, x;


    switch (number)
    {
    case x:         // 변수는 사용할 수 없다.
        printf("x와 일치합니다. \n");
        break;
    case (x+2):     // 변수가 들어간 수식은 사용할 수 없다.
        printf("수식과 일치합니다. \n");
        break;
    case 0.001:     // 실수는 사용할 수 없다.
        printf("실수\n");
        break;
    case 'a':       // 문자는 사용할 수 있다.
        printf("문자\n");
        break;
    case "001":     // 문자열은 사용할 수 없다. 
        printf("문자열\n");
        break;
    default:
        printf("기본값\n");
        break;
    }
    /*break 문
    break 문이 없으면 선택된 case 절 안의 문장들을 실행한 다음,
    계속해서 다음 case 절의 문장들을 실행하게 된다.
    따라서 break 문을 생략하면 중대한 오류가 발생할 수 있다.
    따라서 모든 case 문은 일반적으로는 brea 문으로 끝내야 한다.*/

    /*default 문
    default 문은 어떤 case 문과도 일치되지 않는 경우에 선택되어 실행된다.
    생략은 가능하나 default 문이 없고 일치하는 case 문도 없다면 아무 것도 실행되지 않는다.
    따라서 미처 예상하지 못했던 값을 알아내기 위하여 가급적 default 문을 포함시키는 것이 좋다.*/
    
}