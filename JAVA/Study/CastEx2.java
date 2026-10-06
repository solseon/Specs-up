public class CastEx2 {
    public static void main(String[] args) {
        double d = 3.9;
        int i = (int) d;    // 명시적 캐스팅: 소수점 버림(반올림 아님)
        System.out.println(i); // 3

        char c = 'A';
        int code = c + 1;   // char가 연산에 쓰이면 자동으로 정수(아스키코드)로 취급됨
        System.out.println(code); // 66 ('A'는 아스키코드 65)
        System.out.println(c);
        char c2 = (char)(c + 1);    // 다시 char로 되돌리려면  명시적 캐스팅 필요
        System.out.println(c2);     // B

        int x = 10;
        double y = x;       // 묵시적 형변환(int -> double, 안전해서 자동으로 됨)
        System.out.println(y);  // 10.0
    }
}
