package codingbat;

public class icyHot {


    public boolean icyHot(int temp1, int temp2) {


        boolean c = (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100) ;

        return c;
    }


}
