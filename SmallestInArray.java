package introprog;

/**
 * This will print the smallest value in a randomly generated array.
 * 
 * @param args Will print the smallest value.
 * 
 * @author oscargarcia
 */

public class SmallestInArray {

  /**
   * This will use a for loop to determine the smallest value in an integer array.
   * 
   * 
   * @author oscargarcia
   */

  public static int getSmallest(int[] a, int total) {
    int temp;
    for (int i = 0; i < total; i++) {
      for (int j = i + 1; j < total; j++) {
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    return a[0];
  }

  /**
   * This will print the smallest value of an array.
   * 
   * @param args This will print the smallest value of an array.
   * 
   * @author oscargarcia
   */

  public static void main(String[] args) {
    System.out.println("Below we will print the smallest value in an array"
        + " a randomly generated array that we ran through a for loop"
        + " in order to find the smallest value.");
    // TODO Auto-generated method stub
    int[] a = {1, 2, 5, 6, 3, 2};
    int[] b = {44, 66, 99, 77, 33, 22, 55};
    System.out.println("Smallest: " + getSmallest(a, 6));
    System.out.println("Smallest: " + getSmallest(b, 7));
  }



}
