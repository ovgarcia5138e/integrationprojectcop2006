package introprog;

// Oscar Garcia Vazquez
/*
 * Hey guys the program is intended to give you guys a look into what Java is and the process of
 * learning java. The theme of this project is running a pie shop.
 */

/*
 * Below are some multiline comments that describe basic java data types and how they relate to our
 * pie shop. lets take a look.
 */

/*
 * A byte is an 8 bit data type that has a minimum value of -128 and a maximum value of 127
 * (inclusive). This data type is useful in saving memory withing large arrays in a situation where
 * memory savings are significant. The limited range of the varible can be referenced as well as a
 * method of documentation. A byte can be used in place of an int in order to help clairfy code
 * based on its limits.
 */

/*
 * A boolean data type has only two plausible values, true or flase. which can be useful in true or
 * flase condidtions. the data type represents one bit of information although its size is not
 * directly defined.
 */

/*
 * A char data type is a single 16-bit Unicode character. The minimum vlaue is '/u0000' or zero with
 * a maximum value of '\uffff' (or in other words 65,535 inclusive).
 */

/*
 * A double data type is a double precision 64bit IEEE 754 floating point. This data type is usually
 * used for decimal values. Although this data type should not be used for precise values.
 */

/*
 * A float data type is a single-precision 32 bit IEEE 754 floating point. It is highly recomended
 * to use a float instead of a double if you find yourself in a situation that you need to save
 * memory in large e arrays of floating point numbers. it is recomdned that you never use a float to
 * holde precise values.
 */

/*
 * A long data type is a 64 bit two's complement integer. with a minimum vlaue of-2^63, and a
 * maximum vlaue of 2^63(-1) . the long data type contains methods that support mathmatic operations
 * for unsigned long. Use a long for values that are wider than an int.
 */

/*
 * A string is a member variable and has class level scope, which means it can be accessed directly
 * virtually anywehre. whereas in block scope a variable that is declared within a a pair of
 * brackets that variable can only be accessed within the the brackets only. which can be the same
 * for variables declared inside of a mehtod they can not be accesed outside of a that method.
 * 
 */


public class Helloworld {


  /**
   * This code will be an introduction into the java programming language.
   * 
   * @author oscargarcia
   *
   */

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("Hello World, is the phrase that typically used when first learning any" + ""
        + " programing language. We are about to go into an experience"
        + " learning Java the programing language together. Sit back and enjoy the ride. ");

    System.out.println(" ");

    String explainingInt =
        "Hey guys bellow we are goign to print an INT data type an int data type can be used"
            + " to hold the quanitiy of pies in an order at our pie shop";

    int pieDiameter = 14;

    int piePrice = 2;

    final double SquareFtofLocation = 1981.98;

    System.out.println(
        "This is the area per square foot of our location " + SquareFtofLocation + " square feet.");

    System.out.println(" ");

    System.out.println(explainingInt);

    System.out.println(" ");

    System.out.println(piePrice);

    System.out.println(" ");

    System.out.println(pieDiameter);

    System.out.println(" ");

    boolean answerOne = false;

    boolean answerTwo = true;

    boolean answerThree = answerOne;

    System.out.println("Below we are going to print boolean data types." + "\n");

    System.out.println(answerOne);

    System.out.println(" ");

    System.out.println(answerTwo);

    System.out.println(" ");

    System.out.println(answerThree);

    System.out.println(" ");

    /*
     * Casting is done below and is useful when converting one object type and transforming it into
     * another object type which can be seen as done below casting a string to an object. In this
     * specific scenario we upcasted a string to an object.
     * 
     */
    String sentence = "This will be casted into a string";

    String sentenceConverted = sentence;

    /*
     * the .charAt method produces the characte that is in the selected loctation in the array
     * (string).
     */
    System.out.println("Below we will print a char that was at a selected location the char array"
        + " by using the charAt function." + "\n");
    System.out.println(explainingInt.charAt(2));

    System.out.println(" ");

    /*
     * the .length method produces the length of the string
     */

    System.out.println("Below we will print the length of a string" + "\n");


    System.out.println(explainingInt.length());

    System.out.println(" ");

    /*
     * the .replace method replaces a specified character with a decided character.
     */
    System.out.println(explainingInt.replace('a', 'W'));

    System.out.println(" ");

    System.out
        .println("An escape sequence inserts a special meaning to the complier by using a pair of"
            + " backward slases in this case we will use it to insert double"
            + " quotes are the word \"Cheese\"");

