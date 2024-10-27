#include <iostream>
using namespace std;

class Circle {
    int radius;
public:
    Circle();
    Circle(int r);
    double getArea();
};

Circle::Circle() : Circle(1) { }

Circle::Circle(int r) {
    radius = r;
}

double Circle::getArea() {
    return 3.14*radius*radius;
}

int main() {
    Circle pizza;
    double area = pizza.getArea();
    cout << "pizza의 면적은 "<< area << endl;

    Circle donut(40);
    area = donut.getArea();
    cout << "donut의 면적은 " << area << endl;
 };
