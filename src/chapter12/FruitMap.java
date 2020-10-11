package chapter12;

import java.util.HashMap;
import java.util.Map;

public class FruitMap {
    public static void main(String[] args) {
        Map fruitCount = new HashMap();

        fruitCount.put("apple",5);
        fruitCount.put("pine apple",15);
        fruitCount.put("star fruit",25);
        fruitCount.put("lemon",8);
        fruitCount.put("mango",36);
        //unordered DA
        System.out.println(fruitCount);
        fruitCount.put("apple",50); //will update the apple value since apple key is already available

        System.out.println(fruitCount.get("apple"));
        System.out.println(fruitCount.entrySet());// return set

        System.out.println(fruitCount.remove("lemon"));//remove the key and value, also return the value removed.
        System.out.println(fruitCount);



    }
}
