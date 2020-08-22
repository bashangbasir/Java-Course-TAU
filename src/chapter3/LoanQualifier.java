package chapter3;
/*
Nested IFS:
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        int requireSalary = 20000;
        int requiredYearsEmployed = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter your years of employment: ");
        double yearsEmployed = Double.parseDouble(scanner.nextLine());

        if (salary >= requireSalary){
            if (yearsEmployed >= requiredYearsEmployed){
                System.out.println("Congrats! You are qualified for the loan.");
            }
            else{
                System.out.println("Sorry, you must employed for more than or equal "+requiredYearsEmployed+" years ");
            }
        }
        else{
            System.out.println("Sorry, you must at least earn "+requireSalary+" a year.");
        }
    }
}
