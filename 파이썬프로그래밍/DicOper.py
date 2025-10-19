person = {'이름' : '홍길동', '나이' : 26, '몸무게' : 82}
subeom = {'이름' : '안수범', '나이' : 24, '몸무게' : 70}

print(len(person))

print('이름' in person)

print('직업' in person)

print(person == subeom)

# print( person > subeom) 딕셔너리는 비교연산자 지원 X

# LAB 7-3: 딕셔너리와 연산
capital_dic = {'Korea' : 'Seoul', 'China' : 'Beijing', 'USA' : 'Washington DC'}

print('Korea' in capital_dic)
print('China' in capital_dic)
print('Indonesia' in capital_dic)
print('Beijing' in capital_dic)