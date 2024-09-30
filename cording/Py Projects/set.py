# 집합(set)

# set과 frozenset(내용을 변경할 수 없는 set)
s1 = {1,2,3}                # 집합 객체
s2 = {2,3,4,5}              # 집합 객체
s3 = s1.union(s2)           # 합집합
s4 = s1.intersection(s2)    # 교집합
s5 = s1 - s2                # 차집합

print("s1", s1)
print("s2", s2)
print("s3", s3)
print("s4", s4)
print("s5", s5)

s6 = { 3.14 } # 원소가 하나인 집합
map = { 3.14 : 'phi'}   # 엔트리가 하나인 딕셔너리 