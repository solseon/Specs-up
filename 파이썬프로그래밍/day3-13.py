def fibo(n):
    if n == 0 or n == 1:  
        return 1
    else:
        return fibo(n-1) + fibo(n-2)

n = int(input("fibo(n)의 n값을 입력하시오 : "))

print("fibo({}) = {}".format(n, fibo(n)))
