package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {
        int requireSalary = 20000;
        int requiredYearsEmployed = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter your years of employment: ");
        double yearsEmployed = Double.parseDouble(scanner.nextLine());

        if (salary >= requireSalary && yearsEmployed >= requiredYearsEmployed){
            System.out.println("You are qualified for the loan");
        }
        else{
            System.out.println("Sorry, you must at least earn "+requireSalary+" a year and employed for "+requiredYearsEmployed+" years at least.");
        }
    }
}
