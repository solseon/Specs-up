import time

# (1) 선형 합동법(LCG) 의사난수 생성기
# 식: X_{n+1} = (a * X_n + c) % m
# 계수: a=1103515245, c=12345, m=1000001
def my_rand(seed, count=10):
    a = 1103515245
    c = 12345
    m = 1000001
    x = seed
    for _ in range(count):
        x = (a * x + c) % m
        print(x)

# (1) 임의의 시드 값으로 10개 출력
print("실행결과")
my_rand(12345, 10)

print("\n")

# (2) time()을 시드로 사용하여 5개씩 2번 반복 출력
for i in range(2):
    print("실행결과 ")
    seed = int(time.time())  # 현재 시간(초)을 정수로 변환하여 시드로 사용
    my_rand(seed, 5)
    print()