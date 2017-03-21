package tictactoe;

import java.util.ArrayList;
import java.util.Random;

public class AI {

  public int pickSpot(TicTacToe game){
    ArrayList<Integer> el = new ArrayList<>();
    for (int i = 0; i < game.board.length; i++) {
      if (game.board[i] == '-'){
        el.add(i + 1);
      }
    }
    Random random = new Random();
    int choice = el.get(Math.abs(random.nextInt() % el.size()));
    return choice;
  }
}
