# 초기화 메소드 (생성자)

# 코드 10-4: Cat 클래스 정의와 여러 개의 객체 생성
class Cat:
    def __init__(self, name, color):
        self.name = name
        self.color = color

    def meow(self):
        print(f'내 이름은 {self.name}, 색깔은 {self.color}, 야옹야옹~~')

# 인스턴스 생성 (3개)
nabi = Cat('나비', '검은색')
nero = Cat('네로', '흰색')
mimi = Cat('미미', '갈색')

nabi.meow()
nero.meow()
mimi.meow()

# LAB 10-5: Dog 클래스와 인스턴스 생성

class Dog :
    def __init__(self, name) :
        self.name = name

    def bark(self) :
        print('멍멍~~!!')

my_dog = Dog('Jindo')
my_dog.bark()