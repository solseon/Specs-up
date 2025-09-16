def mean_of_n(nums) :
    return sum(nums)/len(nums)

def max_of_n(nums) :
    return max(nums)

def min_of_n(nums) :
    return min(nums)

nums = list(map(int,input("정수를 여러 개 입력하시오 : ").split()))

print(f"평균값은 : {mean_of_n(nums):.1f}")
print(f"최대값은 : {max_of_n(nums):.1f}")
print(f"최소값은 : {min_of_n(nums):.1f}")