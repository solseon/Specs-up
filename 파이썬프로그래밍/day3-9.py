def sort3(num1, num2, num3) :
    a = []
    a.append(num1)
    a.append(num2)
    a.append(num3)
    a.sort()

    print(f"정렬된 리스트는 다음과 같습니다 : ", a[0], a[1], a[2])

print("세 수를 입력하세요 :")
num1 = int(input())
num2 = int(input())
num3 = int(input())

sort3(num1, num2, num3)