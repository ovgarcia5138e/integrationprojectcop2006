package introprog;

/**
 * Represents a character within a game.
 * 
 * @author oscargarcia
 *
 */

public class Character {

  /**
   * The name of the character.
   * 
   * @author oscargarcia
   *
   */

  String name = "Charles";

  /**
   * The health of the character as an integer.
   * 
   * @author oscargarcia
   *
   */

  int health = 250;

  /**
   * Changes the name of the character.
   * 
   * @author oscargarcia
   *
   */

  public void setname(String name) {
    this.name = name;

  }

  /**
   * Gets the name of the character.
   * 
   * @author oscargarcia
   *
   */

  public String getname() {

    return name;

  }

  /**
   * Changes the health of a character.
   * 
   * @author oscargarcia
   *
   */

  public void sethealth(int health) {
    this.health = health;
  }

  /**
   * Gets the health of a character.
   * 
   * @author oscargarcia
   *
   */

  public int gethealth() {
    return health;
  }

  /**
   * Below we are going to create a character that will get field information from a character
   * method. The fields will be health and the name.
   */

  public Character() {
    name = "Will";
    health = 2000;

  }

  public Character(String name, int health) {
    this.name = name;
    this.health = health;
  }

}
