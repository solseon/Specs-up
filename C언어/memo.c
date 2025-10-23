#include <stdio.h>

double Circle(double r) {
    return 2 * 3.14 * r;
}

int main(void) {
    printf("반지름이 5인 원의 둘레는: %lf", Circle(5));
    return 0;
}