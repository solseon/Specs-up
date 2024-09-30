# 딕셔너리(dict) =  사전
# 키(ket)와 관련된 값(value)로 이루어진 항목(entry)들의 집합

# 딕셔너리 생성과 출력 
''' 형태
    {key:value} 
    key에는 중복되는 데이터가 불가능
    value에는 중복되는 데이터가 가능 '''

map = {'김연아':'피겨', '류현진':'야구', '쿠드롱':'당구', '메시':'축구' }
print(map)
print('쿠드롱이 뭐하는 사람이지? ', map['쿠드롱'])

# 맵에 항목 추가, 여러 항목 추가
map['나달'] = '테니스'         # map['key'] = 'value'
map.update({'최민영':'여자야구', '고진영':'골프'})
print(map)

# 딕셔너리이름.keys()는 모든 키 반환
print(map.keys()) # <- 실행결과     dict_keys(['김연아', '류현진', '쿠드롱', '메시', '나달', '최민영', '고진영'])
# 실행 결과의 dict_keys를 없애려면 list(딕셔너리이름.keys()) 함수 사용
print(list(map.keys()))

# 딕셔너리이름.values() 함수는 딕셔너리의 모든 값(value)을 리스트로 만들어 반환
print(list(map.values()))

# 딕셔너리이름.items() 함수를 사용하면 튜플 형태도 구할 수 있음
print(list(map.items()))

solseon = {'이름':'안수범', '주소':'궐동', '연락처':'010-2459-4963'}

# 딕셔너리에 키가 있다면 True를, 없다면 False를 반환
''' 예약어 in
    A in B = A가 안에 있느냐?
    있으면 True
    없으면 False를 반환 '''
print('이름' in solseon)        
print('학과' in solseon)

# for문을 활용하여 딕셔너리의 모든 값(value) 출력
singer = {}
singer['이름'] = '트와이스'
singer['구성원 수'] = 9
singer.update({'데뷔':'서바이벌 식스틴', '대표곡':'SIGNAL'})

for v in singer.keys():
    print('%s --> %s' % (v,singer[v]))