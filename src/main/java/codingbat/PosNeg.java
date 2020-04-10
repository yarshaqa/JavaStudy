package codingbat;

public class PosNeg {

    public boolean posNeg(int a, int b, boolean negative) {

        boolean v = (a < 0 && b < 0);
        boolean c = (a < 0 && b > 0) || (a > 0 && b < 0);

        if (negative == true) {


            return v;
        } else {
            return c;
        }


    }

}
