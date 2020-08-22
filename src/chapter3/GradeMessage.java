package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter grade :");
        String grade = scanner.nextLine();
        String msg;

        switch(grade){
            case "A":
                msg = "Excellent job!";
                break;
            case "B":
                msg = "Great job!";
                break;
            case "C":
                msg = "Good job!";
                break;
            case "D":
                msg = "Need to work harder!";
                break;
            case "F":
                msg = "Uh oh! Failed.";
                break;
            default:
                msg = "Error! Invalid grade.";
                break;
        }
        System.out.println(msg);
    }
}
