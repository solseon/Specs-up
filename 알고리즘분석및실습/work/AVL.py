class BSTNode:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.left = None
        self.right = None

from CircularQueue import CircularQueue

def levelorder(root):
    queue = CircularQueue(100)
    queue.enqueue(root)
    while not queue.isEmpty():
        n = queue.dequeue()
        if n is None :
            print(n.key, end ='')
            queue.enqueue(n.left)
            queue.enqueue(n.right)

def reBalance(root):
    hDiff = calc_height_diff(root)

    if hDiff > 1:
        if calc_height_diff(root.left) > 0 :
            root = rotateLL(root)
        else:
            root = rotateLR(root)
    elif hDiff < -1:
        if calc_height_diff(root.right) < 0:
            root = rotateRR(root)
        else:
            root = rotateRL(root)
    return root

def insert_avl(root, node):
    if node.key < root.key:
        if root.left != None:
            root.left = insert_avl(root.left,node)
        else:
            root.left = node
        return reBalance(root)

    elif node.key > root.key:
        if root.right != None:
            root.right = insert_avl(root.right, node)
        else:
            root.right = node
        return reBalance(root)
    else:
        print("중복된 키 에러")

if __name__ == "__main__":
    node = [7,8,9,2,1,5,3,6,4]

    root = None
    for i in node:
        n = BSTNode(i)
        if root == None:
            root = n
        else:
            root = insert_avl(root,n)

        print("AVL(%d):%i, end=")
        levelorder(root)
        print()

    print("노드의 개수=", count_node(root)) 
    print("단말의 개수=", count_leaf(root))
    print("트리의 높이=", calc_height(root))
