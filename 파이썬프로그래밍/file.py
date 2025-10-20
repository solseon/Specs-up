# 파일 입출력

# 파일 쓰기 모드
f = open('hello.txt', 'a')
f.write('안수범!')
f.close()

s = open('number.txt', 'w')
s.write('100\n')
s.write('200\n')
s.write('300\n')
s.write('400')
# 파일 읽기 모드

# 코드 9-11: 파일 열기와 읽기, 파일 닫기의 표현

f = open('hello.txt', 'r')
s = f.read()
print(s)
f.close()

# 코드 9-12: read() 메소드를 이용하여 지정된 문자 크기만큼 읽기
f = open('hello.txt', 'r')
s = f.read(5) # hello.txt 파일의 다섯 문자를 읽는다.
print(s)
f.close()

# 코드 9-13: readline() 메소드를 이용한 줄 단위 읽기와 출력하기
f = open('number.txt', 'r') # 파일 열기
s = f.readline()    # 파일의 첫 번째 줄 '100'을 읽어온다.
print(s, end = '')  # 이 줄을 출력
s = f.readline()    # 파일의 두 번째 줄 '200'을 읽어온다.
print(s, end = '')  # 이 줄을 출력
f.close()

# 코드 9-14: readline() 메소드와 rstrip()을 이용한 줄 단위 읽기와 출력
f = open('number.txt', 'r')
s = f.readline().rstrip()   # '100'을 읽고 오른쪽에 있는 모든 공백문자를 지움
print(s)
s = f.readline().rstrip()   # '200'을 읽고 오른쪽에 있는 모든 공백문자를 지움
print(s)
f.close()

# 코드 9-16: 사용자로부터 입력받은 다섯 개의 정수를 저장하는 프로그램

f = open ('data5.txt' , 'w')
for _ in range(5) :
    n = input('정수를 입력하세요: ')
    f.write(n)
    f.write('\n')
f.close()