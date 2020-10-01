package chapter10;

public class Market {

    public static void main(String[] args) {
        Fruit apple = new Apple();
        //to use method in subclass, we need to cast the Fruit object to the subclass object.
        ((Apple) apple).peel();
        ((Apple) apple).removeSeed();

        Fruit mango = new Mango();
        //to use method in subclass, we need to cast the Fruit object to the subclass object.
        ((Mango) mango).peel();
        ((Mango) mango).removeSeed();

        Apple apple2 = new Apple();
        apple2.peel();
        apple2.removeSeed();

        Mango mango2 = new Mango();
        mango2.peel();
        mango2.removeSeed();

        System.out.println("===========================================");
        squeeze(apple);
        squeeze(mango);
        squeeze(apple2);
        squeeze(mango2);
    }
    public static void squeeze(Fruit fruit){
        if (fruit instanceof Apple){
            System.out.println("Squeezing apple...");
        }
        else if (fruit instanceof Mango){
            System.out.println("Squeezing mango...");
        }
        else{
            System.out.println("Squeezing unknown fruit...");
        }
    }

}
