n_list = [10, 20, 30, 40, 50, 60]

print(f"리스트의 원소들 : {n_list}")
for i in range(0,len(n_list) - 1):
    if n_list[i] > n_list[i+1]:
        max = n_list[i]
    else:
        max = n_list[i+1]
    
print(f"리스트 원소들중 최대값 : {max}")
