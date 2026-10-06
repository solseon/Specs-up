import java.util.Scanner;
// 생성자
// : 객체가 new로 생성될 때 자동으로 호출되어 초기화를 담당하는 특수한 메서드.
// 클래스 이름과 동일하고, 리턴 타입이 없다(void도 안 씀). 생성자도 오버로딩이 가능하다.
class Person {
    String name;
    int age;

    // 기본 생성자 - 다른 생성자를 this()로 호출
    public Person() {
        this("이름없음", 0);
    }

    // 매개변수가 있는 생성자 - 오버로딩
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() { System.out.println(name + " , " + age); }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("안수범", 25);
        p1.print();
        p2.print();

        Person p3 = new Person();

        Scanner sc =  new Scanner(System.in);

        System.out.println("이름 입력: ");
        p3.name = sc.nextLine();

        System.out.println("나이 입력: ");
        p3.age = sc.nextInt();

        p3.print();
    }  
}
