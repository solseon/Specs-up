public class FiboEx {
    static int fibo(int n) {
        if (n <= 1) return n;               // 종료 조건
        return fibo(n - 1) + fibo(n - 2);   // 재귀 호출이 두 번 갈라짐
    }
    public static void main(String[] args) {
        for (int i = 0; i < 8; i ++) {
            System.out.println(fibo(i) + " ");
        }
    }
}