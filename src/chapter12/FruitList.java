package chapter12;

import java.util.ArrayList;
import java.util.List;


public class FruitList {

    public static void main(String[] args) {
        List fruit = new ArrayList();

        System.out.println(fruit.add("apple"));
        fruit.add("watermelon");
        fruit.add("mango");
        fruit.add("lemon");
        // print tru since list is not unique. can add multiple equal value in list.
        System.out.println(fruit.add("apple"));

        System.out.println(fruit.get(3));
        System.out.println(fruit.size());
        // here output is in order as the value we add
        System.out.println(fruit);
    }
}
