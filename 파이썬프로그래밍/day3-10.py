def my_sort(*nums) :
    num_list = list(nums)

    num_list.sort()

    print(f"결과 : {num_list}")

print("mysort(45, 3, 4, 56, 5) 호출시")
my_sort(45, 3, 4, 56, 5)
print("mysort(9, 8, 7, 6, 5, 4) 호출시")
my_sort(9, 8, 7, 6, 5, 4)