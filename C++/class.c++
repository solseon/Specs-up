#include <iostream>
using namespace std;

class Circle {
    // 클래스 선언부
public: // 접근 지정자 public = 이하의 모든 멤버는 다른 접근 지정자가 선언될 때까지 public 접근 지정
    // 클래스 선언과 구현을 분리하는 이유는 클래스의 재사용을 위해서이다.
    // 클래스 선언부
    int radius; // 멤버 변수
    // int x = 5; 와 같이 클래스 선언부에서 멤버 변수를 초기화할 수 있음.
    double getArea();  // 멤버 함수
};
    // 클래스 구현부
double Circle::getArea() {
    return 3.14*radius*radius;
}

int main() {
    Circle donut;   // donut 객체 생성 
    donut.radius = 1;   // donut의 멤버 변수 접근
    double area = donut.getArea(); // donut의 멤버 함수 호출
    cout << "donut 면적은" << area << endl;

    Circle pizza;
    pizza.radius = 30;
    area = pizza.getArea();
    cout << "pizza 면적은" << area << endl;

    Circle coin;
    coin.radius = 3;
    int xs = coin.getArea();
    cout << "coin 면적은" << xs << endl;
}



