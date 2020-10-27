package chapter14;

import java.util.Scanner;

public class CoinTossGame {

    public Scanner scanner;

    public static void main(String[] args) {

        CoinTossGame game = new CoinTossGame();
        game.scanner = new Scanner(System.in);

        Player player1 = new Player(game.askPlayerName());
        player1.setGuess(game.askPlayerGuess());

        Player player2 = new Player(game.askPlayerName());

        //if player 1 choose HEAD, player 2 get tails and vice versa.
        if (player1.getGuess().equalsIgnoreCase(Coin.HEADS)){
            player2.setGuess(Coin.TAILS);
        }else{
            player2.setGuess(Coin.HEADS);
        }

        //Flipping the coin.
        System.out.println("Flipping Coin!!");
        Coin coin = new Coin();
        coin.flip();
        System.out.println("The coin landed on " + coin.getSide());
        //determine the winner
        game.determineWinner(player1,player2,coin);
        game.scanner.close();


    }
    private String askPlayerName(){
        System.out.println("Enter player name: ");
        return scanner.nextLine();
    }
    private String askPlayerGuess(){
        System.out.println(String.format("%s or %s ?",Coin.HEADS,Coin.TAILS));
        String guess = scanner.nextLine();
        while(!guess.equalsIgnoreCase(Coin.HEADS) && !guess.equalsIgnoreCase(Coin.TAILS)){
            System.out.println("Invalid guess. Try again. Heads or Tails");
            guess = scanner.nextLine();
        }
        return guess;
    }
    private void determineWinner(Player player1,Player player2, Coin coin){
        String winner;
        if(coin.getSide().equalsIgnoreCase(player1.getGuess())){
            //if coin equal to player1's guess
            winner = player1.getName();
        }else{
            winner = player2.getName();
        }
        System.out.println("The winner is "+ winner);
    }
}
