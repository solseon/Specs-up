import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ad {
    public static void main(String[] args) {
        problem();
    }

    // 1
    public static void hash() {
        Set a = new HashSet();

        a.add(7);
        System.out.println(a);

        a.add(5);
        System.out.println(a);

        a.add(5);
        System.out.println(a);

        a.remove(5);
        System.out.println(a);

        System.out.println(a.size());
    }

    // 2
    public static void scan() {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.printf("%d", a + b);
    }

    // 3
    public static void impl() {
        int a = 12, b = 5, sum = 2;
        b *= a /= 4;
        sum += ++a * b-- / 4;
        System.out.printf("%d", sum);
    }

    // 4
    public static void impl2() {
        int a = 5, b = 9, c;
        c = b % 5 < 5 ? 1 : 0;
        c = c | c << 3;
        c = a < 5 || c >= 10 ? c - a : c + a;

        System.out.printf("%d", c);
    }

    // 5
    public static void problem() {
        int i = 0, hap = 0;
        do {
            ++i;
            hap += i;
        } while (i < 5);
        System.out.printf("%d, %d\n", i, hap);
    }

    // 6
    static class SuperObject {
        public void paint() {
            draw();
        }

        public void draw() {
            draw();
            System.out.println("Super Object");
        }
    }

    static class SubObject extends SuperObject {
        public void paint() {
            super.draw();
        }

        public void draw() {
            System.out.println("Sub Object");
        }
    }

    public class Test {
        public static void main(String[] args) {
            SuperObject a = new SubObject();
            a.paint();
        }
    }

    // 7
    public static void sosu() {
        int p = 2, n = 3;
        while(true) {
            double t =  Math.sqrt(n);
            int m = (int)t;
            for(int i = 2; i <= m; i++) {
                int r = n % i;
                if(r == 0) break;
                if(i == m) p = n;
            }
            n++;
            if(n > 100) break;
        }
        System.out.println(p);
    }

}