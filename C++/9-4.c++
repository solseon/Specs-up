// 21101830 안수범
#include <iostream>
using namespace std;

class Shape {
public:
    virtual void draw(){
        cout << "--Shape--";
    }
};

class Circle : public Shape {
public:
    int x;
    virtual void draw() {
        Shape::draw();
        cout << "Circle" << endl;
    }
};

int main() {
    Circle circle;
    Shape * pShape = &circle;

    pShape->draw();
    pShape->Shape::draw();
}