// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 10
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class TestTriangle
{
    public static void main(String[] args) // program main method
    {
        Scanner input = new Scanner(System.in);

        String again = "Y";
        while (again.equals("Y") || again.equals("y")) // senitnel loop to allow user to re-run program
        {
            // create myTriangle
            System.out.print("\nCreating myTriangle: ");
            double[] triangleSides = getValidNumbers(); // prompt user to enter 3 valid doubles for sides of triangle
            System.out.print("Please enter a string to represent the triangle fill color: "); // prompt user to enter a triangle fill color
            String color = input.nextLine();
            System.out.print("Please enter a boolean to indicate whether the triangle is filled: "); // prompt user to indicate if the triangle is filled or not
            boolean filled = input.nextBoolean();
            Triangle myTriangle = new Triangle(triangleSides[0], triangleSides[1], triangleSides[2], color, filled); // create new Triangle object with sides, color, and filled values
            System.out.println("\nPrinting myTriangle:\t" + myTriangle.toString("myTriangle")); // print triangle values

            // create yourTriangle
            System.out.println("--------------------");
            System.out.print("Creating yourTriangle: ");
            triangleSides = getValidNumbers(); // prompt user to enter 3 valid doubles for sides of triangle
            System.out.print("Please enter a string to represent the triangle fill color: "); // prompt user to enter a triangle fill color
            color = input.next();
            System.out.print("Please enter a boolean to indicate whether the triangle is filled: "); // prompt user to indicate if the triangle is filled or not
            filled = input.nextBoolean();
            Triangle yourTriangle = new Triangle(triangleSides[0], triangleSides[1], triangleSides[2], color, filled); // create new Triangle object with sides, color, and filled values
            System.out.println("Printing yourTriangle:\t" + yourTriangle.toString("yourTriangle")); // print triangle values

            // test getSide1() on both objects
            System.out.println("--------------------");
            System.out.println("Testing getSide1():");
            System.out.println("Side1 of myTriangle:\t" + myTriangle.getSide1()); // get side1
            System.out.println("Side1 of yourTriangle:\t" + yourTriangle.getSide1()); // get side1

            // test getSide2() on both objects
            System.out.println("--------------------");
            System.out.println("Testing getSide2():");
            System.out.println("Side2 of myTriangle:\t" + myTriangle.getSide2()); // get side2
            System.out.println("Side2 of yourTriangle:\t" + yourTriangle.getSide2()); // get side2

            // test getSide3() on both objects
            System.out.println("--------------------");
            System.out.println("Testing getSide3():");
            System.out.println("Side3 of myTriangle:\t" + myTriangle.getSide3()); // get side3
            System.out.println("Side3 of yourTriangle:\t" + yourTriangle.getSide3()); // get side3

            // test setSide1() on both objects
            System.out.println("--------------------");
            System.out.println("Testing setSide1():");
            System.out.print("Please enter a positive double as the new side1 for myTriangle (e.g. 1.3): "); // prompt user to enter new double for side
            double newSide = input.nextDouble();
            while (newSide <= 0)
            {
                System.out.print("Please enter a positive double as the new side for myTriangle (e.g. 1.3): "); // re-prompt user to enter new double for side
                newSide = input.nextDouble();
            }
            System.out.println("Side1 of myTriangle before change:\t" + myTriangle.getSide1()); // print side before change
            myTriangle.setSide1(newSide); // update side based on user input
            System.out.println("Side1 of myTriangle after change:\t" + myTriangle.getSide1()); // print side after change

            System.out.print("Please enter a positive double as the new side1 for yourTriangle (e.g. 1.3): ");  // prompt user to enter new double for side
            newSide = input.nextDouble();
            while (newSide <= 0)
            {
                System.out.print("Please enter a positive double as the new side for yourTriangle (e.g. 1.3): "); // re-prompt user to enter new double for side
                newSide = input.nextDouble();
            }
            System.out.println("Side1 of yourTriangle before change:\t" + yourTriangle.getSide1()); // print side before change
            yourTriangle.setSide1(newSide); // update side based on user input
            System.out.println("Side1 of yourTriangle after change:\t" + yourTriangle.getSide1()); // print side after change

            // test setSide2() on both objects
            System.out.println("--------------------");
            System.out.println("Testing setSide2():");
            System.out.print("Please enter a positive double as the new side2 for myTriangle (e.g. 1.3): "); // prompt user to enter new double for side
            newSide = input.nextDouble();
            while (newSide <= 0)
            {
                System.out.print("Please enter a positive double as the new side for myTriangle (e.g. 1.3): "); // re-prompt user to enter new double for side
                newSide = input.nextDouble();
            }
            System.out.println("Side2 of myTriangle before change:\t" + myTriangle.getSide2()); // print side before change
            myTriangle.setSide2(newSide); // update side based on user input
            System.out.println("Side2 of myTriangle after change:\t" + myTriangle.getSide2()); // print side after change

            System.out.print("Please enter a positive double as the new side2 for yourTriangle (e.g. 1.3): ");  // prompt user to enter new double for side
            newSide = input.nextDouble();
            while (newSide <= 0)
            {
                System.out.print("Please enter a positive double as the new side for yourTriangle (e.g. 1.3): "); // re-prompt user to enter new double for side
                newSide = input.nextDouble();
            }
            System.out.println("Side2 of yourTriangle before change:\t" + yourTriangle.getSide2()); // print side before change
            yourTriangle.setSide2(newSide); // update side based on user input
            System.out.println("Side2 of yourTriangle after change:\t" + yourTriangle.getSide2()); // print side after change

            // test setSide3() on both objects
            System.out.println("--------------------");
            System.out.println("Testing setSide3():");
            System.out.print("Please enter a positive double as the new side3 for myTriangle (e.g. 1.3): "); // prompt user to enter new double for side
            newSide = input.nextDouble();
            while (newSide <= 0)
            {
                System.out.print("Please enter a positive double as the new side for myTriangle (e.g. 1.3): "); // re-prompt user to enter new double for side
                newSide = input.nextDouble();
            }
            System.out.println("Side3 of myTriangle before change:\t" + myTriangle.getSide3()); // print side before change
            myTriangle.setSide3(newSide); // update side based on user input
            System.out.println("Side3 of myTriangle after change:\t" + myTriangle.getSide3()); // print side after change

            System.out.print("Please enter a positive double as the new side3 for yourTriangle (e.g. 1.3): ");  // prompt user to enter new double for side
            newSide = input.nextDouble();
            while (newSide <= 0)
            {
                System.out.print("Please enter a positive double as the new side for yourTriangle (e.g. 1.3): "); // re-prompt user to enter new double for side
                newSide = input.nextDouble();
            }
            System.out.println("Side3 of yourTriangle before change:\t" + yourTriangle.getSide3()); // print side before change
            yourTriangle.setSide3(newSide); // update side based on user input
            System.out.println("Side3 of yourTriangle after change:\t" + yourTriangle.getSide3()); // print side after change

            // test getArea() on both objects
            System.out.println("--------------------");
            System.out.println("Testing getArea():");
            System.out.println("Area of myTriangle:\t" + myTriangle.getArea()); // get and print area
            System.out.println("Area of yourTriangle:\t" + yourTriangle.getArea()); // get and print area

            // test getPerimeter() on both objects
            System.out.println("--------------------");
            System.out.println("Testing getPerimeter():");
            System.out.println("Perimeter of myTriangle:\t" + myTriangle.getPerimeter()); // get and print perimeter
            System.out.println("Perimeter of yourTriangle:\t" + yourTriangle.getPerimeter()); // get and print perimeter

            // test getDateCreated() on both objects
            System.out.println("--------------------");
            System.out.println("Testing getDateCreated():");
            System.out.println("myTriangle was created on:\t" + myTriangle.getDateCreated()); // get and print dateCreated
            System.out.println("yourTriangle was created on:\t" + yourTriangle.getDateCreated()); // get and print dateCreated

            // test toString() on both objects
            System.out.println("--------------------");
            System.out.println("Testing toString():");
            System.out.println("myTriangle:\t" + myTriangle.toString("myTriangle")); // print values of triangle object
            System.out.println("\nyourTriangle:\t" + yourTriangle.toString("yourTriangle")); // print values of triangle object

            // prompt user to re-run program
            System.out.print("\nDo you want to re-run program (Y/N)? "); // print prompt for user to re-run program
            again = input.next();
            System.out.println();
        }

    }

    private static double[] getValidNumbers() // program to get 3 valid user inputted doubles for sides of triangle
    {
        boolean allPositive = false;
        double[] triangleSides = new double[3];
        while (!allPositive) // validate user input
        {
            allPositive = true;
            Scanner input = new Scanner(System.in);
            System.out.print("\nPlease enter 3 positive double values for the sides of a triangle (e.g., 1.0 1.0 1.0): "); // prompt user for 3 positive double values
            for (int i = 0; i < 3; i++)
            {
                triangleSides[i] = input.nextDouble(); // set next element in array to next user inputted double
                if (triangleSides[i] <= 0)
                    allPositive = false;
            }
        }
        
        return triangleSides; // return an array of 3 doubles representing the 3 triangle sides
    }
}
