import java.util.Scanner; // Scanner is in the java.util package

public class TwoOne {
  public static void main(String[] args) {
    // declar input is a variable whose type is Scanner
    // create an object that is a Scanner type
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a degree in Celsius: ");
    // invoke the input methods, which has all the Scanner class methods
    double celsius = input.nextDouble(); // read a double
    double fahrenheit = (9.0 / 5) * celsius + 32 ; // (9 / 5) * 43.0 + 32
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
  }
}
