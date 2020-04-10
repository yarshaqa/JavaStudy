package codingbat;

public class HasTeen {
    public boolean hasTeen(int a, int b, int c) {

        boolean r = (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19);

        return (r);

    }

}
