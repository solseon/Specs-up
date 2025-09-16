inputStr = input("쉼표로 구분된 정수를 여러 개 입력하시오 : ")

inputList = inputStr.split(',')

nums = []
for n in inputList:
    nums.append(int(n.strip()))   

print("입력된 정수의 리스트 :", nums)

nums.sort()

print("정렬된 정수의 리스트 :", end=" ")
for n in nums:
    print(n, end=" ")
