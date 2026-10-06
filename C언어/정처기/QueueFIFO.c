#include <stdio.h>
#define MAX 5
// 큐(Queue) - FIFO(선입선출)
//  : 먼저 넣은 것이 먼저 나오는(First In First Out) 자료구조, 줄을 서서 기다리는 것과 같아서, 
//    귀(rear)에 넣고 앞(front)에서 뺀다.

int queue[MAX];
int front = -1,rear = -1;

void enqueue(int val) {
    if(rear == MAX -1) {printf("Queue Full\n"); return;}
    if(front == -1) front = 0;  // 처음 넣을 떄 front를 0으로 설정
    queue[++rear] = val;
}
 int dequeue() {
    if (front == -1 || front > rear) {printf("Queue Empty\n"); return;}
    return queue[front++];  // front 위치의 값을 반환하고 front를 1증가
 }

 int main() {
    enqueue(1); enqueue(2); enqueue(3); // queue: [1, 2,3], front =0, rear=2
    printf('%d\n', dequeue());      // 1 (가장 먼저 넣은 것부터 나옴)
    printf('%d\n', dequeue());      // 2
    enqueue(4);                     // queue: [1, 2, 3, 4], rear=3
    printf('%d\n', dequeue());      // 3
    printf('%d\n', dequeue());      // 4
    return 0;
 }