package chapter12;

import java.util.HashSet;
import java.util.Set;

public class FruitSet {

    public static void main(String[] args) {
        Set fruit = new HashSet();

        System.out.println(fruit.add("apple"));
        fruit.add("watermelon");
        fruit.add("mango");
        fruit.add("lemon");
        // this will print false since it fail to add the new value.
        // set is unique, cannot add same value in set
        System.out.println(fruit.add("apple"));

        System.out.println(fruit.size());
        //the set is unordered and unique.
        System.out.println(fruit);

    }
}
