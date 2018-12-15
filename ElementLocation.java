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

  public static void main(String[] args) {

    Random rnd = new Random();

    int[] randomIntegers = new int[20];

    double smallest = randomIntegers[0];

    System.out.println("Below we will print a mulitple randomly generated array"
        + " and run the array through a for loop that will"
        + " return the index number of the smallest valued element. " + "\n");

    for (int i = 0; i < randomIntegers.length; i++) { // fills array with random integers
      randomIntegers[i] = rnd.nextInt(99) + 1;
      System.out.println("Idex Number: " + i + " Element: " + randomIntegers[i]);
    }

    for (int i = 0; i < randomIntegers.length; i++) {
      // get the location of smallest number in
      // the
      // array
      if (randomIntegers[i] < smallest) {
        smallest = randomIntegers[i];
      }
    }

    System.out.println(" ");


  }


}
