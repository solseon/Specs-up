# 21101830 안수범 [REPORT01]
from ArrayList import ArrayList

class ArraySet:
    def __init__(self):
        self.array = ArrayList() 
        self.size = 0

    def contains(self, e):
        for i in range(self.size):
            if self.array[i] == e:
                return True
        return False

    def insert(self, e):
        if not self.contains(e) and not self.Full():
            self.array[self.size] = e
            self.size += 1

    def delete(self, e):
        for i in range(self.size):
            if self.array[i] == e:
                self.array[i] = self.array[self.size - 1]
                self.size -= 1
                return

    def union(self, setB):
        setC = ArraySet()
        for i in range(self.size):
            setC.insert(self.array[i])
        for i in range(setB.size):
            if not setC.contains(setB.array[i]):
                setC.insert(setB.array[i])
        return setC

    def intersect(self, setB):
        setC = ArraySet()
        for i in range(self.size):
            if setB.contains(self.array[i]):
                setC.insert(self.array[i])
        return setC

    def difference(self, setB):
        setC = ArraySet()
        for i in range(self.size):
            if not setB.contains(self.array[i]):
                setC.insert(self.array[i])
        return setC

    def __eq__(self, setB):
        if self.size != setB.size:
            return False
        for i in range(self.size):
            if self.array[i] != setB.array[i]:
                return False
        return True

a = [38, 21, 53, 62, 19]
