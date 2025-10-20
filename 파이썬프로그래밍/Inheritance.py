# 클래스와 상속 1
# 코드 10-14: 클래스 A를 상속받는 클래스 B
class A:
    PI = 3.14

class B(A):
    pass

a = A()
b = B()
print('a.PI =', a.PI)
print('b.PI =', b.PI)
#LAB 10-10: 상속의 구현
class Person:
    def __init__(self, name):
        self.name = name
    
class Professor(Person):
    pass

pf = Professor('홍길동')

print('담당교수 :', pf.name)

#코드 10-15: 하나의 클래스를 상속받는 다른 두 클래스
class Person():
    def __init__(self, name):
        self.name = name
    def get_name(self):
        return self.name
    
class Manager(Person):
    def __init__(self, name, position):
        Person.__init__(self, name)
        self.position = position
    def info(self):
        return f'관리직 : {self.get_name()}, 직책 : {self.position}'
    
class Employee(Person):
    def __init__(self, name, salary=100):
        Person.__init__(self, name)
        self.salary = salary
    def get_salary(self):
        return f'종업원 : {self.get_name()}, 급여 : {self.salary}'
    
cto = Manager('박동민', '최고기술책임자(CTO)')
worker1 = Employee('박동윤', 320)
worker2 = Employee('홍승주', 250)

print(cto.info())
print(worker1.get_salary())
print(worker2.get_salary())