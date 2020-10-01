package chapter10;

public class Mango extends Fruit{

    public Mango(){
        setCalories(200);
    }

    public void removeSeed(){
        System.out.println("Mango's seed is removed");
    }

    public void peel(){
        System.out.println("Mango is peeled.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Mango juice is made.");
    }
}
