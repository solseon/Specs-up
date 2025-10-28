# 11장 예제 4번
from functools import reduce


def part1_builtin(n_list):
	print("n_list =", n_list)
	print("최대값 :", max(n_list))
	print("최소값 :", min(n_list))


def my_max(n_list):
	if not n_list:
		raise ValueError("빈 리스트에는 최대값이 없습니다.")
	m = n_list[0]
	for v in n_list[1:]:
		if v > m:
			m = v
	return m


def my_min(n_list):
	if not n_list:
		raise ValueError("빈 리스트에는 최소값이 없습니다.")
	m = n_list[0]
	for v in n_list[1:]:
		if v < m:
			m = v
	return m

# 직접 구현한 함수 사용
def part2_custom(n_list):
	print("n_list =", n_list)
	print("최대값 :", my_max(n_list))
	print("최소값 :", my_min(n_list))

# reduce() 사용
def part3_reduce(n_list):
	print("n_list =", n_list)
	max_val = reduce(lambda a, b: a if a > b else b, n_list)
	min_val = reduce(lambda a, b: a if a < b else b, n_list)
	print("최대값 :", max_val)
	print("최소값 :", min_val)


if __name__ == '__main__':
	n_list = [-22.3, 29.44, 902.2, 45.7, -887.1, -56.3]
	part1_builtin(n_list)
	part2_custom(n_list)
	part3_reduce(n_list)
