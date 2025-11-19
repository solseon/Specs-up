# 예제 11
import numpy as np

a = np.array([[0,0,0,0,0],
              [0,1,1,1,0],
              [0,1,2,1,0],
              [0,1,1,1,0],
              [0,0,0,0,0]])

b = a[1:4, 1:4]
c = a[0:3, 0:3]
d = a[0:3, 1:4]
e = a[1:4, 2:5]
f = a[2, :]

print(b)
print()
print(c)
print()
print(d)
print()
print(e)
print()
print(f)