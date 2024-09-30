''' STACK?
    스택은 후입선출(Last - In First Out: LIFO)의 자료구조이다.
    == 마지막에 들어오는 데이터가 가장 먼저 나가는 구조 (like 종이컵홀더)
    EX) 리스트, 큐, 트리
    삽입(push), 삭제(pop) 
    포화상태에서 push하면 오버플로(overflow) 오류발생
    공백상태에서 pop하면 언더플로(underflow) 오류발생
    따라서 스택을 안정적으로 사용하기 위해서는 isEmpty()와 isFull()을 이용해 스택의 상태를 검사해야 한다.
    '''

    # 스택의 구현(클래스 버전)
class ArrayStack :
    def __init__(self, capacity ):
        self.capacity = capacity
        self.array = [None]*self.capacity
        self.top = -1

    # 스택의 연산들을 멤버 함수로 구현
    def isEmpty(self) :                 # 공백상태 체크
        return self.top == -1           # 연산 결과가 True이면 True를 False이면 False를 반환

    def isFull(self) :                  # 포화상태 체크
        return self.top == self.capacity-1      # == 포화상태 조건

    def push(self,e):
        if not self.isFull() :
            self.top += 1
            self.array[self.top] = e
        else: pass

    def pop( self ):
        if not self.isEmpty():
            self.top -= 1
            return self.array[self.top+1]
        else: pass

    def peek( self ):
        if not self.isEmpty():
            return self.array[self.top]
        else: pass

    # 문자열로 형 변환하여 출력해주기 위한 __str__() 추가
    def __str__(self ):           
        return str(self.array[0:self.top+1])