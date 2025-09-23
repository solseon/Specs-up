list1 = ['aba', 'xyz', 'abc', '121']

count = 0

for i in list1:
    if len(i) > 0 and i[0] == i[-1]:
        count += 1

print(f"문자열의 개수 = {count}")