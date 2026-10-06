// 연결 리스트(Linked List)
// : 배열처럼 데이터를 순서대로 저장하지만, 메모리 상에서 연속되어 있지 않고 각 데이터(노드)가 "다음 노드의 주소"를 들고 있어서
//   화살표처럼 연결된 자료구조.배열과 달리 크기를 미리 정하지 않아도 되고, 중간에 데이터를 넣고 빼기가 쉽다.
// 구조: 노드 하나는 "데이터 + 다음 노드를 가리키는 포인터"로 이루어진 구조체이다.

// 예제 1.
#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next; // 다음 노드의 주소를 저장
};

// 맨 앞에 새 노드를 삽입하는 함수
struct Node* insertFront(struct Node* head, int val) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = val;
    newNode->next = head;   // 새 노드가 기존 head를 가리키게 함
    return newNode;         // 새 노드가 새로운 head가 됨
}

void printList(struct Node* head) {
    struct Node* cur = head;
    while (cur != NULL) {
        printf("%d", cur->data);
        cur = cur->next;
    }
    printf("\n");
}

int main() {
    struct Node* n1 = (struct Node*)malloc(sizeof(struct Node));
    struct Node* n2 = (struct Node*)malloc(sizeof(struct Node));
    struct Node* n3 = (struct Node*)malloc(sizeof(struct Node));

    n1->data = 10; n1->next = n2;       // n1 -> n2
    n2->data = 20; n2->next = n3;       // n2 -> n3
    n3->data = 30; n3->next = NULL;     // n3가 마지막 노드(다음이 없음)

    struct Node* head = n1;         // head: 첫 번째 노드를 가리키는 시작점

    struct Node* cur = head;
    while (cur != NULL) {           // 다음 노드가 없을 때까지 순회
        printf("%d ", cur->data);
        cur = cur->next;
    }
    printf("\n");

    free(n1); free(n2); free(n3);   // malloc한 건 반드시 free
    return 0;
}
