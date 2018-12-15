package introprog;

/**
 * This class below is a class convertible that extends Car class. which will return weight, current
 * price, current model, along with the age of the vehicle, and include whether the convertible top
 * is up or down.
 * 
 * @OscarGarcia
 * 
 */


public class Convertible extends Car {

  /**
   * This class below is a class convertible that extends Car class. which will return weight,
   * current price, current model, along with the age of the vehicle, and include whether the
   * convertible top is up or down.
   * 
   * @OscarGarcia
   * 
   */
  public Convertible(int currentYearMade, int currentYearsOld, int currentHorsePower,
      double currentWeight, double currentPrice, String currentModle, boolean topDown) {
    super(currentYearMade, currentYearsOld, currentHorsePower, currentWeight, currentPrice,
        currentModle);
    // TODO Auto-generated constructor stub

    this.topDown = topDown;

  }

  boolean topDown;



  /**
   * This method will generate statements that will let the user know whether the top of the
   * convertible is down or up.
   */

  public void printStatus() {

    System.out.println("Below we will print a a statement using an else if "
        + "statement that will let us know whether the top is up or down.");

    System.out.println("All of the fields will be printed from the convertible class"
        + " extending to the car class.");

    if (topDown == false) {

      System.out.println("The top is down.");

    } else {

      System.out.println("The top is up.");

    }

  }
}
