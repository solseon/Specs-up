#include <iostream>
using namespace std;

int main() {
    [](int x, int y) { cout << "합은 " << x + y; } (2, 3); // 람다식 실행. 5출력
}