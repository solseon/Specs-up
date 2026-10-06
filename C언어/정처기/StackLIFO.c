#include <stdio.h>
#define MAX 5
// 스택(Stack) - LIFO(후입선출)
//  : 나중에 넣은 것이 먼저 나오는(Last In First Out) 자료구조. 접시를 쌓아올리는 것과 같아서, 맨위(top)에만 넣고(push) 뺄(pop) 수 있다.

int stack[MAX];
int top = -1;   // 비어있으면 -1

void push(int val) {
    if (top == MAX - 1) { printf("Stack Full\n"); return; }
    stack[++top] = val; // top을 먼저 1 증가시키고 그 자리에 저장
}
int pop() {
    if (top == -1) { printf("Stack Empty\n"); return -1;}
    return stack[top--];    // 현재 top의 값을 반환하고, top을 1 감소
}

int main() {
    push(1); push(2); push(3);  // stack: [1, 2, 3], top=2 
    prinf("%d\n", pop());       // 3 (가장 최근에 넣은 것부터 나옴)
    prinf("%d\n", pop());       // 2
    push(10);                   // stack: [1, 10], top = 1
    prinf("%d\n", pop());       // 10
    prinf("%d\n", pop());       // 1
    return 0;
}