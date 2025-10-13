# 1부터 1,000,000까지의 합을 구하는 함수
def sum1to1000000():
	"""
	1부터 1,000,000까지의 정수의 합을 반환하는 함수
	"""
	return sum(range(1, 1000001))

import time

# (1) 1번 실행 시간 측정
start = time.time()  # 시작 시간 기록
result = sum1to1000000()  # 함수 실행
end = time.time()    # 종료 시간 기록
print(f"1에서 1,000,000까지의 합을 구하는 시간 : {end - start:.4f}초")

# (2) 100번 반복 실행 시간 측정
start = time.time()  # 시작 시간 기록
for _ in range(100):
	sum1to1000000()   # 함수 100번 반복 실행
end = time.time()    # 종료 시간 기록
print(f"1,000,000까지의 합을 100번 반복해서 구하는 시간 : {end - start:.4f}초")
