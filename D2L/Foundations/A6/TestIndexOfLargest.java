// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 6
// IDE: Atom

import java.util.Scanner; // import Scanner class
import java.util.Arrays; // import Arrays class

public class TestIndexOfLargest
{
    public static void main(String[] args) // program main method
    {
        String again = "y";
        while (again.equals("y") || again.equals("Y")) // use sentinel loop to prompt user to re-run program
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 10 integers: "); // prompt user to enter 10 integers
            int[] list = new int[10]; // assume list size is 10

            // create an array of user inputs
            for (int i = 0; i < list.length; i++)
            {
                list[i] = input.nextInt(); // set next list value equal to next user inputted integer
            }

            // print user iputted array
            System.out.print("Entered integer values:\t"); // print entered integer values
            for (int i = 0; i < list.length; i++)
            {
                System.out.print(list[i] + " "); // print list value at index i
            }

            // print index of largest integer in array
            System.out.println("\nIndex of largest value:\t" + IndexOfLargest.findIndex(list)); // call findIndex() method with user inputted array

            // prompt user to re-run program
            System.out.print("\nWould you like to enter another array(Y/N)? "); // print prompt for user to re-run program
            again = input.next();
            System.out.println();
        }
    }
}
