# zip() 함수를 이용한 집적화와 슬라이싱
# 대화창 실습: zip() 함수에 공백 인자를 넘긴 경우

empty_iterator = zip()
result = set(empty_iterator)
print(result)

# 대화창 실습: zip() 함수를 이용한 집적화
a =[10,20,30]    # 리스트 a
b = ('ten', 'twenty', 'thirty') # 튜플 b
print(list(zip(a, b))) # 리스트 a와 튜플 b를 집적화하여 생성된 튜플을 출력

# 대화창 실습: zip() 함수에 하나의 반복 가능 자료형 인자를 전달할 경우
lst = ['a', 'b', 'c', 'd']
my_iterator = zip(lst)
result = set(my_iterator)
print(result)

# 대화창 실습: zip() 함수 세 개의 반복 가능 자료형 인자를 전달
cty_list = ['서울', '부산', '광주', '대전']
pop_tuple = (9765, 3467, 1450)
area_list = [605.2, 769.9, 480, 496, 883]
cty_info = zip(cty_list, pop_tuple, area_list)
# print(list(cty_info))

# 대화창 실습: zip()으로 묶여진 튜플을 다시 풀어내는 방법(언패킹)
a, b, c = zip(*cty_info) # 튜플을 언패킹 함
print(a)
print(b)
print(c)

# 튜플과 문자열의 슬라이싱
# 대화창 실습: 튜플의 슬라이싱
tu = (0,1,2,3,4,5,6,7,8,9)
print(tu[1:5]) # 튜플의 슬라이싱으로 1, 2, 3, 4의 네 원소를 가져온다.
print(tu[0:10:3])
print(tu[::-1])

# 대화창 실습: 문자열 슬라이싱
text = 'hello world'
print(text[1:5])
print(text[6:])
print(text[::3])
print(text[::-1])