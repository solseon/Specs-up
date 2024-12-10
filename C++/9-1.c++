// 파생 클래스에서 함수를 재정의하는 사례
#include <iostream>
using namespace std;

class Base {
public:
    void f() { cout << "Base::f() called" << endl; }
};

class Derived : public Base {
public: // Base의 멤버 함수 f()를 재정의
    void f() { cout << "Derived::f() called" << endl; } 
};

void main() {
    Derived d, *pDer;
    pDer = &d; // 객체 d를 가르킨다.
    pDer->f(); // Derived의 멤버 f() 호출

    Base* pBase;
    pBase = pDer; // 업캐스팅. 객체 d를 가르킨다.
    pBase->f(); // Base의 멤버 f() 호출
}