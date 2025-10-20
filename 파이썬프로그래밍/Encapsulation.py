# 캡슐화
# 코드 10-6: nabi.age에 직접 값을 할당하기
class Cat:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __str__(self):
        return f'Cat(name = {self.name}, age = {self.age})'
    
nabi = Cat('나비', 3)
print(nabi)
nabi.age = -5
print(nabi)

print('------------')

# 코드 10-7: set_age() 메소드를 통해서 age 값을 할당하기
# self.__name <- 외부에 공개하고 싶지 않은 속성은 이런식으로 캡슐화
class Cat:
    def __init__(self, name, age):
        self.__name = name # Cat 클래스의 인스턴스 변수를 감추는 역할
        self.__age = age 

    def __str__(self):
        return f'Cat(name = {self.__name}, age = {self.__age})'
    
    def set_age(self, age):
        if age > 0 :
            self.__age = age
        
    def get_age(self) :
        return self.__age
    
nabi = Cat('나비', 3)
print(nabi)
nabi.set_age(4)
nabi.set_age(-5)
print(nabi)