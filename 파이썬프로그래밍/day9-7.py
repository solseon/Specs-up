# 7-1
import random

with open("random_numbers.txt", "w") as f:
    for i in range(10):
        num = random.randint(1, 1000)
        f.write(str(num))
        if i < 9:
            f.write(" ")
print("random_numbers.txt 파일이 생성되었습니다.")

# 7-2
with open("random_numbers.txt", "r") as f:
    numbers = f.read().split()

even_numbers = [num for num in numbers if int(num) % 2 == 0]

with open("random_even.txt", "w") as f:
    f.write(" ".join(even_numbers))
print("random_even.txt 파일이 생성되었습니다.")

# 7-3
with open("random_numbers.txt", "r") as f:
    numbers = f.read().split()

odd_numbers = [num for num in numbers if int(num) % 2 == 1]

with open("random_odd.txt", "w") as f:
    f.write(" ".join(odd_numbers))
print("random_odd.txt 파일이 생성되었습니다.")