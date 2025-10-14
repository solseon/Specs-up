class Counter:
    def __init__(self,_number = 0):
        if _number >= 100 or _number <= -1:
            self._number = 0
        else:
            self._number = _number
        
    def reset(self):
        self._number = 0
        
    def inc(self):
        self._number += 1
        if self._number > 99:
            self._number = 0

    def dec(self):
        self._number -= 1
        if self._number <= -1:
            self._number = 0

    def __str__(self):
        return f"C({self._number})"

# 예제 1
c1 = Counter(10)
c1.inc()
print('c1 =', c1)

print("----------------")
        
# 예제 2
c2 = Counter()
c2.inc()
c2.inc()
c2.dec()
print('c2 =', c2)
c2.reset()
print('c2 =', c2)