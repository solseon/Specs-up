#include <stdio.h>

int main(void) {

    int i;
    int score[5] = {10, 20, 30, 40, 50};

    // score[0] = 10;
    // score[1] = 20;
    // score[2] = 30;
    // score[3] = 40;
    // score[4] = 50;

    for(i = 0; i < 5; i++) {
        printf("score[%d] = %d\n", i, score[i]);
    }

    return 0;

}