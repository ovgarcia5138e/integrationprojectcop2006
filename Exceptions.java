package introprog;

import java.util.Scanner;

/**
 * Represent exceptions and whether commands are valid or not by running data from scanners within
 * for loops, and while loops, and nested if else statements.
 * 
 * @author oscargarcia
 *
 */

public class Exceptions {

  // method to check wHether a valid command is entered

  static boolean checkCommand(String command) {

    System.out.println("Below we are going to run code that will "
        + " run various for loops, while loops and nested "
        + " else if statements to illustrate exceptions.");


    /**
     * check is assigned with the false boolean.
     * 
     * @author oscargarcia
     *
     */

    boolean check = false;

    /**
     * An array of strings
     * 
     * @author oscargarcia
     *
     */

    String[] strings = {"A", "B", "C", "Q"};

    for (int i = 0; i < strings.length; i++) {

      // checking whether the entered command is from expected charecters

      if (strings[i].equals(command)) {

        /**
         * Condition where check is assigned a true boolean.
         * 
         * @author oscargarcia
         *
         */
        check = true;

      }

    }

    return check;

  }

  // Getting the value of hypotenuse

  static double hypotenuse(int numberOne, int numberTwo) {

    /**
     * multiplication of a integers.
     * 
     * @author oscargarcia
     *
     */

    double squareRoot = 0;

    /**
     * Multiplication of two integers.
     * 
     * @author oscargarcia
     *
     */

    numberOne = numberOne * numberOne;

    /**
     * Multiplication of two integers.
     * 
     * @author oscargarcia
     *
     */

    numberTwo = numberTwo * numberTwo;

    /**
     * Addition of two integers.
     * 
     * @author oscargarcia
     *
     */

    int c = numberOne + numberTwo;


    squareRoot = Math.sqrt(c);

    return squareRoot;

  }

  /**
   * This will use a scanner in order to.
   */

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    /**
     * Quit is assigned a false boolean.
     * 
     * @author oscargarcia
     *
     */

    boolean quit = false;

    /**
     * Integer assigned to 0.
     * 
     * @author oscargarcia
     *
     */

    int number = 0;

    /**
     * Integer assigned to 0.
     * 
     * @author oscargarcia
     *
     */

    int startingPosition = 0;

    // this loop runs untill Q commond is given

    // as we are setting quit = true in the loop if(command.equals("Q"))


    /**
     * this loop runs untill Q commond is given as we are setting quit = true in the loop
     * if(command.equals("Q"))
     * 
     * @author oscargarcia
     *
     */

    while (quit == false) {

      boolean check = false;

      boolean checkA = false;

      boolean checkB = false;

      System.out.println("Enter a command");

      String command = sc.nextLine();

      // passing the entered string to checkcommand method to check valid string is entered

      /**
       * passing the entered string to checkcommand method to check valid string is entered
       * 
       * @author oscargarcia
       */

      check = checkCommand(command);

      while (check == false) {

        System.out.println("Enter a valid Command");

        command = sc.nextLine();

        check = checkCommand(command);

      }

      // loop for the command A

      /**
       * loop for the command A
       * 
       * @author oscargarcia
       */


      if (command.equals("A")) {

        while (checkA == false) {

          try {

            System.out.println("enter value for side A");

            // If anything other than integers are given an exception is thrown

            /**
             * If anything othe than integers are given an exception is thrown.
             * 
             * @author oscargarcia
             */

            number = Integer.parseInt(sc.nextLine());

            System.out.println(number + "A");

            checkA = true;

          } catch (Exception e) {

            System.out.println("Enter a Valid number");

          }

        }

      }

      // loop for the command B

      /**
       * Loop for the command B
       * 
       * @author oscargarcia
       */

      if (command.equals("B")) {

        while (checkB == false) {

          try {

            System.out.println("enter value for side B");

            // If anything other than integers are given an exception is thrown

            startingPosition = Integer.parseInt(sc.nextLine());

            checkB = true;

          } catch (Exception e) {

            System.out.println("Enter a Valid number");

          }

        }

      }

      if (command.equals("C")) {

        // passing A and B to get hypotenuse value

        /**
         * Passing A and B to get hypotenuse value.
         * 
         * @author oscargarcia
         */

        double hypo = hypotenuse(number, startingPosition);

        System.out.println("Hypotenuse : " + hypo);

        // setting A and B as 0 since they hold the previous loop values inside them

        /**
         * Setting A and B as 0 since they hold the pervious loop values inside them.
         * 
         * @author oscargarcia
         */

        number = 0;

        startingPosition = 0;

      }

      if (command.equals("Q")) {

        quit = true;

        System.out.println("Exit successful");

      }
      sc.close();
    }

  }
  // Thank you for the incredible semester.

}
