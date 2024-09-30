# 21101830 안수범
from Node import *

class LinkedList:
    def __init__( self ):
        self.head = None

    def isEmpty( self ): return self.head == None
    def isFull( self ): return False

    def getNode(self, pos) :
        if pos < 0 : return None
        node = self.head
        while pos > 0 and node != None :
            node = node.link
            pos -= 1
        return node

    def getEntry(self, pos) :
        node = self.getNode(pos)
        if node == None : return None
        else : return node.data

    def insert(self, pos, elem) :
        before = self.getNode(pos-1)
        if before == None :
            self.head = Node(elem, self.head)
        else:
            node = Node(elem, before.link)
            before.link = node

    def delete(self, pos) :
        before = self.getNode(pos-1)
        if before == None :
            if self.head is not None :
               self.head = self.head.link
        elif before.link != None :
            before.link = before.link.link

    def size( self):
        node = self.head
        count = 0
        while not node == None :
            node = node.link
            count += 1
        return count

    def __str__(self):
        arr = []
        node = self.head
        while not node == None :
            arr.append(node.data)
            node = node.link
        return str(arr)

# 21101830 안수범
ice = LinkedList()
print(ice.isEmpty())
print(ice.isFull())
ice.insert(1,1)
ice.insert(2,2)
ice.insert(3,3)
ice.delete(2)
ice.getEntry(1)
print(ice.size())
print(ice.getNode(0).data)