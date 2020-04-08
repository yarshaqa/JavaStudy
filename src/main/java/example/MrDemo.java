package example;

import static example.MrMax.max;

public class MrDemo {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 10;
        int d = 4;

        int maxTwoNumbers = max(b, c);
        int maxFourNumbers = max(a, b, c, d);

        System.out.println(maxTwoNumbers);
        System.out.println(maxFourNumbers);

    }

}
