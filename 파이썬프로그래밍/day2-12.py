
while True:
    dan = int(input("1에서 9까지의 수를 입력하시오 : "))
    if dan > 0 and dan < 9:
        for i in range(1, 10):
            print(dan , "*", i, "=", (dan*i))
    else:
        dan = int(input("1에서 9까지의 수를 다시 입력하세요 : "))
        for i in range(1, 10):
            print(dan , "*", i, "=", (dan*i))
    break
        

    