# 파이썬 프로그래밍 3장 예제 조건문 2번
num = int(input("나이를 입력하시오 : "))
height = int(input("키를 입력하시오(단위 : cm) : "))

if num > 19:
    if height > 150:
        print("입장 할 수 있습니다.")
    else:
        print("입장할 수 없습니다.")
else:
    print("입장할 수 없습니다.")
