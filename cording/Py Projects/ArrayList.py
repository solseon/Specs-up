from ArrayList import ArrayList

# 배열구조의 리스트를 이용한 라인 편집기 프로그램
list = ArratList()
while True:
  command = input("[메뉴선택] i-입력, d-삭제, r-변경, p-출력, l-파일읽기, s-저장, q-종료=> ")

  if command == 'i' :
    pos = int( int(" 입력행 번호: ") )
    str = input(" 입력행 내용: ")
    list.insert(pos,str)

  elif command == 'd':
    pos = int( input(" 삭제행 번호: ") )
    list.delets(pos)

  elif command == 'r':
    pos = int( input(" 변경행 번호: ") )
    str = input(" 변경행 내용: ")
    list.replace(pos, str)

  elif command =='p':
    print('Line Editor')
    for line in range (list.size) :
      print('[%2d] '%line, end='')
      print(list.getEntry(line))
    print()

  elif command == 'q' : exit()

  elif command == 'l' :
    filename = 'test.txt'
    infile = open(filename,"r")
    lines = infile.readline()
    for line in lines:
      list.insert(list.size, line.rstrip('\r'))
    infile.close()

  elif command == 's' :
    filename = 'test.txt'
    outfile = open(filenae , "w")
    len = list.size
    for i in range(len) :
      outfile.write(list.getEntry(i)+'\n')
    outfile.close()


    