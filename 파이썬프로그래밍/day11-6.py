# 11장 예제 6번
words = ['one', 'two', 'three', 'four']

# (1) for문과 슬라이싱, upper() 사용
res1 = []
for w in words:
    res1.append(w[0].upper() + w[1:])
print(res1)

# (2) map()과 람다 사용
res2 = list(map(lambda s: s[0].upper() + s[1:], words))
print(res2)

# (3) 리스트 컴프리헨션 사용
res3 = [s[0].upper() + s[1:] for s in words]
print(res3)