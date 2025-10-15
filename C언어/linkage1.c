#include <stdio.h>

int all_files;
static int this_file;
extern void sub();

int main() {
    sub();
    printf("%d\n", all_files);
    return 0;
}