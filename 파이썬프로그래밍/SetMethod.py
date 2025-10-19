# 집합의 메소드
# 대화창 실습: 집합과 연산
s1 = {1,2,3,4,5,6}
s2 = {4,5,6,7,8,9}
print(s1 | s2) # 합집합 == s1.union(s2)
print(s1 & s2) # 교집합 == s1.intersection(s2)
print(s1 - s2) # 차집합 == s1. difference(s2)
print(s1 ^ s2) # 대칭 차집합 == s1. symmetric_difference(s2)

# 결과 예측
ss1 = {10,20,30,40}
ss2 = {30,40,50,60,70}

print(ss1 | ss2)    # 10,20,30,40,50,60,70
print(ss1 & ss2)    # 30,40
print(ss1 - ss2)    # 10,20
print(ss1 ^ ss2)    # 10,20,50,60,70
print(ss1.issubset(ss2))    # False
print(ss1.issuperset(ss2))  # False
print(ss1.isdisjoint(ss2))  # False