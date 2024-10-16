#include <iostream>
using namespace std;

class Rectangle {
public:
    int width, height; // 너비와 높이 멤버 변수 선언
    Rectangle();    // 생성자 선언
    Rectangle(int length);  // 매개 변수 1개 생성자 선언
    Rectangle(int x, int y);    // 매개 변수 2개 생성자 선언
    bool isSquare();    // 멤버 함수 선언 ( bool은 참 거짓을 판단하는 C++ 기본 타입)
};

Rectangle::Rectangle() {
    width = height = 1;
} /* 너비와 높이 1인 생성자 
    Rectangle::Rectangle() : Rectangle(1) { } 로 위임 생성자도 가능.*/

Rectangle::Rectangle(int lenght) {
    width = height = lenght;
} /*너비와 높이가 같은 생성자 
    Rectangle::Rectangle(int lenght) : Rectangle(lenght) { } 로 위임 생성자도 가능.*/

Rectangle::Rectangle(int x, int y) {
    width = x, height = y;
}

// 정사각형이면 true 아니면 false를 리턴하는 멤버 함수
bool Rectangle::isSquare() {   
    if(width == height) return true;
    else return false;
}

int main() {
    Rectangle rect1;
    Rectangle rect2(3,5);
    Rectangle rect3(3);

    if(rect1.isSquare()) cout << "rect1은 정사각형이다." << endl;
    if(rect2.isSquare()) cout << "rect2은 정사각형이다." << endl;
    if(rect3.isSquare()) cout << "rect3은 정사각형이다." << endl;
}