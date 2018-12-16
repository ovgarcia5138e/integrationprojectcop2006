package introprog;

import java.util.Scanner;

/**
 * Below we will create a class that will exhibit a user interface that will multiple three integer
 * values and produce the product, while throwing an exception catch if an input is invalid.
 * 
 * @author oscargarcia The class that will exhibit an exception.
 *
 */

public class ExceptionMultiplication {


  /**
   * We declared a scanner variable below.
   * 
   * @author oscargarcia
   *
   */

  private static Scanner input;

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    /**
     * Below we will initilize our scanner variable.
     * 
     * @author oscargarcia
     *
     */
    input = new Scanner(System.in);

    /**
     * Below we will delcare and initililize an integer variable.
     * 
     * @author oscargarcia
     *
     */

    int x = 1;

    /**
     * Below we will run a do while loop so the user can input their three integers, and catch the
     * exception.
     *
     * @author oscargarcia
     *
     */

    do {
      try {
        System.out.println(
            "Enter a number this will be our first multiple, for example 2, 45, 3,4543, or 123 : ");

        /**
         * The first integer multiple that the user will input.
         * 
         * @author oscargarcia
         *
         */

        int firtsMultiple = input.nextInt();

        System.out.println("Enter another number  this will be our second multiple: ");

        /**
         * The second integer multiple that the user will input.
         * 
         * @author oscargarcia
         *
         */

        int secondMultiple = input.nextInt();

        System.out.println("Enter a third and final number this will be our last multiple: ");

        /**
         * The third integer multiple that the user will input.
         * 
         * @author oscargarcia
         *
         */

        int thirdMultiple = input.nextInt();

        int product = firtsMultiple * secondMultiple * thirdMultiple;

        System.out.println("The product of our three multiples is : " + product);


        x = 2;

      } catch (Exception f) {

        System.out.println("Please input a number");

        input.nextLine();
      }
    } while (x == 1);

  }

}
