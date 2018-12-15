package introprog;

/**
 * Represents 2D arrays with a game of tic tac toe.
 * 
 * @author oscargarcia
 */


public class TicTaco {

  // attributes

  /**
   * 2D array that will have three rows and columns.
   * 
   * @author oscargarcia
   */

  int[][] board = new int[3][3];

  /**
   * private integer that represents a player.
   * 
   * @author oscargarcia
   */

  private int player;

  // constructor

  /**
   * Constructer that will.
   * 
   * @author oscargarcia
   */

  public void ticTacToe() {

    for (int row = 0; row < 3; row++) {

      for (int col = 0; col < 3; col++) {

        board[row][col] = 0;

      }

    }

  }

  /**
   * Will return the player.
   * 
   * @return the player
   */

  public int getPlayer() {

    return player;
  }

  /**
   * Player will set the player.
   * 
   * @param player the player to set.
   */

  public void setPlayer(int player) {

    this.player = player;

  }


  /**
   * This will allow a player to move along the rows and along the columns.
   * 
   * @author oscargarcia
   *
   */

  public boolean playerMove(int row, int col) {

    /**
     * This will allow a player to move along the rows and along the columns.
     * 
     * @author oscargarcia
     *
     */

    boolean move;

    // check to see if the move has been already taken

    if (board[row][col] == 0) {

      board[row][col] = player;

      return true;

    } else {

      // The specified cell is already occupied.

      move = false;

    }
    // check to see if the move is a number 1 through 9
    // if the move is valid then
    // do the move
    // isValid = true;
    // else don't do the move
    // isValid = false;

    return move;

  }

  /**
   * This method below will switch the player in the game, depending on which player is alredy
   * selected.
   */

  public void switchPlayer() {

    if (player == 1) {

      player = 2;

    } else {

      player = 1;

    }

  }

}
