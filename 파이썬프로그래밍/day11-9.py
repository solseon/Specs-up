# 11장 예제 9번
fruits_list = ['Apple = 사과', 'Strawberry = 딸기', 'Peach = 복숭아', 'Grape = 포도']

# (1) for문을 사용하여 딕셔너리 생성
fruits = {}
for item in fruits_list:
    k, v = item.split(' = ')
    fruits[k] = v
print("fruits_list =", fruits_list)
print("fruits =", fruits)

# (2) 리스트 축약으로 (key, value) 튜플 생성 후 dict()로 변환
tuples = [(s.split(' = ')[0], s.split(' = ')[1]) for s in fruits_list]
fruits_from_tuples = dict((k, v) for k, v in tuples)
print("fruits_from_tuples =", fruits_from_tuples)

# (3) (2)번 결과를 이용하여 값:키 형태의 rev_fruits 생성
rev_fruits = {v: k for k, v in fruits_from_tuples.items()}
print("rev_fruits =", rev_fruits)