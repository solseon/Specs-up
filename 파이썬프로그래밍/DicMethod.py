# 대화창 실습: 딕셔너리의 keys(), values(), items() 메소드
person = {'이름' : '홍길동', '나이' : 26, '몸무게' : 82}
print(person.keys()) # 키 반환
print(person.values()) # 값 반환
print(person.items()) # 키, 값 모두 반환

# 대화창 실습: 딕셔너리의 get() 메소드
print(person.get('취미'))
print(person.get('이름'))

# 대화창 실습: 딕셔너리의 메소드 살펴보기
print(person.popitem())
print(person)
print(person.pop('나이'))
print(person)
person.clear()
print(person)

# LAB 7-4: 딕셔너리의 활용
fruits_dic = {'apple' : 6000, 'melon' : 3000, 'banana' : 5000, 'orange' : 7000}
print(fruits_dic)
print(fruits_dic.keys())
print(fruits_dic.values())
print(fruits_dic.pop('apple'))
print(fruits_dic.clear())
print(fruits_dic)

# 대화창 실습: for 문을 이용한 딕셔너리 순회
person = {'이름' : '홍길동', '나이' : 26, '몸무게' : 82}
for key in person:
    print('{} : {}'.format(key, person[key]))