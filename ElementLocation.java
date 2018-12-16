package introprog;

import java.util.Random;

public class ElementLocation {

  /**
   * 
   * This code will generate random numbers that will turned into an array that will then run
   * through a for loop and and return the element location.
   * 
   * @OscarGarcia
   */



  /**
   * @param args code sourced from www.stackoverflow.com
   *        
   */

  public static void main(String[] args) {

    Random randomNumber = new Random();

    int[] randomArrayInt = new int[20];

    double smallest = randomArrayInt[0];

    System.out.println("Below we will print a mulitple randomly generated array"
        + " and run the array through a for loop that will"
        + " return the index number of the smallest valued element. " + "\n");

    for (int i = 0; i < randomArrayInt.length; i++) { // Produces array with random integers
      randomArrayInt[i] = randomNumber.nextInt(99) + 1;
      System.out.println("Idex Number: " + i + " Element: " + randomArrayInt[i]);
    }

    for (int i = 0; i < randomArrayInt.length; i++) {
      //Produce the location of smallest number
      if (randomArrayInt[i] < smallest) {
        smallest = randomArrayInt[i];
      }
    }

    System.out.println(" ");


  }


}
