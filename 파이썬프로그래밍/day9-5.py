with open("number1to10.txt", "w") as f:
    for i in range(1, 11):
        f.write(f"{i}\n")
print("number1to10.txt 파일이 생성되었습니다.")