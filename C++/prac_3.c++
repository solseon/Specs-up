#include <iostream>
using namespace std;

class Person {
    int id = 1;
    double weight = 20.5;
    string name = "Grace";

public:
    Person() {};
    Person(int id, string name) { this->id = id; this->name = name; };
    Person(int id, string name, double weight) { this->id = id; this->name = name; this->weight = weight; };
    void show() { cout << id << ' ' << weight << ' ' << name << endl; }
};

int main() {
    Person grace, ashley(2, "Ashley"), helen(3, "Helen", 32.5);
    grace.show();
    ashley.show();
    helen.show();
}