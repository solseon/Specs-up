# 문제 1. 문자열 메서드 - capitalize(), split(), 슬라이싱
def pr1():
    x = input()
    x = x.capitalize() # captialize(): 문자열의 첫 글자만 대문자, 나머지는 전부 소문자로 바꾼다.
    y = x.split()   # split(): 공백 기준으로 문자열을 잘라서 리스트로 저장한다.
    # 슬라이싱: [시작:끝:스텝]시작 끝을 생략하면 처음부터 끝까지
    print(y[0][::2], end = '*') 
    print(y[1][3:6])
    # 입력: Python Programming

# 문제 2. 리스트 조작 - split, range, remove, find
def pr2():
    arr_str = input('input String :').split('-') # ['information', 'technology']
    arr_len = int(input('input number : '))
    arr_val = list(range(0, arr_len, 2))    # range(시작, 끝, 스텝) 따라서 [0, 2, 4, 6, 8, 10]
    arr_val.remove(4)       # 인덱스 4가아닌 값 4 remove
    print(arr_str[1].find('i') + arr_val[2])    # technology에 i가 없기때문에 -1을 반환 함정 조심!
    # 입력: information-technology, 12

# 문제 3. 문자열 포맷팅 - %d, %.3f, 과학적 표기법
def pr3():
    i = 20
    f = 123456.789E-3   # 과학적 표기법: 123456.789 x 10^-3 = 123.456789
    print('%d\n%d' % (i, i), end = '/')
    print('%.3f' % f)

# 문제 4. 클래스와 반복문 - 클래스 변수, 인스턴스, 인덱싱
def pr4():
    class charClass:
        a = ["Seoul", "Inchon", "Kyonggi", "Daejun", "Daegu", "Pusan"]

    myVal = charClass()          # 인스턴스 생성
    str01 = ''
    for i in myVal.a:            # 리스트의 각 도시 이름을 순서대로 꺼냄
        str01 = str01 + i[0]     # 각 도시 이름의 첫 글자만 이어붙임
    print(str01)

# 문제 5. 문자열 포맷팅 - 정렬(-)과 폭.정밀도(10.4)
def pr5():
    a = "What's this?"
    print("%-10.4s" % a)    # 왼쪽 정렬, 전체폭10, 앞 4글자만
    print("%10.4s" % a)     # 오른쪽 정렬(기본), 전체폭10, 앞 4글자만

# 문제 6. while 반복문 - 누적 연산
def pr6():
    i, hap = 1, 0
    while i <= 6:
        hap += i
        i += 2
    print(f"i={i}, hap={hap}")

# 문제 7. 2차원 리스트 - 중첩 반복문
def pr7():
    a = [[1,1,0,1,0],
         [1,0,1,0]]
    tot, totsu = 0, 0
    for i in a:         # 바깥 반복: 각 행(리스트)을 꺼냄 
        for j in i:     # 안쪽 반복: 그 행의 각 숫자를 꺼냄
            tot += j
        totsu = totsu + len(i)  # 그 행의 길이(원소 개수)를 더함
    print(totsu, tot)

# 문제 8. 클래스 정의 빈칸 채우기 - class, def
def pr8():
    class Calculator:
        def add(self, x, y):
            return x + y
        def mul(self, x, y):
            return x * y

# 문제 9. 리스트 순회 - 들쭉날쭉한 2차원 리스트
def pr9():
    lol = [[1,2,3],[4,5],[6,7,8,9]]
    print(lol[0])   # 0번째 행 전체
    print(lol[2][1])    # 2번째 행 1번째 원소
    for sub in lol:     # 각 행을 꺼냄
        for item in sub:    # 그 행의 각 원소를 꺼냄
            print(item, end=" ")
        print()             # 한 행 끝나면 줄바꿈

# 문제 10. 문자열 슬라이싱 + 연결 (원문 오류 정정)
def pr10():
    a = "REMEMBER NOVEMBER"
    b = a[0:3] + a[12:16]
    c = "R AND %s" % "STR"
    print(b + c)

# claude 제공 문제

# 1
def claude1():
    s = "Data Processing Engineer"
    words = s.lower().split()
    print(words[1][::-1], end=' ')
    print(words[2][:3].upper())

# 2
def claude2():
    nums = [3, 7, 1, 9, 4, 7, 2]
    idx = nums.index(7)         # num.index(값)은 그 값이 "처음 나오는 인덱스"를 반환 따라서 idx = 1
    nums.remove(7)              # remove(값)은 마찬가지로 처음 나오는 그 값을 삭제
    print(idx, nums[idx], len(nums))

# 3
def claude3():
    class Stack:
        def __init__(self):
            self.data = []
        def push(self, val):
            self.data.append(val)
        def pop(self):
            return self.data.pop()

    s = Stack()
    for v in [5, 10, 15]:
        s.push(v)
    s.push(20)
    print(s.pop())
    print(s.data)

def Dict():
    class LocationDict:
        locations = {
            "NYC": "New York",
            "LON": "London",
            "PAR": "Paris",
            "TKY": "Tokyo"
        }

    tmpdict = LocationDict()
    str01 = ""
    for key, location in tmpdict.locations.items():
        keyk = key[-1]
        locationk = location[0]
        str01 += keyk + locationk

    print(str01, end="")