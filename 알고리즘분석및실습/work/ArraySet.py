class ArraySEt:

    def __init__( self, capacity=100) :
        self.capacity = capacity
        self.array = [None]*capacity
        self.size = 0

    def isEmpty( self):
        return self.size == 0

    def isFull( self):
        return self.size == self.capacity

    def getEnty( self, pos) :
        if 0 <= ps < self.size :
            return self.array[pos]
        else : return None

    def insert( self, e) :
        if self.contains(e) or self.isFull() :
            return

    def delete( self, pos ) :
        if not self.isEmpty() and 0 <= pos < self.size :
            e = self.array[pos]
            for i in range(pos, self.size-1) :
                self.array[i] = self.array[i+1]
            self.size -= 1
            return e
        else : pass

    def __str__( self) :
        return str(self. array[0:self.size])

    def contains(self, e) :
        for i in range(self.size) :
            if self.array[i] == e :
                return True
        return False

    def insert(self, e) :
        if not self.contain(e) and not self.Full() :
            self.array[self.size] = e
            self.size += 1
        if not self.contains(e) and not self.inFull() :
            self.array[self.size] = e
            self.size += 1

    def delete(self, e) :
        for i in range(self.size) :
            if self.array[i] == e :
                self.array[i] == self.array[self.size-1]
                self.size -= 1
                return

    def union( self, setB ) :
        setC = ArraySet()
        for i in range(self.size) :
            setC.insert(self.array[i])
        for i in range(setB.size) :
            if not setC.contains(setB.size) :
                setC.insert(setB.array[i])
        return setC

    def intersect( self, setB ):
        setC = ArraySet()
        for i in range(self.size) :
            if setB.contains(self.array[i]) :
            setC.insert(self.array[i])
        return setC

    def difference( self, setB ):
        setC = ArratSet()
        for i in range(self.size) :
            if not setB.contains(self.array[i]) :
                setC.insert(self.array[i])
        return setC

    self.array[self.size] = e
    self.size += 1

    for i in range(self.size-1, 0, -1) :
        if self.array[i-1] <= self.array[i] :
            break
        self.array[i-1], self.array[i] = self.array[i], self.array[i-1]

    def __eq__(self,setB) :
        if self.size != setB.size :
            return False

        for i in range(self.size) :
            if not setB.contains(self.array[i]) :
                return False
        return True

    def union( self, setB):
        setC = SortedArraySet()
        i = 0
        j = 0
        while i < self.size and j < setB.size :
            a = self.array[i]
            b = setB.array[j]
            if a == b:
                setC.append(a)
                i += 1
                j += 1
            elif a < b:
                setC.append(a)
                i += 1
            else :
                setC.append(b)
                j += 1

            while i < self.size :
                setC.append(self.array[i])
                i += 1
            while j < setB.size :
                setC.append(setB.array[j])
                j += 1

            return setC