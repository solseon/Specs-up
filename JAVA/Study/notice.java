public class notice {
    public static void main(String[] args) {
        Main m = new Main();
        int r1 = m.func(4, 5);
        int r2 = m. func('A', 'C');
        char r3 = m.func('3');
        pr1();
    }

    public static void pr1() {
        int i = 3;
        int k = 1;
        switch(i) {
            case 0:
            case 1:
            case 2:
            case 3: k = 0;
            case 4: k += 3;
            case 5: k -= 10;
            default: k--;
        }
        System.out.print(k);
    }

    public  static class Main {
        int func(int a, int b) {
            return a + b;
        }

        int func(char a, char b) {
            return b - a;
        }

        char func(char a) {
            return a;
        }
    }
}