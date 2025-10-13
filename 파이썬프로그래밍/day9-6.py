print("number1to10.txt 파일을 읽었습니다.")
n = int(input("몇 번째 라인까지 출력하시겠습니까? "))
with open("number1to10.txt", "r") as f:
    for i in range(n):
        line = f.readline()
        if not line:
            break
        print(line.strip())