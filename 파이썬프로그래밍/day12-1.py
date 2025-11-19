# 예제 1
import numpy as np

a = np.arange(1, 11)
print("a =", a)

a = a[::-1]
print("a =", a)

a = a.reshape(2, 5)
print("a =", a)

a = a.reshape(5, 2)
print("a =", a)