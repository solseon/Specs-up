class ArrayList:

    def __init__(self, capacity=100):
        self.capacity = capacity
        self.array = [None] * capacity
        self.size = 0

    def isEmpty(self):
        return self.size == 0

    def isFull(self):
        return self.size == self.capacity

    def getEntry(self, pos):
        if 0 <= pos < self.size:
            return self.array[pos]
        return None

    def insert(self, e):
        if self.contains(e) or self.isFull():
            return
        self.array[self.size] = e
        self.size += 1

    def delete(self, pos):
        if not self.isEmpty() and 0 <= pos < self.size:
            e = self.array[pos]
            for i in range(pos, self.size - 1):
                self.array[i] = self.array[i + 1]
            self.size -= 1
            return e
        return None

    def __str__(self):
        return str(self.array[:self.size])
    
    def contains(self, e):
        for i in range(self.size):
            if self.array[i] == e:
                return True
        return False
