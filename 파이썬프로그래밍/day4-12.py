list1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

print(f"실행전 {list1}")

new_list1 = [-x if 2 < x < 9 else x for x in list1]

print(f"실행후 {new_list1}")