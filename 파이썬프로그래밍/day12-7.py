# 예제 7
import numpy as np

def print_counts(x):
    print("x :", x)
    vals, counts = np.unique(x, return_counts=True)
    for v, c in zip(vals, counts):
        print(f"{v} : {c}번")
    print()

x1 = np.array([[10, 20, 40, 60],
               [10, 20, 40, 40]])
x2 = np.array([[80, 120, 40],
               [60, 80, 120],
               [40, 40, 40]])

print_counts(x1)
print_counts(x2)