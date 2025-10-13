# (1) 파일 읽어서 출력
with open("hello.txt", "r", encoding="utf-8") as f:
    print("hello.txt 파일 :")
    print(f.read(), end="")

# (2) 파일에 내용 추가
with open("hello.txt", "a", encoding="utf-8") as f:
    f.write("\nWelcome to Python! .")

# 다시 읽어서 출력
with open("hello.txt", "r", encoding="utf-8") as f:
    print("hello.txt 파일 :")
    print(f.read(), end="")