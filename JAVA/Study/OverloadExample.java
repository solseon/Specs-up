public class OverloadExample {
    // 오버로딩 
    // :같은 이름의 메서드를 매개변수(개수 또는 타입)를 다르게 해서 여러 개 정의하는 것. 
    //  어떤 메서드가 호출될지는 컴파일 시점에, 넘겨준 인자의 개수,타입을 보고 결정된다(정적 바인딩)

    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }

    public static void main2(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.5, 2.5));
        System.out.println(add(1, 2, 3));
    }
}
