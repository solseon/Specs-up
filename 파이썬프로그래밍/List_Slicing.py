# 리스트 내의 항목을 특정한 구간별로 선택하여 잘라내는 기능
# 구간을 명시하기 위해 리스트_이름[start : end] 문법 사용
# end-1까지(end 미만)의 항목을 새 리스트에 삽입
a_list = [10,20,30,40,50,60,70,80]
print(a_list[1:5])
print(a_list[0:5])
print(a_list[1:])
print(a_list[:5])
print(a_list[:]) # 모든 항목 가져오기
print(a_list[-7:-2])
print(a_list[-7:])
print(a_list[:-2])

# LAB 6-7: 리스트의 슬라이싱

# 1.range(15) 함수를 사용하여 다음과 같은 리스트를 생성하여라.
# n_list = [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14]
n_list = list(range(15))
print(n_list)

# 문제 1번의 n_list로부터 슬라이싱을 수행하여 다음과 같은 리스트를 생성하여라.
print('문제 2번 시작')
print(n_list[:5])
print(n_list[5:11])
print(n_list[11:])
print(n_list[2:11:2])
print(n_list[10:5:-1])
print(n_list[10:1:-2])