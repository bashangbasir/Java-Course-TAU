package chapter9;

public class BirthdayCake extends Cake{

    public int candles;

    public BirthdayCake() {
        super("Cookies");
    }
    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
