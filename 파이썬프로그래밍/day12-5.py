# 예제 5
import numpy as np

n = int(input("n을 입력하시오 : "))
while n < 2:
    n = int(input("n을 입력하시오 : "))

a = np.diag(np.arange(1, n+1))
print(a)