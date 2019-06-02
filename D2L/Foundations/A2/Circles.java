// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 2
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class Circles
{
  public static void main(String[] args) // program main method
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter circle1's center x-, y-coordinates, and radius: "); // prompt user for x1, y1, and r1
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double r1 = input.nextDouble();
    System.out.print("Enter circle2's center x-, y-coordinates, and radius: "); // prompt user for x2, y2, and r2
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double r2 = input.nextDouble();

    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // calculate distance between two coordinates

    System.out.println("Circle 1 center:\t" + "(" + (int)x1 + "," + (int)y1 + ")"); // print x1,y1
    System.out.println("Circle 1 radius:\t" + (int)r1); // print radius of circle 1
    System.out.println("Circle 2 center:\t" + "(" + (int)x2 + "," + (int)y2 + ")"); // print x2,y2
    System.out.println("Circle 2 radius:\t" + (int)r2); // print radius of circle 2

    if (distance <= Math.abs(r1 - r2)) // if one circle completely inside another
      System.out.println("Judgment:\t\t" + "Circle 2 is completely inside circle 1"); // print circle is inside other circle
    else if (distance <= r1 + r2) // if circles overlapping
      System.out.println("Judgment:\t\t" + "Circle 2 is overlapping with circle 1"); // print circles are overlapping
    else
      System.out.println("Judgment:\t\t" + "Circle 2 is completely outside circle 1"); // print circles are outside each other
  }
}
