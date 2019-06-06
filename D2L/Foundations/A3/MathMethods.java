// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 3
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class MathMethods
{
  public static void main(String[] args) // program main method
  {
    Scanner input = new Scanner(System.in);

    // Part A: Enter a negative number and print its absolute value
    System.out.print("Enter a negative integer number: "); // prompt user for negative integer number
    int num = input.nextInt();
    System.out.println("The absolute value of " + num + " is: " + Math.abs(num)); // print absolute value of user input

    // Part B: Enter a floating-point number representing an angle and print out the angle’s cosine, sine, and tangent values
    System.out.print("\nEnter a floating-point number representing an angle: "); // prompt user for angle
    float angle = input.nextFloat();
    System.out.printf("The cosine of this angle is:\t%1.14f\n", Math.cos(angle));  // print cosine of angle
    System.out.printf("The sine of this angle is:\t%1.17f\n", Math.sin(angle)); // print sine of angle
    System.out.printf("The tangent of this angle is:\t%1.17f\n", Math.tan(angle)); // print tangent of angle

    // Part C: Enter a floating point number and print out both of its floor and ceiling values
    System.out.print("\nEnter a floating-point number:\t"); // prompt user for floating point number
    float floatNum = input.nextFloat();
    System.out.printf("The floor value of " + floatNum + " is:\t%2.1f\n", Math.floor(floatNum)); // print floor value of user input
    System.out.printf("The ceiling value of " + floatNum + " is:\t%2.1f\n", Math.ceil(floatNum)); // print ceiling value of user input

    // Part D: Rnter two floating-point numbers (say X and Y) and print out the value of X Y (X is raised to the power of Y).
    System.out.print("\nEnter a floating-point number as X: "); // prompt user for floating point number
    float x = input.nextFloat();
    System.out.print("Enter a floating-point number as Y: "); // prompt user for floating point number
    float y = input.nextFloat();
    System.out.printf("The value of X^Y is: %2.1f\n", Math.pow(x, y)); // print x^y of user inputs

    // Part E: Enter an integer number and print out its square root (works with both negative and positive inputs)
    System.out.print("\nEnter an integer number: "); // prompt user for integer
    int number = input.nextInt();
    System.out.printf("The square root of " + number + " is: %2.1f\n", Math.sqrt(number)); // print sqaure root of user input
  }
}
