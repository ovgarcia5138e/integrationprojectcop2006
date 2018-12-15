package introprog;


/**
 * This class will create getters and setters that will set the fields for the age of the car, the
 * horse power, price, and the model, along with the weight.
 * 
 * @author oscargarcia
 */

public class Car {


  // TODO Auto-generated method stub
  /**
   * The year the car was made.
   * 
   * @author oscargarcia
   *
   */

  private int yearMade;

  /**
   * How old the car is.
   * 
   * @author oscargarcia
   *
   */

  private int yearsOld;

  /**
   * The horse power the car has.
   * 
   * @author oscargarcia
   *
   */

  private int horsePower;

  /**
   * The weight of the car.
   * 
   * @author oscargarcia
   *
   */

  private double weight;

  /**
   * The price of the car.
   * 
   * @author oscargarcia
   *
   */

  private double price;

  /**
   * The modle of the car.
   * 
   * @author oscargarcia
   *
   */
  private String modle;

  /**
   * Describing the variables made.
   * 
   * @param currentYearMade the year the car was made
   * @param currentYearsOld the age of the car.
   * @param currentHorsePower The horsepower of the car.
   * @param currentWeight The weight of the car.
   * @param currentPrice The price of the car.
   * @param currentModle The modle of the car.
   * 
   *        This class will generate the Year the car was made along with the age of the car, the
   *        horse power, price, and the model, along with the weight.
   * 
   * @OscarGarcia
   */
  public Car(int currentYearMade, int currentYearsOld, int currentHorsePower, double currentWeight,
      double currentPrice, String currentModle) {
    yearMade = currentYearMade;
    yearsOld = currentYearsOld;
    horsePower = currentHorsePower;
    setWeight(currentWeight);
    setPrice(currentPrice);
    setModle(currentModle);
  }

  /**
   * This gets the year made of the vehicle.
   * 
   * @author oscargarcia
   *
   */

  public int getYearMade() {
    return yearMade;
  }

  /**
   * Changes the year the car was.
   * 
   * @author oscargarcia
   *
   */

  public void setYearMade(int newValue) {
    yearMade = newValue;
  }

  /**
   * Gets how old the car is.
   * 
   * @author oscargarcia
   *
   */

  public int getYearsOld() {
    return yearsOld;
  }

  /**
   * Changes the age of the car.
   * 
   * @author oscargarcia
   *
   */

  public void setYearsOld(int newValue) {
    yearsOld = newValue;
  }

  /**
   * Gets the horse power of the car.
   * 
   * @author oscargarcia
   *
   */

  public int getHorsePower() {
    return horsePower;
  }

  /**
   * Changes the horsepower of the car.
   * 
   * @author oscargarcia
   *
   */

  public void setHorsePower(int newValue) {
    horsePower = newValue;
  }

  /**
   * Gets the weight of the car.
   * 
   * @author oscargarcia
   *
   */

  public double getWeight() {
    return weight;
  }

  /**
   * Changes the weight of the car.
   * 
   * @author oscargarcia
   *
   */

  public void setWeight(double weight) {
    this.weight = weight;
  }

  /**
   * Gets the price of the car.
   * 
   * @author oscargarcia
   *
   */

  public double getPrice() {
    return price;
  }

  /**
   * Changes the price of the car.
   * 
   * @author oscargarcia
   *
   */

  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * Gets the modle of the car.
   * 
   * @author oscargarcia
   *
   */

  public String getModle() {
    return modle;
  }

  /**
   * Changes the modle of the car.
   * 
   * @author oscargarcia
   *
   */

  public void setModle(String modle) {
    this.modle = modle;
  }



}


