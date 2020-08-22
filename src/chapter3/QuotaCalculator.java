package chapter3;

import java.util.Scanner;

/*
IF else
All salespeople are expected to make 10 sales each week
For those who success, receive congrats message
while those who don't, inform how many sales they were short
*/
public class QuotaCalculator {
    public static void main(String[] args) {
        int targetSales = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sale employee achieved this week: ");
        int actualSales = Integer.parseInt(scanner.nextLine());

        if (actualSales >= targetSales){
            System.out.println("Congrats! You achieved your target this week.");
        }
        else{
            System.out.println("You did not achieve the target sales. You short "+ (targetSales-actualSales) +" sales.");
        }

    }
}
