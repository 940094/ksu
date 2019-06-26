// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class TestMyRectangle
{
    public static void main(String[] args) // program main method
    {
        String again = "y";
        while (again.equals("y") || again.equals("Y")) // sentinel loop
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter width: "); // prompt user to enter width
            double width = input.nextDouble();
            System.out.print("Enter height: "); // prompt user to enter height
            double height = input.nextDouble();

            if (MyRectangle.isValid(width, height)) // check if rectangle width and height are valid
            {
                System.out.println("This is valid rectangle"); // print validation
                System.out.println("The area is " + MyRectangle.Area(width, height)); // print area
                System.out.println("The perimeter is " + MyRectangle.Perimeter(width, height)); // print perimeter
            }
            else // else print invalid
                System.out.println("This is invalid rectangle"); // print invalidation

            System.out.print("Do you want to test another (Y/N)? "); // prompt user to test another rectangle
            again = input.next();
            System.out.println();
        }


    }
}
