public class printExample {
    public static void main(String[] args) {
        System.out.println("Hello");    // 출력 후 줄바꿈
        System.out.print("World");      // 줄바꿈 없이 출력
        System.out.println();             // 줄바꿈만
        int a = 10;
        double b = 3.14159;
        System.out.printf("%d, %.2f%n", a, b);  // 형식 지정 출력

        int c = 42;
        double d = 3.141592;

        // printf 서식 지정자 자세히 - 자릿수,정렬,반올림(실기 단골)
        System.out.printf("[%d]%n", c);
        System.out.printf("[%5d]%n", c);    // 전체폭 5, 오른쪽 정렬
        System.out.printf("[%-5d]|%n", c);   // 왼쪽 정렬
        System.out.printf("[%05d]%n", c);   // 빈 자리를 0으로 채움
        System.out.printf("[%+d]%n", c);    // 양수 부호 표시

        System.out.printf("[%f]%n", d);      // 정밀도 생략 시 기본 소수점 6자리
        System.out.printf("[%.2f]%n", d);     // 소수점 2자리까지
        System.out.printf("[%.0f]%n", d);      // 소수점 없이(정수처럼) 반올림
        System.out.printf("[%10.2f]%n", d);     // 전체폭 10 + 소수점 2자리
        System.out.printf("[%-10.2f]%n", d); 
        System.out.printf("[%010.2f]%n", d);

        int big = 1234567;
        System.out.printf("[%,d]%n", big);
        System.out.printf("[%,.2f]%n", 1234567.891);
    }
}
