package codingbat;

import java.util.Scanner;


public class Warmup {

    public static int main(String[] args) {

        Scanner vvedit = new Scanner(System.in);

        System.out.print("вава");

        int a = vvedit.nextInt();

        Scanner vvedit2 = new Scanner(System.in);
        System.out.println("vvedit druge chyslo");

        int b = vvedit2.nextInt();

        if (a > b) {

            return a;
        } else {
            return b;
        }
    }


    public int max1020(int a, int b) {


        if (a > b)
            return a;
        else
            return b;

    }

}



