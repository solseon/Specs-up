#include <stdio.h>

void sub() {
    static int scount = 0;
    // int acount = 0;

    printf("scount = %d\t", scount);
    // printf("acount = %d\n", acount);
    scount++;
    // acount++;

}

int main(void) {

    sub();
    sub();
    sub();
    return 0;
}
// acount 빠져있는게 시험문제 정답