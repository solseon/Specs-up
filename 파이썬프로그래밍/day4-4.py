n_list = [10, 20, 30, 40, 50, 60]

print(f"리스트의 원소들 ; {n_list}")

all = 1

for i in range(0, 6):
    all = all * n_list[i]

print(f"리스트 원소들의 곱: {all}")