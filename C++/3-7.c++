// Circle 클래스에 소멸자 작성 및 실행
#include <iostream>
using namespace std;

class Circle {
public:
    int radius;
    Circle();
    Circle(int r);
    ~Circle(); // 소멸자 선언
    double getArea();
};

Circle::Circle() {  // Circle::Circle() : Circle(1) { } 로 위임해도됨
    radius = 1;
    cout << "반지름" << radius << "원 생성" << endl;
}

Circle::Circle(int r) {
    radius = r;
    cout << "반지름" << radius << "원 생성" << endl;
}


Circle::~Circle() { // 소멸자 구현
     cout << "반지름" << radius << "원 소멸" << endl;
}

double Circle::getArea() {
    return 3.14*radius*radius;
}

int main() {
    Circle donut;
    Circle pizza(30);
    return 0; /* main() 함수가 종료하면 main() 함수의 스택에 생성된
                 pizza,donut 객체가 소멸된다*/
}