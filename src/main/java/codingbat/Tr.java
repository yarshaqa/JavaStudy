package codingbat;

public class Tr {
    public static int close10(int a, int b) {
        int c = (Math.abs(a - 10));
        int v = (Math.abs(b - 10));

        if (c > v) {
            return b;
        } else if (c < v) {
            return a;
        } else {
            return 0;
        }
    }

}