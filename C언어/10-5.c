#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define ROWS 3
#define COLS 5

int main(void) {
    int  s[ROWS][COLS]; // 2차원 배열 선언
    int x, y; // 2개의 인덱스 변수
    srand((unsigned)time(NULL)); // 난수 생성기 초기화

    for(x = 0; x < ROWS; x++) {
        for(y = 0; y < COLS; y++) {
            s[x][y] = rand() % 100; // 어떤 수를 100으로 나눈 나머지 따라서 0~99 까지 난수 발생
        }
    }

    for(x = 0; x < ROWS; x++) {
        for(y = 0; y < COLS; y++) {
            printf(" %02d ", s[x][y]);
        }
        printf("\n");
    }

    return 0;
}