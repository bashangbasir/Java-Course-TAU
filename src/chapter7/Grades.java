package chapter7;

import java.util.Scanner;

public class Grades {

    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grade you want to enter:");
        grades = new int[Integer.parseInt(scanner.nextLine())];

        getGrades();
        System.out.println("Sum is " + String.format("%.2f",calculateSum()));
        System.out.println("Average is " + String.format("%.2f",calculateAverage()));
        System.out.println("Highest grade is " +String.format("%d",getHighest()));
        System.out.println("Lowest grade is " + String.format("%d",getLowest()));

    }

    public static void getGrades(){
        for(int i=0; i< grades.length; i++){
            System.out.println("Enter grade #" + (i+1) );
            grades[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    public static double calculateSum(){
        double sum = 0;
        for( int grade : grades){
            sum += grade;
        }
        return sum;
    }

    public static double calculateAverage(){
        double sum = 0;
        for( int grade : grades){
            sum += grade;
        }
        return sum/grades.length;

    }

    public static int getHighest(){
        int highest = grades[0];
        for(int grade : grades){
            if (grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest(){
        int lowest = grades[0];
        for(int grade : grades){
            if (grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }

}
