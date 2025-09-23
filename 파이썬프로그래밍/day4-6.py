num = int(input("n을 입력하시오 : "))

number = list(map(int,input(f"{num}개의 수를 입력하시오 : ").split()))

print(f"합 : {sum(number)}")

print(f"평균 : {(sum(number)/num)}")

print(f"최대값 : {max(number)}")

print(f"최소값 : {min(number)}")