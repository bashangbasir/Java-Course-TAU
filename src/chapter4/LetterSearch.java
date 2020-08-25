package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some text:");
        String text = scanner.nextLine();
        boolean found = false;
        for (int i=0; i<text.length();i++){
            char currentLetter = text.charAt(i);
            if( currentLetter == 'K' || currentLetter == 'k'){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Letter K/k is found in string given.");
        }
        else{
            System.out.println("No letter K/k in string given.");
        }
    }
}
