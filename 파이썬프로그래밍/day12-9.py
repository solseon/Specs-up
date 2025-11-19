# 예제 9
import numpy as np

n = int(input("n을 입력하시오 : "))
a = np.zeros((n, n), dtype=int)
idx = np.arange(n)
a[idx, idx] = 1
a[idx, n - 1 - idx] = 1
print(a)