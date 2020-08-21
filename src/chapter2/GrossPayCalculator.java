package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        // Scanner to get input from console
        Scanner scanner = new Scanner(System.in);

        //1. Get number of hours worked
        System.out.println("Enter number of hours the employee worked. ");
        int hours = scanner.nextInt();

        //2. Get hourly pay rate
        System.out.println("Enter employee hourly pay rate");
        double payrate = scanner.nextDouble();

        //close scanner
        scanner.close();

        //3. Get the payment, payment = hours * payrate
        double grossPayment = hours * payrate;

        //4. Display result
        System.out.println("The employee's gross pay is $"+ grossPayment);
    }
}
