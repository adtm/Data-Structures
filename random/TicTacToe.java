package tictactoe;

public class TicTacToe {

  protected char[] board;
  protected char userMarker;
  protected char aiMarker;
  protected char currentMarker;
  protected char winner;

  public TicTacToe(char playerToken, char aiMarker){
    this.userMarker = playerToken;
    this.aiMarker = aiMarker;
    this.winner = '-';

    this.board = setBoard();
  }

  private static char[] setBoard() {
    char[] board = new char[9];
    for (int i =0; i < board.length; i++) {
      board[i] = '-';
    }
    return board;
  }

  public boolean playTurn(int spot){
    boolean isValid = withinRange(spot) && !isSpotTaken(spot);
    if (isValid){
      board[spot-1] = currentMarker;
      currentMarker = (currentMarker == userMarker ? aiMarker : userMarker);
    }
    return isValid;
  }

  private boolean isSpotTaken(int number) {
    return board[number-1] != '-';
  }

  private boolean withinRange(int spot) {
    return  (spot > 0 && spot < board.length + 1);
  }

  public void printBoard(){
    for (int i = 0; i < board.length + 1; i++){
      if (i % 3 == 0 && i != 0){
        System.out.println();
        System.out.println("|---------------|");
      }
      System.out.println("|" + board[i]);
    }
    System.out.println();
  }

  public void printIndexBoard(){
    for (int i = 0; i < board.length + 1; i++){
      if (i % 3 == 0 && i != 0){
        System.out.println();
        System.out.println("|---------------|");
      }
      System.out.println("|" + board[i + 1]);
    }
    System.out.println();
  }

  public boolean isThereAWinner(){
    boolean diaganolsAndMiddles = rightDi() || leftDi() || middleRow() || secondCol()  &&
      board[4] != '-';
    boolean topAndFirst = topRow() || firstCol() && board[0] != '-';
    boolean bottomAndThird = bottomCol() || thirdRow() && board[8] != '-';
    if (diaganolsAndMiddles){
      this.winner = board[4];
    } else if(topAndFirst) {
      this.winner = board[0];
    } else if(bottomAndThird){
      this.winner = board[8];
    }
    return diaganolsAndMiddles || topAndFirst || bottomAndThird;
  }

  private boolean leftDi() {
    return board[0] == board[4] && board[4] == board[8];
  }

  private boolean rightDi() {
    return board[2] == board[4] && board[4] == board[6];
  }

  private boolean bottomCol() {
    return board[2] == board[5] && board[5] == board[8];
  }

  private boolean secondCol() {
    return board[1] == board[4] && board[4] == board[7];
  }

  private boolean firstCol() {
    return board[0] == board[3] && board[3] == board[6];
  }

  private boolean thirdRow() {
    return board[6] == board[7] && board[7] == board[8];
  }

  private boolean middleRow() {
    return board[3] == board[4] && board[4] == board[5];
  }

  private boolean topRow() {
    return board[0] == board[1] && board[1] == board[2];
  }

}
