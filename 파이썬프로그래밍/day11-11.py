# 11장 예제 11번
def first_odd(numbers):
    for n in numbers:
        if n % 2 == 1:
            return n
    return None

numbers = [2, 8, 6, 4, 3, 1, 4, 6, 2]
print("처음으로 나타나는 홀수는 :", first_odd(numbers))