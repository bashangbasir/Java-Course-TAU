package chapter14;

import java.util.Random;

public class Coin {

    private String side;
    public static String HEADS = "heads";
    public static String TAILS = "tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip(){
        if(new Random().nextBoolean()){
            //if true set HEADS
            setSide(HEADS);
        }else{
            // if false set TAILS
            setSide(TAILS);
        }
        return getSide();
    }
}
