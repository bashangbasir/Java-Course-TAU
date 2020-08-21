package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter season of the year");
        String season = scanner.nextLine();

        System.out.println("Enter the whole number");
        //use nextLine instead of nextInt since Scanner.nextInt method does not read the newline character in your input
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter an adjective");
        String adj = scanner.nextLine();

        System.out.println("On a "+ adj +" "+ season +" day, I drink a minimum of "+ num +" cups of coffee.");

    }
}
