#include <stdio.h>

int main(void) {
    //1단부터 9단까지 출력
    for (int x =1; x <= 9; x++){
        printf("%d단:\n", x);
        for(int y = 1; y <= 9; y++){
            printf("%d x %d = %d\n", x, y, x*y);
        }
        printf("\n"); // 각 단 사이에 공백 줄 추가
    }
    return 0;
}