s = int(input("숫자를 입력하시오 : "))

for i in range(1, s+1):
    for j in range(s-i):
        print(" ", end="")
    for j in range(i):
        print("*", end="")
    print()