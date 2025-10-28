# 11장 예제 2번
n_list = [44, 66, 34, 24, 144, 98, 38, 568, 234, 345]
# for문과 if 조건식 사용
n_list = [44, 66, 34, 24, 144, 98, 38, 568, 234, 345]
new_list = []
for n in n_list:
    if n % 12 == 0:
        new_list.append(n)
print(new_list)

# filter() 함수, 람다 함수 사용
n_list = [44, 66, 34, 24, 144, 98, 38, 568, 234, 345]
new_list = list(filter(lambda x: x % 12 == 0, n_list))
print(new_list)

# 리스트 축약 표현 사용
n_list = [44, 66, 34, 24, 144, 98, 38, 568, 234, 345]
new_list = [x for x in n_list if x % 12 == 0]
print(new_list)