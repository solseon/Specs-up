#include <stdio.h>
#include <time.h>

int main(void)
{
  struct tm {
    int tm_year;
    int tm_mon;
    int tm_mday
  };

  printf("%d.%d.%d", tm.tm_year+1900, tm.tm_mon, tm.tm_mday);
}