# 클래스의 상속 2
# super() 함수 - 부모 클래스의 속성을 사용하고 싶은데 이름이 생각나지 않거나 부모 클래스의 이름이 너무 길 경우에 사용
class Person:
    def __init__(self, name):
        self.name = name
    def get_name(self):
        return self.name

class Employee(Person): # Person 클래스의 자식 클래스
    def __init__(self, name, salary=100):
        super().__init__(name)  # 부모 클래스 접근에 super() 사용
        self.salary = salary
    def get_salary(self):
        # 부모 클래스 접근에 super() 사용
        return f'종업원 : {super().get_name()}, 급여 : {self.salary}'
    
worker1 = Employee('박동윤', 320)

print(worker1.get_salary())

print('---------------')

# 코드 10-16: 클래스 A를 상속받는 클래스 B
class Person:
    def __init__(self, name):
        self.name = name
    def get_name(self):
        return self.name

class Employee(Person):
    def __init__(self, name, salary=100):
        super().__init__(name)
        self.salary = salary
    def get_salary(self):
        return f'종업원 : {super().get_name()}, 급여 : {self.salary}'
    
worker1 = Employee('박동윤', 320)

print(worker1.get_salary())

print('---------------')

# 클래스 변수
# 코드 10-19: Circle 클래스의 인스턴스와 인스턴스 속성 PI
class Circle:
    def __init__(self, name, radius, PI):
        self.__name = name
        self.__radius = radius
        self.__PI = PI

    # 현재 인스턴스의 PI에 반지름**2를 곱하여 면적을 구함
    def area(self):
        return self.__PI * self.__radius ** 2
    
c1 = Circle('C1', 4 , 3.14)
print('c1의 면적:', c1.area())
c2 = Circle('C2', 6 , 3.141)
print('c2의 면적:', c2.area())
c3 = Circle('C3', 5 , 3.1415)
print('c3의 면적:', c3.area())

print('---------------')

# 코드 10-20: Circle 인스턴스와 클래스 변수 PI

class Circle:
    PI = 3.1415 # 클래스 변수
    def __init__(self, name, radius):
        self.__name = name
        self.__radius = radius

    # Circle 클래스의 변수 PI를 이용하여 면적을 구함
    def area(self):
        return Circle.PI * self.__radius ** 2
    
c1 = Circle('C1', 4)
print('c1의 면적:', c1.area())
c2 = Circle('C2', 6)
print('c2의 면적:', c2.area())
c3 = Circle('C3', 5)
print('c3의 면적:', c3.area())
    
