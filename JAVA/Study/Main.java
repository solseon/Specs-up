public class Main {
        int func(int a, int b) {
        return a + b;
    }

    int func(char a, char b) {
        return b - a;
    }

    char func(char a) {
        return a;
    }

    public static void main(String[] args) {
        Main m = new Main();
        int r1 = m.func(4, 5);      // 9
        int r2 = m.func('A', 'C');  // 아스키코드 67 - 65 = 2
        char r3 = m.func('3');      // '3'

        System.out.println(r1 + r2 + "2" + r3);
    }
}
