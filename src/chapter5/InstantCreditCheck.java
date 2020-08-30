package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        double creditScore = getCreditScore();
        scanner.close();
        boolean isQualified = isUserQualified(salary,creditScore);
        notifyUser(isQualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public static double getCreditScore(){
        System.out.println("Enter your credit score: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public static boolean isUserQualified(double salary, double creditScore){
        return creditScore >= requiredCreditScore && salary >= requiredSalary;
    }

    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("You are qualified !");
        }
        else{
            System.out.println("You're not qualified!");
        }
    }
}
