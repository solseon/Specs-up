# 11장 예제 5번
#(1) for문과 if 조건식, %연산자 사용
n_list = list(range(1, 101))
new_list = []
for n in n_list:
    if n % 6 == 0:
        new_list.append(n)
print("n_list =", new_list)

# (2) filter() 함수와 람다 함수 사용
n_list = list(range(1, 101))
new_list = list(filter(lambda x: x % 6 == 0, n_list))
print("n_list =", new_list)

# (3) 리스트 축약 표현 사용
new_list = [x for x in range(1, 101) if x % 6 == 0]
print("n_list =", new_list)