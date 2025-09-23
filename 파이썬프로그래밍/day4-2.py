a = [2, 3, 4, 5, 6]
rev_a = []

for i in range(5) :
    rev_a.append(a.pop())

print(f"rev_a = {rev_a}")