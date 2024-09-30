# 21101830 안수범
from CircularQueue import *
class CircularDeque(CircularQueue) :
    def __init__( self,capacity=10) :
        super().__init__(capacity)

    # isEmpty(), isFull(), size(), __str__()

    def addRear( self, item):
        self.enqueue(item )

    def deleteFront( self):
        return self.dequeue()

    def getFront( self):
        return self.peek()

    # 새로 구현이 필요한 연산들
    def addFront( self, item ):
        if not self.isFull():
            self.array[self.front] = item
            self.front = (self.front - 1 + self.capacity) % self.capacity
        else: pass

    def deleteRear( self ):
        if not self.isEmpty():
            item = self.array[self.rear]
            self.rear = (self.rear - 1 + self.capacity) % self.capacity
            return item
        else: pass

    def getRear( self ):
        if not self.isEmpty():
            return self.array[self.rear]
        else: pass

# 21101830 안수범
deque = CircularDeque()
deque.addFront(4)
deque.addRear(8)
deque.addRear(9)
deque.addFront(5)
deque.getRear()
deque.deleteFront()
deque.deleteRear()
deque.addRear(7)
deque.getFront()
deque.getRear()
deque.addRear(6)
deque.deleteFront()
deque.deleteFront()

print(deque.deleteFront())