import math

def area_and_circumference(r):
    area = math.pi * r * r
    circumference = 2 * math.pi * r
    return area, circumference

while True:
    r = float(input("반지름을 입력하시오 : "))
    if r < 0:
        print("프로그램을 종료합니다.")
        break
    area, circumference = area_and_circumference(r)
    print("넓이 : {0:7.3f}, 둘레 : {1:7.3f}".format(area, circumference))
