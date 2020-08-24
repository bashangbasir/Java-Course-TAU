package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        boolean again = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the first number: ");
            int number1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the second number: ");
            int number2 = Integer.parseInt(scanner.nextLine());
            double sum = number1 + number2;
            System.out.println("The sum is : " + sum);
            System.out.println("Would you like to start over?(true/false)");
            again = scanner.nextBoolean();
        }while(again);

    }
}
