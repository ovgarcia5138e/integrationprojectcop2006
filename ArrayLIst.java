package introprog;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will represent an arraylist that will run through various for loops and while loops
 * which will return locations and values.
 * 
 * @author oscargarcia
 *
 */


public class ArrayLIst {

  /**
   * This class will represent an arraylist that will run through various for loops and while loops
   * which will return locations and values.
   * 
   * @OscarGarcia
   */

  public static void main(String[] args) {

    List<Integer> integerList = new ArrayList<Integer>();

    System.out.println("Below we will print an array list you will notice it is not "
        + " an efficent manner to view an array list." + "\n");

    for (int i = 1; i < 101; i++) {

      integerList.add(i);

    }

    System.out.println(integerList);

    System.out.println("OR");

    // OR use forEach loop

    for (Integer val : integerList) {
      System.out.print(val + " ");

      // IF condition only for proper alignment only

      if (val % 10 == 0) {

        System.out.println();

      }

    }

    System.out.println("\n");

    System.out.println("Above we will organize our array list using a 2d array format." + "\n");

  }

  public static void main1(String[] args) {
    locateStar(board);
  }



  static char[][] board =
      {{'.', '.', '.', '.'}, {'.', '.', '.', '.'}, {'.', '.', '.', '*'}, {'.', '.', '.', '.'}};

  /**
   * This will print out the coordinates of the location of a list array.
   * 
   * @author oscargarcia
   *
   */

  public static void locateStar(char[][] board) {


    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == '*') {
          System.out.println("Found at " + i + " " + j);
          break;
        }
      }
    }
  }
}

