# 코드 5-26: 가변 인자를 가지는 함수의 정의와 호출
def greet(*names):
    for name in names:
        print('안녕하세요', name, '씨')

greet('홍길동', '양만춘', '이순신')
greet('James', 'Thomas')

# 코드 5-27: 가변 인자를 가지는 함수에서 len() 함수 활용
def foo(*args):
    print('인자의 개수:', len(args))
    print('인자들 :', args)

foo(10, 20, 30)

# 코드 5-28: 가변 인자를 가지는 함수를 이용한 합계 구하기
# def sum_nums(*numbers):
#     result = 0
#     for n in numbers:
#         result += n
#     return result

# print(sum_nums(10, 20, 30))
# print(sum_nums(10, 20, 30, 40, 50))

# LAB 5-10: 가변 인자의 활용
def sum_nums(*numbers):
    print(len(numbers),' 개의 인자', numbers)
    sum = 0
    count = 0
    for n in numbers:
        sum += n
        count += 1
    avr = sum/count
    print('합계 : ', sum, ', 평균 : ', avr)

sum_nums(10, 20, 30)
sum_nums(10, 20, 30, 40, 50)

def min_nums(*numbers):
    min = 0
    for n in numbers:
        if n > numbers[n+1]:
            min = n
        else:
            min = numbers
    return min

print('최솟값은 ', min_nums(20, 40, 50, 10))
    
    