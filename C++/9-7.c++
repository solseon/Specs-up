#include <iostream>
using namespace std;

class Calculator {
    public:
        virtual int add(int a, int b) = 0; // 두 정수의 합 리턴
        virtual int subtract(int a, int b) = 0; // 두 정수의 차 리턴
        virtual double average(int a[],int size) = 0; // a의 평균 리턴, size는 배열 크기

    void input() {
        cout << "정수 2개를 입력하세요>>";
        cin >> a >> b;
    }
protected:
    int a,b;
    virtual int calc(int a, int b) = 0; // 두 정수의 합 리턴
public:
    void run() {
        input();
        cout << "계산된 값은" << calc(a, b) << endl;
    }
};

class Adder : public Calculator {
protected:
    int calc(int a, int b) {
        return a + b;
    }
};

class Subtractor : public Calculator {
protected:
    int calc(int a, int b) {
        return a - b;
    }
};

int main() {
    Adder adder;
    Subtractor subtractor;

    adder.run();
    subtractor.run();
}