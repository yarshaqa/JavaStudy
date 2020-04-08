package codingbat;

import java.lang.Math;


public class q {
    public static void main(String[] args) {

        int n = 90;
        boolean e = true;


        if (((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10))) {

            System.out.println(e);

        } else {
            System.out.println(!e);
        }
    }
}

