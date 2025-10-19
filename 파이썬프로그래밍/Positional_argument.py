def get_root(a, b, c):
    r1 = (-b +(b ** 2 - 4 * a * c) ** 0.5) / (2 * a)
    r2 = (-b -(b ** 2 - 4 * a * c) ** 0.5) / (2 * a)
    return r1, r2
# 함수 호출 시 1, 2, -8 인자를 사용한다.
# result1, result2를 이용해서 결과 값을 반환 받는다.
result1, result2 = get_root(1, 2, -8)
print('해는', result1, '또는', result2)

# LAB 5-9: 키워드 인자
def print_name(honorifics, first_name, last_name):
    # 키워드 인자를 이용한 출력용 프로그램
    print(honorifics, first_name, last_name)

print_name(first_name='Gildong', last_name='Hong', honorifics='Dr.')
print_name('Gildong', 'Hong', 'Dr.')