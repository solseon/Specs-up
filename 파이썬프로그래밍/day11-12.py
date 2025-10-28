# 11장 예제 12번
def reverse_generator(seq):
    for i in range(len(seq) - 1, -1, -1):
        yield seq[i]

def last_odd(numbers):
    for n in reverse_generator(numbers):
        if n % 2 == 1:
            return n
    return None

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 16]

# (1) 제너레이터로 역순 출력
for num in reverse_generator(numbers):
    print(num, end=" ")
print()

# (2) 제너레이터를 이용하여 마지막 홀수 찾기
print("마지막 홀수는 :", last_odd(numbers))