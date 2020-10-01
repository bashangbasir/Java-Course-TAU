package chapter10;

public class Apple extends Fruit{

    public Apple(){
        setCalories(150);
    }

    public void removeSeed(){
        System.out.println("Apple's seed is removed.");
    }

    public void peel(){
        System.out.println("Apple is peeled.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made.");
    }

}