    System.out.println(" ");

    double random = (double) Math.random() * 10;
    System.out.println(random);

    System.out.println(" ");

    int wholeNumber = (int) Math.round(random);
    System.out.println(wholeNumber);

    System.out.println(" ");

    /*
     * below we have a switch statement that takes the input of our char variable and prints out a
     * type of pie that we have at our location.
     */

    System.out.println(
        "Below we will print the pie type that was selected from our" + "switch statemtn.");


    int pieCase = 1;

    switch (pieCase) {

      case '1':
        System.out.println("Chocolate Pie");
        break;
      case '2':
        System.out.println("Apple Pie");
        break;
      case '3':
        System.out.println("Pumpkin Pie");
        break;

      default:
        System.out.println("No pie was selected");

    }

    System.out.println(pieCase);

    System.out.println(" ");

    /*
     * below we are doing some basic math operations that can be useful when taking inventory,
     * adding up the total of sale, while including prices and taxes. Amoung other things such as
     * pay roll as well.
     */

    System.out.println("Below will print a random number that was added from a random number "
        + " that was rounded up to a whole number.");

    System.out.println(random + wholeNumber);

    System.out.println(" ");

    System.out.println("Below will print a random number that was subtracted from a random number "
        + " that was rounded up to a whole number.");

    System.out.println(random - wholeNumber);


    System.out.println(" ");

    System.out.println("Below will print a random number that was multiplied from a random number "
        + " that was rounded up to a whole number.");

    System.out.println(random * wholeNumber);

    System.out.println(" ");

    System.out.println("Below will print a random number that was divided from a random number "
        + " that was rounded up to a whole number.");

    System.out.println(random / wholeNumber);

    System.out.println(" ");

    System.out.println("Below will print a random number that was compated from a random number "
        + " that was rounded up to a whole number.");

    System.out.println(random % wholeNumber);

    System.out.println(" ");

    System.out.println("Below will print a random number that was incumented from a random number "
        + " that was rounded up to a whole number.");

    System.out.println(random++);

    System.out.println(" ");

    System.out.println("Below will print a random number that was decreased from a random number "
        + " that was rounded up to a whole number.");

    System.out.println(wholeNumber--);

    System.out.println(" ");

    /*
     * below we are dealing with some if statements that use operands and conditions that dictate
     * whether our statement prints.
     */
    if (random >= wholeNumber) {
      System.out.println("The double variable random is greater than the int variable wholeNumber");
    }

    if (random <= wholeNumber || random < 0) {

      System.out.println(
          "The double variable random is less than or equal to the int variable wholeNumber");
    } else if (wholeNumber <= random && wholeNumber > 1) {

      System.out.println(
          "The int variable wholeNumber is less than or equal to the double variable random.");
    }

    System.out.println(" ");

    int n = - -2;

    System.out.println(n + "\n");


    System.out.println(explainingInt.equals(sentenceConverted) + "\n");
    /*
     * compares object references to determine whether the two operands are referring to the same
     * objects, not equivilant objects.
     */


    System.out.println(explainingInt == sentenceConverted + "\n");


    /*
     * Operator precedence is an order in which operators are evaluated in an expressions when there
     * are several operators present. Think about it out like PEMDAS in mathamatics.
     */
    System.out
        .println("below we are going to be using a for loop to print a count that begins at 0 and"
            + " will continue until it becomes at least 5" + "\n");


    for (int count = 0; count <= 5; count++) {
      System.out.println(
          "The count based on the for loop is going to produce these numbers " + count + "\n");
    }


    int height = 1;

    int numCycles = 4;

    int cycle = 1;

    while (cycle < numCycles) {
      height = height * 2;
      height = height + 1;
      cycle = cycle + 2;

    }

    if (numCycles % 2 == 1) {
      // odd
      height = height * 2;
    }

    System.out.println("Below we will print the height of a character that was created in a "
        + " seperate class.");

    System.out.println(height);

    System.out.println(" ");

    System.out.println("Below we will print the health of a character that was created in a "
        + " seperate class.");

    Character obj = new Character();

    System.out.println(obj.gethealth());


  }

  /**
   * This will determine which function is less.
   * 
   * @author oscargarcia
   *
   */

  public static int minFunction(int n1, int n2) {
    int min;

    if (n1 > n2) {
      min = n2;
    } else {
      min = n1;

      return min;
    }
    return min;

  }

}
