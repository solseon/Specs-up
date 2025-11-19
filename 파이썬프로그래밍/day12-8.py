# 예제 8
import numpy as np

a = np.array([0, 10, 20, 40, 60, 80])
b = np.array([0, 20])

print("a 배열 :", a)
print("b 배열 :", b)

# (1) for문과 numpy.append() 사용
res = np.array([], dtype=int)
for x in a:
    if not np.any(b == x):
        res = np.append(res, x)
print("a - b :", res)

# (2) numpy.setdiff1d() 사용
res2 = np.setdiff1d(a, b)
print("a - b :", res2)