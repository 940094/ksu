// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 8
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class TestRectangle
{
    public static void main(String[] args) // program main method
    {
        String again = "y";
        while (again.equals("y") || again.equals("Y")) // seninel loop to allow user to re-run program
        {
            // declare and initialize Rectangle objects
            Rectangle myRectangle = new Rectangle(); // declare and initialize myRectangle with default width of 1.0 and default height of 1.0
            Rectangle hisRectangle = new Rectangle(5, 10); // declare and initialize hisRectangle with a width of 5 and height of 10
            Rectangle herRectangle = new Rectangle(5.75, 12.50); // declare and initialize herRectangle with a width of 5.75 and height of 12.50

            // print myRectangle width, height, area, and perimeter
            System.out.println("\nmyRectangle:");
            System.out.println("------------");
            System.out.printf("Width:\t\t%1.0f\n", myRectangle.getWidth()); // print width of myRectangle
            System.out.printf("Height:\t\t%1.0f\n", myRectangle.getHeight()); // print height of myRectangle
            System.out.printf("Area:\t\t%1.0f\n", myRectangle.getArea()); // print area of myRectangle
            System.out.printf("Perimeter:\t%1.0f\n", myRectangle.getPerimeter()); // print perimeter of myRectangle

            // print hisRectangle width, height, area, and perimeter
            System.out.println("\nhisRectangle:");
            System.out.println("------------");
            System.out.printf("Width:\t\t%1.0f\n", hisRectangle.getWidth()); // print width of hisRectangle
            System.out.printf("Height:\t\t%1.0f\n", hisRectangle.getHeight()); // print height of hisRectangle
            System.out.printf("Area:\t\t%1.0f\n", hisRectangle.getArea()); // print area of hisRectangle
            System.out.printf("Perimeter:\t%1.0f\n", hisRectangle.getPerimeter()); // print perimeter of hisRectangle

            // print herRectangle width, height, area, and perimeter
            System.out.println("\nherRectangle:");
            System.out.println("------------");
            System.out.printf("Width:\t\t%1.0f\n", herRectangle.getWidth()); // print width of herRectangle
            System.out.printf("Height:\t\t%1.0f\n", herRectangle.getHeight()); // print height of herRectangle
            System.out.printf("Area:\t\t%1.0f\n", herRectangle.getArea()); // print area of herRectangle
            System.out.printf("Perimeter:\t%1.0f\n", herRectangle.getPerimeter()); // print perimeter of herRectangle

            // test toString() method
            System.out.println("\nRectangle myRectangle is " + myRectangle.toString()); // print width and height of myRectangle
            System.out.println("\nRectangle hisRectangle is " + hisRectangle.toString()); // print width and height of hisRectangle
            System.out.println("\nRectangle her Rectangle is " + herRectangle.toString()); // print width and height of herRectangle

            //prompt user to re-run program
            Scanner input = new Scanner(System.in);
            System.out.print("\nWould you like to re-run the program (Y/N)? "); // print prompt for user to re-run program
            again = input.next();
            System.out.println();
        }
    }
}
