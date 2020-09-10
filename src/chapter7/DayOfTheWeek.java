package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    private static final String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number of the day of the week: ");
        int index = Integer.parseInt(scanner.nextLine());
        scanner.close();
        try{
            System.out.println("Corresponding day : "+ week[index-1]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Number of day is out of range");
        }

    }


}
