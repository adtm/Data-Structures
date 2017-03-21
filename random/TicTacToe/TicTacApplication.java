package tictactoe;


import java.util.Scanner;

public class TicTacApplication {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean toPlay = true;
    while (toPlay) {
      System.out.println("Hello! Welcome to the Game! +" +
        "Choose a character! \n");
      System.out.println();

      System.out.println("Enter a single character for You!");
      char playerToken = in.next().charAt(0);

      System.out.println("Enter a character for your opponent!");
      char opponentToken = in.next().charAt(0);

      TicTacToe game = new TicTacToe(playerToken, opponentToken);
      AI ai = new AI();

      System.out.println();
      System.out.println("Start Game! Enter a number for your token! (1-9)");
      TicTacToe.printIndexBoard();
      System.out.println();

      while (game.gameOver().equals("Not Over!")) {
        if (game.currentMarker == game.userMarker) {
          System.out.println("User turn! Enter spot for token!");
          int spot = in.nextInt();
          while (!game.playTurn(spot)) {
            System.out.println("Try again!" + spot + "is invalid!");
          }
          System.out.println("You picked: " + spot + "!");
        } else {
          System.out.println("Master's turn!");
          int aiSpot = ai.pickSpot(game);
          game.playTurn(aiSpot);
          System.out.println("Master picked: " + aiSpot);
        }
        System.out.println();
        game.printBoard();
      }
      System.out.println(game.gameOver());
      System.out.println();
      System.out.println("Play again? (Y|N)");
      char response = in.next().charAt(0);
      toPlay = response == 'Y';
      System.out.println();
      System.out.println();
    }

  }
}
