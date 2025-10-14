class Counter:
    def __init__(self, number=0):
        if number >= 100 or number <= -1:
            self._number = 0
        else:
            self._number = number

    def reset(self):
        self._number = 0

    def inc(self):
        self._number += 1
        if self._number >= 100:
            self._number = 0

    def dec(self):
        self._number -= 1
        if self._number <= -1:
            self._number = 0

    def __str__(self):
        return f"C({self._number})"

    # c1 + c2 연산을 위한 특수 메소드
    def __add__(self, other):
        result = self._number + other._number
        # 100 이상이면 0으로 초기화
        if other._number >= 100:
            other._number = 0
        return Counter(result)

    # c1 - c2 연산을 위한 특수 메소드
    def __sub__(self, other):
        result = self._number - other._number
        # -1 이하이면 0으로 초기화
        if other._number <= -1:
            other._number = 0
        return Counter(result)

# 예시
c1 = Counter(10)
c2 = Counter(20)
c3 = c1 + c2 
c4 = c1 - c2  
print('c3 =', c3)
print('c4 =', c4)