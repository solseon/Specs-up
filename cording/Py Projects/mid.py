# 한줄 주석
'''여러줄 주석
    여러줄 주석'''

# print end=" " 의 기능
print("gmae over")
print("game", end=" ")
print("over")
print("game")
print("over")

# 변수창출, 입력, 출력 이름은 문자열이라서 string으로 출력 char은 1바이트 크기 변수만 가능 ex)한글자
name = input("이름을 입력하시오:")
age = int(input("나이를 입력하시오:"))
print("이름:%s, 나이:%d" %(name,age))

# 여러개 입력 입력 받기 split()

# standard
a,b = input('문자열2개 space로 구분하여 입력').split()
print("a=%s, b=%s" %(a,b))

# map이용 *중요*
c,d =map(int, input("정수 2개 입력").split())
print(c,d)

''' list(리스트)
    tuple(튜플)
    dict(딕셔너리)
    set(집합)
    array(배열)
    class(클래스)
    '''