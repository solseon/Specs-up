// Rectangle 클래스 만들기
#include <iostream>
using namespace std;

class Rectangle {
public:
    int width;
    int height;
    int getArea();
};

int Rectangle::getArea() {
    return width*height;
}

int main() {
    Rectangle rect; // rect 객체 생성
    rect.width = 3;
    rect.height = 5;
    cout << "사각형의 면적은" << rect.getArea() << endl;

}