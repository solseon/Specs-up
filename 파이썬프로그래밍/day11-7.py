# 11장 예제 7번
days = ['sunday', 'monday', 'tuesday', 'wednesday', 'thursday', 'friday', 'saturday']

# (1) for문과 슬라이싱, upper() 사용
res1 = []
for d in days:
    res1.append(d[:3].upper())
print(res1)

# (2) map()과 람다 사용
res2 = list(map(lambda s: s[:3].upper(), days))
print(res2)

# (3) 리스트 컴프리헨션 사용
res3 = [s[:3].upper() for s in days]
print(res3)