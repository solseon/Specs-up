# 11장 예제 8번
fruits = {'Apple': '사과', 'Strawberry': '딸기', 'Peach': '복숭아', 'Grape': '포도'}

for k, v in fruits.items():
    print(k, v)

# (1) for문 사용
res1 = []
for k, v in fruits.items():
    res1.append(f"{k} = {v}")
print(res1)

# (2) map()과 람다 사용
res2 = list(map(lambda kv: f"{kv[0]} = {kv[1]}", fruits.items()))
print(res2)

# (3) 리스트 컴프리헨션 사용
res3 = [f"{k} = {v}" for k, v in fruits.items()]
print(res3)