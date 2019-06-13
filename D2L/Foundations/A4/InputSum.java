// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class InputSum
{
    public static void main(String[] args) // program main method
    {
        char again = 'y'; // declare and initialize sentinal loop value again as the char 'y'

        // continuously prompt user for positive integers and calculare the sum
        while (again == 'y')
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter positive integers (-1 to quit): "); // prompt user for input
            int num = input.nextInt(); // read first number from user input
            String numbers = num + ""; // initialize the numbers variable as a string of the first number
            int sum = num; // initialize the sum variable as the first number

            // iterate through each inputted number
            while (num != -1)
            {
                num = input.nextInt(); // read next inputted number
                if (num > 0) // check if the current number is a positive number
                {
                    numbers += ", " + num; // add current number to numbers string
                    sum += num; // add current number to sum
                }
            }

            // print inputted numbers and sum
            System.out.println();
            System.out.println("Entered numbers:\t" + numbers); // print inputted positive numbers
            System.out.println("The sum:\t\t" + sum); // print sum of positive inputted numbers
            System.out.println();

            // prompt user to run program again or stop
            System.out.print("Test another set of numbers (y/n)? ");
            again = input.next().charAt(0);
        }
    }
}
