# 예제 6
import numpy as np

a = np.array([0, 10, 20, 40, 60, 80])
b = np.array([0, 20])

print("a 배열 :", a)
print("b 배열 :", b)
print(np.isin(a, b))