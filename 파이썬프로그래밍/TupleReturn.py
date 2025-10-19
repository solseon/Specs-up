# 함수 반환문과 튜플 활용
# 코드 7-6: 원의 면적과 둘레를 튜플 형식으로 반환하는 함수
def area_and_circum(radius):    # 원의 면적과 둘레 구하기
    area = 3.14 * radius ** 2
    circum = 2 * 3.14 * radius
    return area, circum     # 튜플을 반환함 - 반환값 (area, circum)

r = 4
a, c = area_and_circum(r) # 반환 받은 튜플을 언패킹
print('반지름 {}인 원의 면적과 둘레 : {}, {}'.format(r, a, c))

# LAB 7-8: 튜플의 반환
def square(x, y) :
    x = x ** 2
    y = y ** 2
    return x, y

x = 10
y = 20
x_sq, y_sq = square(x, y)
print('{} 제곱 = {}, {} 제곱 = {}'.format(x, x_sq, y, y_sq))

print('Hello ' * 3) # 문자열 3번 출력
print(('Hello ',) * 3) # 길이 1짜리 튜플('Hello ',)을 3번 반복하여 길이 3짜리 튜플 생성 및 출력