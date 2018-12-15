package introprog;

/**
 * Below we will have getters and setters that will give fields to a pie store suchas an order
 * number, a price, a quantitiy of pies, and a total.
 * 
 * @param Displaying getters and setters.
 * 
 */

public class Pies {

  /**
   * Represents an order number.
   * 
   * @param args Represents an order number.
   */

  private int orderNumber;

  /**
   * Represents a pie price.
   * 
   * @param args Represents a pie price.
   */

  private double price;

  /**
   * Represents a quantitiy of pies.
   * 
   * @param args Represents a qunaitiy of pies.
   */

  private int quantityOfPies;

  /**
   * Represents a total of a purchase of pies.
   * 
   * @param args Represents a total of purchase.
   */

  private double total;

  /**
   * Assigninged values to our fields.
   * 
   */

  public Pies(int currentOrderNumber, double selectedPrice, double currentTotal,
      int currentQuantityOfPies) {

    orderNumber = currentOrderNumber;

    price = selectedPrice;

    quantityOfPies = currentQuantityOfPies;

    total = currentTotal;
  }

  /**
   * Gets an order number.
   * 
   */

  public int getOrderNumber() {
    return orderNumber;
  }

  /**
   * Changes the order number.
   * 
   */

  public void setOrderNumber(int newValue) {
    orderNumber = newValue;
  }

  /**
   * Gets the price of a pie.
   * 
   */

  public double getPrice() {
    return price;
  }

  /**
   * Changes the price of a pie.
   * 
   */

  public void setPrice(double newValue) {
    price = newValue;
  }

  /**
   * Gets the total of a purchase.
   * 
   */

  public double getCurrentTotal() {
    return total;
  }

  /**
   * Changes the total of a purchase.
   * 
   */

  public void setCurrentTotal(double newValue) {
    total = newValue;
  }

  /**
   * Gets the quantitiy of pies.
   * 
   */

  public int getCurrentQuantity() {
    return quantityOfPies;
  }

  /**
   * Changes the quanity of pies.
   * 
   */

  public void setCurrentQuantity(int newValue) {
    quantityOfPies = newValue;
  }

}
