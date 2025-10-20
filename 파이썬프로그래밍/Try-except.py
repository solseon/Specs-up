# 예외처리 : try-except 문의 문법
# 코드 9-2: try-except 문을 사용한 예외 처리와 예외의 종류 출력하기
try:
    b = 2/0
    a = 1+'hundred'
except Exception as e:
    print('error :', e)

# 코드 9-3: try-except 문을 사용한 예외 처리와 예외의 종류 출력하기
try:
    # b = 2 /0
    a = 1 + 'hundred'
except Exception as e:
    print('error :', e)
