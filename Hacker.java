package introprog;

import java.util.Random;
import java.util.stream.IntStream;


/**
 * This class demonstrates arrays, and generating random numbers and assigning them bank account
 * balances while incorporating breaks, for loops, and while loops.
 * 
 * @author oscargarcia
 *
 */
public class Hacker {

  /**
   * This will out put even and odd indexes of a string array.
   * 
   */

  public static void main(String[] args) {

    /**
     * Below is a string.
     * 
     */

    String hello = "Chicken";

    System.out.println("Below we are going to print the even indicies first, create a "
        + "space then print the odd indicies of the word" + hello + "\n");

    System.out.println(hello);

    /**
     * this will transform our string into a char array.
     * 
     * @param args
     */

    char[] firstArray = hello.toCharArray();

    int index = hello.length();

    for (index = 0; index < hello.length(); index++) {

      if (index % 2 == 0) {

        System.out.print(firstArray[index]);

      } else {

        System.out.print(firstArray[index]);

        System.out.println(" ");

      }

    }

    /*
     * Below we are going to mimic a bank account that will vary from a balance of $00.00 all the
     * way to $500.00 I created a manner of generating a double that will be implemented as a random
     * balance. I also created an else if statement that will notifiy the user if their balance is
     * positive or neative.
     */

    /**
     * Double set as a bank balance.
     * 
     */

    double startBalance = 0.0;

    /**
     * double end balance to set a random value.
     * 
     */

    double endBalance = 500.00;

    /**
     * Generating a random bank account balance as a double.
     * 
     */

    double randomBalance = new Random().nextDouble();

    /**
     * assigning a random bank account balance.
     * 
     */

    double resultBalance = startBalance + (randomBalance * (endBalance - startBalance));

    System.out.println("Below we will print a randomly generated bank acount blanace"
        + " generated by an equation that accepted random double values from 0 - 500.");

    if (resultBalance > 0) {

      System.out.println("Your current balance is " + "$" + resultBalance + "\n");

    } else if (resultBalance < 0) {

      System.out.println("Your current balance is " + "$" + resultBalance + "\n");

    }

    /**
     * integer array.
     * 
     * @param args
     */

    int[] randomArray = {600, 500, 700, 300, 800, 100};

    /**
     * Length of our integer array.
     * 
     */

    int arraySize = randomArray.length;

    /**
     * array size of our integer array.
     * 
     */



    /**
     * A container for the smallest value in the integer array.
     * 
     */



    /**
     * Output exlaining what will use our for loop for.
     * 
     */

    System.out.println("Below we are going to print an entire array." + "\n");

    for (int i = 0; i < arraySize; i++) {

      System.out.println(randomArray[i] + "\n");

    }

    /*
     * Below we are going to print the summation of an integer array.
     */

    /**
     * Integer array.
     * 
     */

    int[] a = {10, 20, 30, 40, 50};

    /**
     * Sum of integer array.
     * 
     */

    int sum = IntStream.of(a).sum();

    System.out.println("The sum is " + sum + "\n");

    /**
     * Integer asigned 0 because it is already assigned another value.
     * 
     */

    int sumation = 0;

    /**
     * Summation of all consecutive real numbers from 1 to 1134.
     * 
     */

    int i = 1134;

    while (i != 0) {

      sumation += i;

      --i;
    }

    System.out.println(
        "Below we are going to print the sumation of the natural numbers from 1 through 1134 \n");

    System.out.println("Sum = " + sumation + "\n");

    System.out.println("Below we will print an incrumented value of an int that starts at 10"
        + " This will be generated from a do while loop." + "\n");
    int x = 10;

    do {

      System.out.print("value of x : " + x);

      x++;

      System.out.print("\n");

    } while (x < 20);

    System.out.println("\n");

    int[] numbers = {10, 20, 30, 40, 50};

    /*
     * Below we are going to use a break statement within a loop which esentially has two uses a
     * break statement inside a loop terminates the loop and the program control begins atthe
     * follwoing statemnent within the loop A break statement would also be used to terminate a case
     * in a switch statement.
     */

    System.out.println("below we are only going to print the integer values of an array" + "\n"
        + "that are before 30 because we placed our break to occur when the"
        + " value of our integer value is equal to 30" + "\n");

    for (int xx : numbers) {

      if (xx == 30) {

        break;

      }

      System.out.print(xx);

      System.out.print("\n");

    }



  }
}


