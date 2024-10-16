#include <iostream>
using namespace std;

class Rectangle {
public:
    int width;
    int height;
    Rectangle();
    Rectangle(int x);
    Rectangle(int x, int y);
    bool isSquare();
};

bool Rectangle::isSquare() {
    if(width = height) return true;
    else return false;
}