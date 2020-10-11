package chapter12;

import java.util.LinkedList;
import java.util.Queue;

public class FruitQueue {
    public static void main(String[] args) {
        Queue fruit = new LinkedList();

        fruit.add("apple");
        fruit.add("watermelon");
        fruit.add("mango");
        fruit.add("apple");
        fruit.add("lemon");

        System.out.println(fruit.size());//5
        System.out.println(fruit); //[apple,watermelon,mango,apple,lemon]

        fruit.remove(); // removed apple. first in first out
        System.out.println(fruit);//[watermelon,mango,apple,lemon]

        System.out.println(fruit.peek());//give head value (not remove the head after peek operation)


    }
}
