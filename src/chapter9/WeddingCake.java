package chapter9;

public class WeddingCake extends Cake{

    public int tiers;

    public WeddingCake() {
        super("Red Velvet");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
