package chapter11;

public class Farm {

    public static void main(String[] args) {
        Animal duck = new Duck();
        duck.makeSound();
        duck.eat();

        Animal pig = new Pig();
        pig.makeSound();
        pig.eat();

        Pig pig2 = new Pig();
        pig2.makeSound();

        Duck duck2 = new Duck();
        duck2.makeSound();

    }
}
