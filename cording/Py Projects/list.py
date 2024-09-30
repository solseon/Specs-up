# c언어와는 달리 파이썬에서는 배열을 따로 제공하지 않고, 따라서 리스트를 배열처럼 사용할 수 있다. 파이썬에서는 "배열"이라는 단어와 "파이썬의 리스트"를 대부분의 경우 같은 의미로 사용한다.

# 리스트 생성
big3 = []                                       # 공백 리스트 생성
lotto = [23, 34, 11, 42, 9]                     # 숫자 리스트
big4 = ['블랙핑크', '뉴진스', '에스파', '아이브']       # 문자열 리스트

print("lotto[0] = %d, lotto[1] = %d" %(lotto[0], lotto[1]))     # 리스트 앞에서부터 읽을때에는 01234 순으로 읽는다
print("lotto[-1] = %d, lotto[-2] = %d" %(lotto[-1], lotto[-2])) # 리스트 뒤에서부터 읽을때에는 -1-2-3-4-5 순으로 읽는다


# list는 콜론(:)을 사용하여 범위 지정. '리스트이름[시작값:끝값-1]'은 리스트 시작 위치부터 끝 위치까지 모든 값을 의미
print(lotto[:2])
print(lotto[1:3])
print(lotto[3:])

# 컴프리헨션(함축) 형식

# 리스트 = [ 수식 for 항목 in range() if 조건식]
numnumList = [num * num for num in range(1,6)]     # 1~5의 제곱으로 구성된 리스트
print(numnumList)

numlist = [num for num in range(1,21) if num % 3 == 0]      # if문 추가하여 1~20 숫자중 3의 배수로만 리스트 구성
print(numlist)

# 2차원 리스트의 컴프리헨션 구성 형식
# 리스트 = [[수식 for 항목 in range()] for 항목 in range()]
list2 = [[0 for _ in range(4)] for _ in range(3)]        # 3x4 크기의 0이 채워진 2차원 리스트 구성 방법
print(list2)