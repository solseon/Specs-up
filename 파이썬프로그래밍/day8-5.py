import random

x = random.randrange(1, 21)
n = 0

while True:
    guess = int(input("1~20까지의 숫자를 입력하세요 : "))
    n += 1
    if guess < x:
        print(f"{guess}보다 큽니다!")
    elif guess > x:
        print(f"{guess}보다 작습니다!")
    else:
        print("정답입니다!")
        if n <= 3:
            print(f"{n}번만에 맞춘 당신은 지니어스 ㅋ")
        elif n <= 6:
            print(f"{n}번만에 맞추셨네요. 잘했어요^^")
        else:
            print(f"{n}번만에 맞추다니 분발하세요..")
        break