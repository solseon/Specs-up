def sum_range(n1, n2):
    return sum(range(n1, n2 + 1))

print("{}에서 {}까지의 정수의 합 : {}".format(10, 20, sum_range(10, 20)))
print("{}에서 {}까지의 정수의 합 : {}".format(40, 100, sum_range(40, 100)))
