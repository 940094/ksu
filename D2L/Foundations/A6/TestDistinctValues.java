// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 6
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class TestDistinctValues
{
    public static void main(String[] args) // program main method
    {
        Scanner input = new Scanner(System.in);

        String again = "y";
        while (again.equals("Y") || again.equals("y")) // use sentinel loop to re-run program
        {
            System.out.print("Enter 10 integers: "); // prompt user to enter 10 integers
            int[] listBefore = new int[10]; // declare and initialize array with 10 ints 0
            for (int i = 0; i < listBefore.length; i++)
                listBefore[i] = input.nextInt(); // add next user inputted integer to array

            // print entered integers
            System.out.print("Entered 10 integers:\t\t");
            for (int i = 0; i < listBefore.length; i++)
                System.out.print(listBefore[i] + " "); // print next value in array

            // print array before processing
            System.out.print("\nArray before processing:\t");
            for (int i = 0; i < listBefore.length; i++)
                System.out.print(listBefore[i] + " "); // print next value in array

            // declare listAfter array variable and initialize as return value of getValues() method, with user inputted array
            int[] listAfter = DistinctValues.getValues(listBefore);

            // print array after processing
            System.out.print("\nArray after processing:\t\t");
            for (int i = 0; i < listAfter.length; i++)
                System.out.print(listAfter[i] + " "); // print next value in array
            System.out.println();

            // prompt user to re-run program
            System.out.print("Do you want to enter another array(Y/N)? "); // print prompt to re-run program
            again = input.next();
            System.out.println();
        }
    }
}
