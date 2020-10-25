package chapter12;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        //using iterator
        System.out.println("set demo using iterator.");
        var i = fruit.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

    public static void listDemo() {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println("list demo using enhanced for loop.");
        for(String fruit: fruits){
            System.out.println(fruit);
        }

    }

    public static void queueDemo() {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        //in forEach(), lambda is provided to the method.
        System.out.println("queue demo using forEach() method");
        fruits.forEach(x -> System.out.println(x));
        System.out.println("queue demo using forEach() method");
        //same as above code (more one liner way to write)
        fruits.forEach(System.out::println);

    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("lemon", 17);
        //using enhanced for loop
        System.out.println("map demo using enhanced for loop.");
        for (var entry : fruitCalories.entrySet()) {
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
        //using forEach() method
        System.out.println("map demo using forEach() method.");
        fruitCalories.forEach((k,v) -> System.out.println("key:" + k + " value:" + v));
    }
}
