num = int(input("숫자를 입력하시오 : "))
t = 0

for i in range(2, num):
    if num % i == 0:
        t = 1
    
if t==0:
    print(num, "는 소수입니다.")
else:
    print(num, "는 소수가 아닙니다.")