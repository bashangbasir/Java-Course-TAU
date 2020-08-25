package chapter4;

import java.util.Random;

public class RoolDieGame {
    public static void main(String[] args) {
        Random random = new Random();
        //int die = random.nextInt(6)+1;
        int emptySpaces = 20;
        int totalRoll = 5;
        int currentSpace = 0;
        for(int i=0; i<totalRoll;i++){
            int die = random.nextInt(6)+1;
            currentSpace +=die;
            System.out.print(" Roll #"+(i+1)+ ": You've rolled a " +die+".");
           if (currentSpace == emptySpaces){
               System.out.println("You're on space 20. Congrats, you win!");
               break;
           }
           else if(currentSpace > emptySpaces){
               System.out.println("Unfortunately, that takes you past " + emptySpaces + " spaces. You lose!");
               break;
            }
           else {
               int spacesToGo = emptySpaces-currentSpace;
               System.out.println("You are now on space " + currentSpace + " and have " + spacesToGo + " more to go.");
           }
        }
    }
}
