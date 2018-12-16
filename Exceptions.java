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
     * checkStatus is assigned with the false boolean.
     * 
     * @author oscargarcia
     *
     */

    boolean checkStatus = false;

    /**
     * An array of strings
     * 
     * @author oscargarcia
     *
     */

    String[] stringOptions = {"A", "B", "C", "Q"};

    for (int i = 0; i < stringOptions.length; i++) {

      // checking whether the entered command is from expected charecters

      if (stringOptions[i].equals(command)) {

        /**
         * Condition where check is assigned a true boolean.
         * 
         * @author oscargarcia
         *
         */
        checkStatus = true;

      }

    }

    return checkStatus;

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

    Scanner exceptionScanner = new Scanner(System.in);

    /**
     * Stop is assigned a false boolean.
     * 
     * @author oscargarcia
     *
     */

    boolean stop = false;

    /**
     * number assigned to 0.
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

    


    /**
     * this loop runs untill Q commond is given as we are setting quit = true in the loop
     * if(command.equals("Q"))
     * 
     * @author oscargarcia
     *
     */

    while (stop == false) {

      boolean firstCheck = false;

      boolean secondCheck = false;

      boolean thirdCheck = false;

      System.out.println("Enter a command");

      String command = exceptionScanner.nextLine();

      

      /**
       * passing the entered string to checkcommand method to check valid string is entered
       * 
       * @author oscargarcia
       */

      firstCheck = checkCommand(command);

      while (firstCheck == false) {

        System.out.println("Enter a valid Command");

        command = exceptionScanner.nextLine();

        firstCheck = checkCommand(command);

      }

      

      /**
       * loop for the command A
       * 
       * @author oscargarcia
       */


      if (command.equals("A")) {

        while (secondCheck == false) {

          try {

            System.out.println("enter value for side A");

            

            /**
             * If anything othe than integers are given an exception is thrown.
             * 
             * @author oscargarcia
             */

            number = Integer.parseInt(exceptionScanner.nextLine());

            System.out.println(number + "A");

            secondCheck = true;

          } catch (Exception e) {

            System.out.println("Enter a Valid number");

          }

        }

      }

      

      /**
       * Loop for the command B
       * 
       * @author oscargarcia
       */

      if (command.equals("B")) {

        while (thirdCheck == false) {

          try {

            System.out.println("enter value for side B");

            // If anything other than integers are given an exception is thrown

            startingPosition = Integer.parseInt(exceptionScanner.nextLine());

            thirdCheck = true;

          } catch (Exception e) {

            System.out.println("Enter a Valid number");

          }

        }

      }

      if (command.equals("C")) {

        

        /**
         * Passing A and B to get hypotenuse value.
         * 
         * @author oscargarcia
         */

        double numberHypo = hypotenuse(number, startingPosition);

        System.out.println("Hypotenuse : " + numberHypo);

        

        /**
         * Setting A and B as 0 since they hold the pervious loop values inside them.
         * 
         * @author oscargarcia
         */

        number = 0;

        startingPosition = 0;

      }

      if (command.equals("Q")) {

        stop = true;

        System.out.println("Exit was successful");

      }
      exceptionScanner.close();
    }

  }
  // Thank you for the incredible semester.

}
