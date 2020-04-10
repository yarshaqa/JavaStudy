package codingbat;

public class Max1020 {

    public boolean posNeg(int a, int b, boolean negative) {

        boolean c = (((a < 0 && b > 0) || (b < 0 && a > 0)) && negative == false);
        boolean v = ((a < 0 && b < 0) && negative == true);
        boolean n = true;

        if (c == true) {
            return c;
        } else if (v == true) ;
        {
            return v;
        }
    }

}
