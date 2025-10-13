# (1)의 경우 파일이 이미 존재하고 읽기 전용으로 설정되어 있으면, 쓰기 시도시 permissionError 예외가 발생한다.

# (2) 아래 코드는 실제로 파일을 만들고 읽기 전용으로 설정한 뒤, 쓰기를 시도하여 예외를 출력한다.
with open("my_hello.txt", "w") as f:
    f.write("Hello Python")

import os
os.chmod("my_hello.txt", 0o444)  # 읽기 전용으로 변경

try:
    with open("my_hello.txt", "w") as f:
        f.write("Hello Python")
except Exception as e:
    print("예외 발생:", e)

# (3) 예외 처리문 예시

try:
    with open("mt_hello.txt", "w") as f:
        f.write("Hello Python")
except permissionError:
    print("PermissionError: 파일이 읽기 전용으로 설정되어 있어 쓸 수 없습니다.")
except Exception as e:
    print(f"다른 예외 발생: {e}")