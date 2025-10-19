# 곱집합 (심화학습)
# 코드 7-7: 곱집합 함수 product_set()와 A, B 집합의 곱집합
def product_set(set1, set2) :
    res = set()
    for i in set1:
        for j in set2:
            res = res | {(i, j)} # 이중 for 루프를 이용한 곱집합
    return res

A = {1, 3}
B = {2, 4}
AxB = product_set(A, B)
print('A =', A)
print('B =', B)
print('A x B =', AxB)
# LAB 7-11: 곱집합 연산
# 다음 두 집합이 있을 경우 product_set() 함수를 이용하여 두 집합의 곱집합을 구하여라.

A = {1, 3}
B = {'A', 'B', 'C'}

AxB = product_set(A, B)
BxA = product_set(B, A)
AxA = product_set(A, A)
BxB = product_set(B, B)

print('AxB =',AxB)
print('BxA =',BxA)
print('AxA =',AxA)
print('BxB =',BxB)

print('---------7 - 8----------')

# 코드 7-8: 곱집합 함수를 이용한 집합의 세제곱 연산
def exp(input_set, exponent) : # input_set에 대하여 거듭제곱을 수행
    res = input_set     # res 초기화
    for _ in range(exponent - 1) :
        res = product_set(res, input_set)
    return res

A = {1, 3}
A3 = exp(A, 3) # 집합 A에 대하여 거듭제곱을 3회 수행함
print(A3)

print('---------7 - 9----------')

# 코드 7-9: 주사위 두 번 던져 얻는 경우를 모두 구하기
cases = {1,2,3,4,5,6}
cases_2times = product_set(cases, cases)
print(cases_2times)

print('---------LAB 7 - 12----------')

# LAB 7-12: 주사위를 여러번 던졌을 때 특정값 이상을 얻을 확률 구하기

def tuple_sum(tup) :    # tup 내의 모든 항목의 합을 구하는 함수
    if isinstance(tup, int) : # tup이 int 형이면 tup을 반환
        return tup
    else :
        accum = 0
        for element in tup : # tup 내의 모든 항목을 조회함
            accum += tuple_sum(element) # 누적 합을 구하기 위한 재귀 호출
    return accum

