# 문자열화 메소드
# 코드 10-5: __str__ 메소드와 print() 함수에서 적용하기
class Cat :
    def __init__(self, name, color) :
        self.name = name
        self.color = color

    def __str__(self) :
        return f'Cat(name = {self.name}, color = {self.color})'
    
nabi = Cat('나비', '검은색')
nero = Cat('네로', '흰색')

print(nabi)
print(nero)

# LAB 10-6: Dog 클래스와 문자열화 메소드
class Dog :
    def __init__(self, name):
        self.name = name

    def __str__(self):
        print('my_dog의 정보 :', self.name)

my_dog = Dog('Jindo')
my_dog.__str__()