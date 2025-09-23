a= [1, 2, 3, 4, 5]
b= [1, 3, 3, 4, 5, 6, 7]

print(f"a = {a}")
print(f"b = {b}")

result = [x for x in a if x in b]

print(f"결과 = {result}")
