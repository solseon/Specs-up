public class Main3 {
    static int fn(int[] a, int st, int end) {
        if ( st >= end) return 0;
        int mid = (st + end) / 2;
        return a[mid] + Math.max(fn(a, st, mid), fn(a, mid + 1, end));
    }
    public static void main(String[] args) {
        int[] values = {3, 5, 8, 12, 17};
        System.out.println(fn(values, 0, values.length - 1));
    }
}