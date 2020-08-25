package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {
        int numberOfStudents = 4;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<numberOfStudents; i++){
            double totalIndividual=0;
            for(int j=0; j<numberOfTests;j++){
                System.out.println("Enter the score for test #"+(j+1));
                double score = Double.parseDouble(scanner.nextLine());
                totalIndividual += score;
            }
            double averageIndividual = totalIndividual/numberOfTests;
            System.out.println("The average score of student #" + (i+1) + " : " + averageIndividual);
        }
    }
}
