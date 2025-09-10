# 파이썬 프로그래밍 3장 예제 조건문 3번
age = int(input("나이를 입력하시오 : "))

if age >= 20:
    print("Adult")
elif age >= 10 and age < 20:
    print("Youth")
else:
    print("Kid")
    