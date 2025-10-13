try:
    with open("9-4/greet.txt", "w") as f:
        f.write("Hi, everyone.\nWelcome to Python.\n")
    print("greet.txt 파일이 성공적으로 작성되었습니다.")
except PermissionError:
    print("greet.txt 파일에 쓸 수 있는 권한이 없습니다.")
except Exception as e:
    print(f"파일 작성 중 오류 발생: {e}")
