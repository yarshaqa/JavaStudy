package codingbat;

public class nearHundred {


    public boolean nearHundred(int n) {


        boolean e = true;

        if (((Math.abs(100 - n) <=10 ) || (Math.abs(200-n) <=10))){

            return e;
        }
        else {return !e;

        }

    }

}
