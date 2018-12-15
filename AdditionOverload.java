package introprog;

/**
 * This will demonstrate how to overload a method. While also describing it within the comments.
 * 
 * @author oscargarcia
 *
 */
public class AdditionOverload {

  /**
   * This represents the summation of a few integers.
   * 
   * @author oscargarcia
   *
   */
  public int add(int a, int b, int c) {

    int sum = a + b + c;

    return sum;
  }

  /**
   * This represents the summation of a few doubles.
   * 
   * @author oscargarcia
   *
   */

  public double add(double a, double b, double c) {
    double sum = a + b + c;
    return sum;
  }

  /**
   * This will output the summation of integers and doubles.
   * 
   * @author oscargarcia
   *
   */

  class AddDouble {

    public void main(String[] args) {
      AdditionOverload ob = new AdditionOverload();

      int sum2 = ob.add(1, 2, 3);
      System.out.println("The sum of the three integer values " + sum2 + "\n");

      double sum3 = ob.add(1.0, 2.0, 3.0);
      System.out.println("The sum of the three double values " + sum3 + "\n");

    }
  }

  /*
   * Inheritance is where a new class is derived from a currently existing class. In java, classes
   * are able to inherit the properties adn methods of another class or classes.
   * 
   * A Class that is derived from another is called the subclass, congruently the class from which
   * the subclass was derived from is called as a superclass.
   * 
   * Although a subclass is only able to have one superclass, where as a superclass is able to have
   * multiple superclasses.
   * 
   * The key word extends is used when deriving a sublcass from a superclass.
   * 
   */


}
