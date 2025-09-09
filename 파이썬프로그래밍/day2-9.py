a, b, c = map(int,input("세 복권번호를 입력하시오 : ").split())
# 2 3 9 당첨번호

w1,w2,w3 = 2,3,9

count = 0

if a == w1 or a == w2 or a == w3:
    count += 1
if b == w1 or b == w2 or b == w3:
    count += 1
if c == w1 or c == w2 or c == w3:
    count += 1

if count == 3:
    print("1억원")
elif count == 2:
    print("1천만원")
elif count == 1:
    print("1만원")
else:
    print("다음 기회의...")