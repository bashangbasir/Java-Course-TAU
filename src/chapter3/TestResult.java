package chapter3;
/*
IF-ELSE IF statement

 */

import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        //Get test score
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your test score: ");
        double score = Double.parseDouble(scanner.nextLine());

        //Determine the letter grade for the score
        char grade;
        if (score < 60){
            grade = 'F';
        }
        else if (score < 70){
            grade = 'D';
        }
        else if (score <80){
            grade = 'C';
        }
        else if (score < 90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }
        System.out.println("Your grade is "+ grade);
    }
}
