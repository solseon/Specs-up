// 생성자에서 다른 생성자 호출 연습(위임 생성자 만들기 연습)
#include <iostream>
using namespace std;

class Circle {
public:
    int radius;
    Circle();
    Circle(int r);
    double getArea();
};

Circle::Circle() : Circle(1) { }

Circle::Circle(int r) {
    radius = r;
    cout << "반지름" << radius << "원 생성" << endl;
}

double Circle::getArea() {
    return 3.14*radius*radius;
}

int main() {
    Circle donut;
    double area = donut.getArea();
    cout << "donut 면적은" << area << endl;

    Circle pizza(30);
    area = pizza.getArea();
    cout << "pizza 면적은" << area << endl;
}