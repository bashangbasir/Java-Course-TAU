package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUM = 69;

    public static void main(String[] args) {

        int[] ticketNum = generateNumbers();
        displayTicketNumber(ticketNum);

    }

    public static int[] generateNumbers(){
        Random random = new Random();
        int[] ticket = new int[LENGTH];

        for (int i=0; i<LENGTH; i++){
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUM)+1;
            }while(search(ticket,randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on array to find value
     * @param array Array to search
     * @param numberToSearchFor value to search for
     * @return true if found, false otherwise
     */
    public static boolean search(int [] array, int numberToSearchFor){
        //this is called enhanced loop. Also known as for each loop
        // It iterates through array
        // and each time assigns the current element to value.
        for(int value: array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        return false;
    }

    /**
     * Does binary search on an array to find value
     * @param array Array to search
     * @param numberToSearchFor value to search for
     * @return true if found, false otherwise
     */
    public static boolean binarySearch(int [] array, int numberToSearchFor){
        //sort array
        Arrays.sort(array);
        //use Array utils method binary search. return >= 0 if found, 0 if not found.
        int index = Arrays.binarySearch(array, numberToSearchFor);

        if(index >= 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void displayTicketNumber(int[] ticket){
        for (int i=0; i< ticket.length;i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
