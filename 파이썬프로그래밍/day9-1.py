try:
    a, b = input('두 수를 입력하시오 : ').split()
    result = int(a) * int(b)
except ValueError:
    print("입력이 잘못되었습니다. 두 개의 정수 값을 입력하세요.")
except Exception as e:
    print(f"예상치 못한 오류가 발생했습니다: {e}")
else:
    print(f"결과는 {result}입니다.")