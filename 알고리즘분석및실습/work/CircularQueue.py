class CircularQueue:
    def __init__(self,capacity = 8) :
        self.capacity = capacity
        self.array = [None] * capacity
        self.front = 0
        self.rear = 0

    def isEmpty(self):
        return self.front == self.rear

    def isFull( self):
        return self.front == (self.rear+1)%self.capacity

    def enqueue( self, item):
        if not self.isFull():
            self.rear = (self.rear+1)%self.capacity
            self.array[self.rear] = item
        else: pass

    def dequeue( self):
        if not self.isEmpty():
            self.front = (self.front+1)%self.capacity
            return self.array[self.front]
        else: pass

    def peek(self):
        if not self.isEmpty():
            return self.array[(self.front)%self.capacity]
        else: pass
