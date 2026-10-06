public class StringEx {
    public static void main(String[] args) {
        String a = "hello";
        System.out.println(a.length());                 // 5 (글자 수)
        System.out.println(a.charAt(1));          // e (인덱스 1의 문자)
        System.out.println(a.substring(1,3));   // el (인덱스 1~2, 끝 인덱스 3은 미포함)

        String b = new String("hi");    // new로 만든 문자열 객체
        String c = new String("hi");   
        System.out.println(b == c);             // false
        System.out.println(b.equals(c));        // true

        String d = "hi";    // 문자열 리터럴(문자열 상수 풀 사용)
        String e = "hi";
        System.out.println(d == e); // true
    }
}
