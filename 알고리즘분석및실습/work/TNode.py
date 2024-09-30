class TNode :
    def __init__(self, data, left, right) :
        self.data = data
        self.left = left
        self.right = right

    def preorder(n) :
        if n is not None :
            print(n.data, end =' ')
            preorder(n.left)
            preorder(n.right)

    def inorder(n) :
        if n is not None :
            inorder(n.left)
            print(n.data, end=' ')
            inorder(n.right)

    def postorder(n) :
        if n is not None :
            postorder(n.left)
            postorder(n.right)
            print(n.data, end='')
        
        
d = TNode('D', None, None)
e = TNode('E', None, None)
b = TNode('B', d, e)
f = TNode('F', None, None)
c = TNode('C', f, None)
root = TNode('A', b, c)

print('\n In-Order :', end='')
inorder(root)
print('\n Pre-Order :', end='')
preorder(root)
print('\n Post-Order :', end='')
postorder(root)
print('\n Level-Order :', end='')
print()

print(" 노드의 개수 = %d개" % count_nood(root))
print(" 단말의 개수 = %d개" % count_leaf(root))
print(" 트리의 높이 = %d" % count_height(root))