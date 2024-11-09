// Circle 클래스의 2차원 배열 선언 및 활용
#include <iostream>
using namespace std;

class Circle {
    int radius;
public:
    Circle() { radius = 1; }
    Circle(int r) { radius = r;}
    void setRadius(int r) { radius = r;}
    double getArea();
};

double Circle::getArea() {
    return 3.14*radius*radius;
}

int main() {
    Circle circle[2][3];

    circle[0][0].setRadius(1);
    circle[0][1].setRadius(2);
    circle[0][2].setRadius(3);
    circle[1][0].setRadius(4);
    circle[1][1].setRadius(5);
    circle[1][2].setRadius(6);

    for(int i=0; i<2; i++)  // 배열의 각 원소 객체의 멤버 접근
        for(int j=0; j<3; j++) {
            cout << "Circle [" << i << "," << j << "]의 면적은 ";
            cout << circle[i][j].getArea() << endl;
        }
}