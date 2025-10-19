# 코드 7-1: 리스트의 항목 삭제와 lst[1] 항목의 변화 여부
lst = [11, 22, 33, 44, 55]
print('pop(0) 이전 :', lst)
print('pop(0) 이전 : lst[1] = ', lst[1])
lst.pop(0) # 인덱스 0을 이용하여 리스트의 첫 항목을 삭제한다.
print('pop(0) 이후 :', lst)
print('pop(0) 이후 lst[1] = ', lst[1])

print('-----------------')

# 코드 7-2: 딕셔너리의 항목 삭제와 dic[1] 항목의 변화 여부
dic = {0:11, 1:22, 2:33, 3:44, 4:55}
# 딕셔너리 (키, 값) 튜플쌍을 반환하는 items() 함수로 항목 출력
print('pop(0) 이전 :', dic.items())
print('pop(0) 이전 dic[1] = ', dic[1])
dic.pop(0) # 키 0을 이용하여 (0, 11) 항목을 삭제하였음
print('pop(0) 이후 :', dic.items())
print('pop(0) 이후 dic[1] = ', dic[1])

# LAB 7-5: 딕셔너리의 활용
fruits_dic = {'apple' : 6000, 'melon' : 3000, 'banana' : 5000, 'orange' : 4000}
key_list = list(fruits_dic.keys())
print(key_list)

value_list = list(fruits_dic.values())
print(value_list)

print('fruits_dic 딕셔너리의 항목의 개수 : ', len(fruits_dic))

if 'apple' in fruits_dic :
    print('apple is in fruits_dic.')
else :
    print('apple is not in fruits_dic.')

if 'mango' in fruits_dic :
    print('mango is in fruits_dic.')
else :
    print('mango is not in fruits_dic.')