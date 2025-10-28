# 11장 예제 3번
# for 문과 if 조건식, append() 메소드를 사용
n_list = [-22.3, 29.44, 902.2, 45.7, -887.1, -56.3]
new_list = []
for x in n_list:
    if x > 0:
        new_list.append(int(x))
print(new_list)  # 출력: [29, 902, 45]

# filter() 함수, map()함수와 람다 함수를 사용
n_list = [-22.3, 29.44, 902.2, 45.7, -887.1, -56.3]
# 먼저 양수만 필터, 그 다음 정수로 변환(map)
new_list = list(map(lambda v: int(v), filter(lambda v: v > 0, n_list)))
print(new_list)  # 출력: [29, 902, 45]

# 리스트 축약 표현을 이용
n_list = [-22.3, 29.44, 902.2, 45.7, -887.1, -56.3]
new_list = [int(x) for x in n_list if x > 0]
print(new_list)  # 출력: [29, 902, 45]
