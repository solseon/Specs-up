#include <iostream>
using namespace std;

class Exp {
    int number; // 밑 멤버 변수
    int ex; // 지수 멤버 변수
public:
    Exp();
    Exp(int a);
    Exp(int a, int b);
    int getValue();
    int getBase();
    int getExp();
    bool equals(Exp b);
};

Exp::Exp() : Exp(1) { }

Exp::Exp(int a) {
    number = a, ex = 1;
}

Exp::Exp(int a, int b) {
    number = a, ex = b;
}

int Exp::getValue() {
    int n = 1;
    for (int i = 0; i < ex; ++i)
        n *= number;
    return n;
}

// return 값을 굳이굳이 주는 이유는 멤버 변수 두개가 private이기 때문에 리턴값으로 꺼내주는거다.
int Exp::getBase() {
    return number;          
}

int Exp::getExp () {
    return ex;
}

bool Exp::equals(Exp b) {
    if (this->getValue() == b.getValue())
        return true;
    else
        return false;
}

int main() {
    Exp a(3, 2);
    Exp b(9);
    Exp c;

    cout << a.getValue() << ' ' << b.getValue() << ' ' << c.getValue() << endl;
    cout << "a의 베이스" << a.getBase() << ',' << "지수" << a.getExp() << endl;

    if(a.equals(b))
        cout << "same" << endl;
    else
        cout << "not same" << endl;
}


