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
  
  // code sourced from chegg tutor https://www.chegg.com/homework-help/questions-and-answers/java-declare-arraylist-integers-put-first-100-integers-list-write-loop-walks-arraylist-pri-q24125821?trackid=86049f5a907c&strackid=c17fb3e8bfa2&ii=10

  public static void main(String[] args) {

    List<Integer> arrayListInt = new ArrayList<Integer>();

    System.out.println("Below we will print an array list you will notice it is not "
        + " an efficent manner to view an array list." + "\n");

    for (int i = 1; i < 61; i++) {

      arrayListInt.add(i);

    }

    System.out.println(arrayListInt);

    System.out.println("OR");

    // OR use forEach loop

    for (Integer val : arrayListInt) {
      System.out.print(val + " ");

      // IF condition will be used for corret  alignment only

      if (val % 10 == 0) {

        System.out.println();

      }

    }

    System.out.println("\n");

    System.out.println("Above we will organize our array list using a 2d array format." + "\n");

  }
  
  /**
   *
   * Code sourced from https://stackoverflow.com/questions/37370132/locate-coordinates-of-element-in-2d-array
   */

  public static void main1(String[] args) {
    locateStar(layOut);
  }



  private static void locateStar(char[][] layOut2) {
    // TODO Auto-generated method stub

  }



  static char[][] layOut =
      {{'.', '.', '.', '.'}, {'.', '.', '.', '.'}, {'.', '.', '.', '*'}, {'.', '.', '.', '.'}};

  /**
   * This will print out the coordinates of the location of a list array.
   * 
   * @author oscargarcia
   *
   */

  public static void findLocation(char[][] board) {


    for (int i = 0; i < layOut.length; i++) {
      for (int j = 0; j < layOut[0].length; j++) {
        if (layOut[i][j] == '*') {
          System.out.println("Found at " + i + " " + j);
          break;
        }
      }
    }
  }
}
