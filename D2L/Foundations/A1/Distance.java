// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 1
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class Distance
{
  public static void main(String[] args) // program main method
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter a coordinate x1 (e.g. 2.0): "); // prompt user for x1
    double x1 = input.nextDouble();
    System.out.print("Please enter a coordinate y1 (e.g. 2.0): "); // prompt user for x2
    double y1 = input.nextDouble();
    System.out.print("Please enter a coordinate x2 (e.g. 3.0): "); // prompt user for x2
    double x2 = input.nextDouble();
    System.out.print("Please enter a coordinate y2 (e.g. 3.0): "); // prompt user for y2
    double y2 = input.nextDouble();

    double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); // calculate distance

    System.out.println("First point coordinates:\t" + "(" + x1 + ", " + y1 + ")"); // print x1, y1
    System.out.println("Second point coordinates:\t" + "(" + x2 + ", " + y2 + ")"); // print x2, y2
    System.out.println("The distance is:\t\t" + distance); // print distance
  }
}
