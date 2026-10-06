# 오답노트들

def an1():
    a = 100
    result = 0
    for i in range(1,3):
        result = a >> i
        result += 1
    print(result)

# 얕은 복사와 깊은 복사
def f(a):
    m =[[x] for x in a]
    b = m[:]
    for i in range(len(b) - 1):
        b[i+1] += b[i]
    return sum(len(x) for x in m)

print(f([1, 2, 3, 4]))

# 조건 필터링
nums = [1,2,3,4,5]
print(sum(x * 2 for x in nums if x > 2))

# 딕셔너리, 배열과 리스트의 기초, 산술.증감 연산자
def an2():
    scores = {"Kim": [78, 92, 85], "LEE": [65, 73, 88], "Park": [91, 87, 96]}

    result = []
    for name, vals in scores.items():
        avg = sum(vals) // len(vals)
        if avg >= 85:
            result.append(name)

    top = sorted(result)
    print(len(top))
    for t in top:
        s = sum([v for v in scores[t] if v >= 90])
        print(t, s)

