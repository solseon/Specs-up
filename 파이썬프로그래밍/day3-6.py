def mean3(a, b, c) :
    return print(f"{a}, {b}, {c}의 평균값은 {(a+b+c)/3}")

def max3(a, b, c) :
    if((a > b) & (a > c) ) :
        return print(f"{a}, {b}, {c}의 최댓값은 {a:.1f}")
    elif((b > a) & (b > c)) :
        return print(f"{a}, {b}, {c}의 최댓값은 {b:.1f}")
    else :
        return print(f"{a}, {b}, {c}의 최댓값은 {c:.1f}")
    
def min3(a, b, c) :
    if((a < b) & (a < c) ) :
        return print(f"{a}, {b}, {c}의 최솟값은 {a:.1f}")
    elif((b < a) & (b < c)) :
        return print(f"{a}, {b}, {c}의 최솟값은 {b:.1f}")
    else :
        return print(f"{a}, {b}, {c}의 최솟값은 {c:.1f}")
    
a, b, c = map(int,input("세 정수를 입력하시오 : ").split())
mean3(a, b, c)
max3(a, b, c)
min3(a, b, c)