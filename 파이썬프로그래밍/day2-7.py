num = int(input("정수를 입력하시오 : "))

if num % 2 == 0:
    print(num, "는(은) 2(으)로 나누어집니다.")
else:
    print(num, "는(은) 2(으)로 나누어지지 않습니다.")

if num % 3 == 0:
    print(num, "는(은) 3(으)로 나누어집니다.")
else:
    print(num, "는(은) 3(으)로 나누어지지 않습니다.")

if num % 2 == 0 and num % 3 ==0:
    print(num, "는(은) 2와(과) 3 모두에 대해 동시에 나누어집니다.")
else:
    print(num, "는(은) 2와(과) 3 모두에 대해 동시에 나누어지지 않습니다.")
