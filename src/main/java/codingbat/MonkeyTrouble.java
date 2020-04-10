package codingbat;

public class MonkeyTrouble {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

//  boolean a =(aSmile && bSmile)
        return (aSmile && bSmile || !aSmile && !bSmile);
    }

}
