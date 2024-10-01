#include <iostream>

using namespace std;

int main()
{
    int *num = new int[5]; // 동적 할당 부분
    int sum = 0;
    for (int i = 0; i < 5; i++) {
        cin >> num[i];
        sum += num[i];
    }
    cout << "평균" << (float)sum / 5 << "\n" ;
    delete [] num; // 소멸
}