package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many hours did you worked?");
        double hoursWorked = Double.parseDouble(scanner.nextLine());

        while(hoursWorked>maxHours || hoursWorked<0){
            System.out.println("Invalid hour input. Your hours must be between 1 to "+maxHours+" .Try again");
            hoursWorked = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Your gross pay is $"+ (rate* hoursWorked)+".");
    }
}
