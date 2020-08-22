package chapter3;

import java.util.Scanner;

class ChangeToRM1 {
    public static void main(String[] args) {
        // Get 5cent,10cent, 20cent,50cents
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 5 cents quantities:");
        int _5cents = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the 10 cents quantities:");
        int _10cents = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the 20 cents quantities:");
        int _20cents = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the 50 cents quantities:");
        int _50cents = Integer.parseInt(scanner.nextLine());
        //Calculate if the sum of value user fill in equal to 1, more or less than 1
        double sum = (_5cents*0.05)+(_10cents*0.1)+(_20cents*0.2)+(_50cents*0.5);

        if (sum > 1){
            System.out.println("You exceed RM1 by RM"+(sum-1));
        }
        else if (sum<1){
            System.out.println("You short RM1 by RM"+(1-sum));
        }
        else {
            System.out.println("You enter RM1, you win!");
        }

    }
}
