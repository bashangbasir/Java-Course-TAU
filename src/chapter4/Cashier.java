package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of item you would like to scan?");
        int quantity = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        for (int i=0; i < quantity; i++){
            System.out.println("Enter the cost item "+ (i+1) + " :");
            double price = Double.parseDouble(scanner.nextLine());
            totalPrice += price;
        }
        scanner.close();

        System.out.println("Your total price is $" + totalPrice);
    }
}
