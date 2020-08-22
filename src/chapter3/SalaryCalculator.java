package chapter3;

import java.util.Scanner;

/*
IF statement
all salespeople get a payment of $1000 a week
Salespeople who exceed 10 sales get bonus of $250
*/
public class SalaryCalculator {
    public static void main(String[] args) {
        // initialize known values
        int salary = 1000;
        int bonus = 250;
        int targetSales = 10;
        Scanner scanner = new Scanner(System.in);
        // Get values for unknown
        System.out.println("How many sales employee make this week?");
        int actualSales = scanner.nextInt();
        scanner.close();

        // Quick detour for bonus earners
        if(actualSales > targetSales){
            salary += bonus;
        }
        // Output
        System.out.println("The employee's pay is $"+ salary);

    }
}
