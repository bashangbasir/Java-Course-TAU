package chapter6;

public class MonthConverter {
    public static void main(String[] args) {
        System.out.println("Convert month from int to String: ");
        System.out.println(Month.getMonth(2));
        System.out.println("Convert month from String to int: ");
        System.out.println(Month.getMonth("September"));

    }
}
