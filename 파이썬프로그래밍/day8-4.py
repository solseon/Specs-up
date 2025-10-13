import random

romeo = random.randrange(1, 7)
juliet = random.randrange(1, 7)

print(f"로미오의 주사위 숫자는 {romeo}입니다.")
print(f"줄리엣의 주사위 숫자는 {juliet}입니다.")

if romeo > juliet:
    print("로미오가 이겼습니다.")
elif romeo < juliet:
    print("줄리엣이 이겼습니다.")
else:
    print("비겼습니다.")