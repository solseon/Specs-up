#include <stdio.h>

int main(void) {
    int i;

    for(i=0; i < 10; i++)
    {
        if(i%2 == 0) // 2의 배수
            continue;
        printf("%d", i);
    }
    return 0;
}