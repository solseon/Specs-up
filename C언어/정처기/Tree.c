// 트리(Tree) - 이진트리와 순회
//  : 노드들이 **계층적(부모-자식 관계)**으로 연결된 자료구조. 
//    각 노드가 최대 2개의 자식(왼쪽/오른쪽)만 갖는 것을 **이진트리(Binary Tree)**라고 한다.

#include <stdio.h>
#include <stdlib.h>

struct TreeNode {
    int data;
    struct TreeNode* left;
    struct TreeNode* right;
};

struct TreeNode* newNode(int data) {
    struct TreeNode* node = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    node->data = data;
    node->left = NULL;
    node->right = NULL;
    return node;
}

// 전위 순회: 나(루트) -> 왼쪽 -> 오른쪽
void preorder(struct TreeNode* root) {
    if (root == NULL) return;
    printf("%d", root->data);
    preorder(root->left);
    preorder(root->right);
}
// 중위 순회: 왼쪽 -> 나(루트) -> 오른쪽
void inorder(struct TreeNode* root) {
    if (root == NULL) return;
    inorder(root->left);
    printf("%d", root->data);
    inorder(root->right);
}
// 후위 순회: 왼쪽 -> 오른쪽 -> 나(루트)
void postorder(struct TreeNode* root) {
    if (root == NULL) return;
    postorder(root->left);
    postorder(root->right);
    printf("%d", root->data);
}

int main() {
    struct TreeNode* root = newNode(1);
    root->left = newNode(2);
    root->right = newNode(3);
    root->left->left = newNode(4);
    root->left->right = newNode(5);

    printf("전위: "); preorder(root); printf("\n");
    printf("중위: "); inorder(root); printf("\n");
    printf("후위: "); postorder(root); printf("\n");
    return 0;
}

