// 오버라이딩
// :부모 클래스의 메서드를 자식 클래스에서 "이름,매개변수,리턴타입을 동일하게 유지한 채 다시 구현(재정의)"하는 것.
//  실행 시점에 실제 객체 타입을 기준으로 어떤 메서드가 실행될지 결정된다(동적 바인딩).
class Animal {
    public String sound() { return ". . ."; }
}

class Dog extends Animal {
    @Override
    public String sound() { return "멍멍"; }
}

class Cat extends Animal {
    @Override
    public String sound() { return "야옹야옹~ㅋ"; }
}

public class OverrideExample {

    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        System.out.println(a.sound());
        System.out.println(b.sound());
    }
}
