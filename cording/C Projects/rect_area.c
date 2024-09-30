/*직사각형의 둘레와 면적을 구하는 프로그램*/
#include <stdio.h>

int main(void)
{
    double w;           //사각형의 가로
    double h;           //사각형의 세로
    double area;        //사각형의 넓이
    double perimeter;   //사각형의 둘레

    printf("사각형의 가로길이를 입력하시오: ");
    scanf("%lf", &w);

    printf("사각형의 세로길이를 입력하시오: ");
    scanf("%lf", &h);

    area=w*h;
    perimeter=2*(w+h);

    printf("사각형의 넓이: %lf\n", area);
    printf("사각형의 둘레: %lf\n", perimeter);

    return 0;
}