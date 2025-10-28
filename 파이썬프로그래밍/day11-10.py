# 11장 예제 10번
test_list = ['No. 224', 'No. 587', 'No. 29', 'No. 37']

# (1) for문과 split() 사용
num_list = []
for item in test_list:
    num = int(item.split()[1])
    num_list.append(num)
print("test_list =", test_list)
print("num_list =", num_list)

# (2) 리스트 축약 표현 사용
num_list2 = [int(item.split()[1]) for item in test_list]
print("num_list =", num_list2)