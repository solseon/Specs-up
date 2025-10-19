# Paking - 하나의 튜플 변수에 여러 개의 값을 넣는 것을 의미
# Unpaking - 패킹된 튜플 변수가 있으면, 여러 개의 값을 개별 변수에 담아 꺼내는 것

a =(1, 2) # 튜플 패킹
print(a[0]) # 튜플 항목에 대한 참조
print(a[1])

c = (3,4) # 튜플 패킹
d, e = c # 튜플 언패킹
print(d)
print(e)

# swap
a = 100
b = 200
print('swap 이전 : a = ', a, 'b = ', b)
temp = a
a = b
b = temp
print('swap 이후 : a = ', a, 'b = ', b)

# Tuple 을 이용한 swap

a = 100
b = 200
print('swap 이전 : a = ', a, 'b = ', b)
a, b = b, a
print('swap 이후 : a = ', a, 'b = ', b)

# LAB 7-6: 튜플의 생성과 패킹,언패킹
the_day = (1919, 3, 1)
year, month, day = the_day
print(f"{year}년 {month}월 {day}일은 삼일만세운동일입니다.")

lst = [10, 20, 30]

t1 = tuple(lst) # 리스트를 튜플로 변환

c, b, a = t1
print('a = ', a)
print('b = ', b)
print('c = ', c)
