#include <stdio.h>

// 1
void problem1() {
    int a = 5;
    int b = 10;
    int* p = &a; // a의 주소값을 포인터 b에 저장

    *p = *p + b; // p가 가르키는 곳의 값 + b를 p가 가르키는곳에 값을 변경(역참조이기때문에 원본의 값도 변경 == a값도 같이 변경)
    p = &b; // p자체는 b를 가리키도록 다시 대입
    *p = *p - a; // 

    printf("%d %d\n", a, b);
}

// 2
void problem2() {
    int arr[5] = {10, 20, 30, 40, 50};
    int* p = arr; // 배열 arr의 첫번째값을 포인터로 설정한다.

    for(int i = 0; i < 5; i++) {
        *(p + i) += i * 2; // 기존 배열에 있는원본 값 + i*2의 값을 다시 원본 배열에 넣는다
    }
    // arr[5] = {10, 22, 34, 46, 58}

    printf("%d %d %d\n", arr[0], arr[2], arr[4]);
}

// 3
void modify(int* x, int y) {
    *x = *x * 2; // 원본값을 바꾸기 때문에 함수를 사용한 변수의 값도 아예 바뀐다.
    y = y +100; // 지역변수이기때문에 이 함수의 지역에서느 y만 바뀌고 사용했을땐 바뀌지 않는다
}

void problem3() {
    int a = 5, b = 5;
    modify(&a, b);
    printf("%d %d\n", a, b);
}

// 4
void problem4() {
    int a = 100;
    int* p = &a; // a의 주소값을 가르키는 p
    int** pp = &p; // p의 주소값을 가르킨다

    **pp = 200; // 두번 역참조라서 a의 원본값을 200으로 설정
    *p = *p +50; // a의 원본 값을 200 -> 250으로 설정

    printf("%d %d %d\n", a, *p, *pp);
    // pp -> p가 저장된 위치(주소)
    // *pp -> pp를 한 번 따라감 -> p와 같음
    // **pp -> pp를 두 번 따라감 -> a와 같음
}

// 5
struct Point {
    int x, y;
};

void problem5() {
    struct Point pt = {1, 2};
    struct Point* p = & pt;

    p->x = p->x + 10;
    (*p).y = (*p).y * 3;

    printf("%d %d\n", pt.x, pt.y);
}

// 6
struct Item {
    char name[10];
    int price;
};

void problem6() {
    struct Item list[3] = {{"A", 100}, {"B", 200}, {"C", 300}};
    struct Item* p = list;

    for(int i = 0; i < 3; i++){
        (p + i)->price += (i + 1) * 10;
    }
    // price 값을 순서대로 기존 price값 + (i + 1) * 10 한 값을 price값으로 정한다.
    // list[3] = {{"A", 110}, {"B", 220}, {"C", 330}}이 된다.

    printf("%d %d %d\n", list[0].price, list[1].price, list[2].price);
}

void test() {
    int ary[3];
    int s = 0;

    *(ary + 0) = 1;
    ary[1] = *(ary + 0) + 2;
    ary[2] = *ary + 3;

    for (int i =0 ; i < 3; i++) {
        s  = s + ary[i];
    }

    printf("%d", s);
}
