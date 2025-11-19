# 예제 10
import numpy as np

n = int(input("n을 입력하시오 : "))
while n < 1:
    n = int(input("n을 입력하시오 : "))

a = np.tri(n, dtype=int)
print(a)
print("행렬의 모든 원소의 합 :", a.sum())
print("행렬의 행 방향 성분의 합 :", a.sum(axis=0))
print("행렬의 열 방향 성분의 합 :", a.sum(axis=1))