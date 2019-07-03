// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 7
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class WeeklyHours
{
    public static void main(String[] args) // program main method
    {
        String again = "Y";
        while (again.equals("Y") || again.equals("y")) // program sentinel loop to allow user to re-run program
        {
            int[][] hours = new int[3][7]; // declare and initialize 2D array with 3 rows and 7 columns

            // populate array with random numbers
            for (int i = 0; i < hours.length; i++)
            {
                for (int j = 0; j < hours[i].length; j++)
                {
                    hours[i][j] = (int)(Math.random() * (10 + 1)); // add random integer from 0-10 to hours array
                }
            }

            // print array
            System.out.print("\t\tMon\tTue\tWed\tThu\tFri\tSat\tSun\n"); // print day of week
            for (int i = 0; i < hours.length; i++)
            {
                System.out.print("Employee" + (i + 1) + "\t "); // print employee
                for (int j = 0; j < hours[i].length; j++)
                {
                    System.out.print(hours[i][j] + "\t "); // print hours
                }
                System.out.println();
            }

            // call addHours() to print sum of weekly hours per employee
            addHours(hours);

            // prompt user to re-run program
            Scanner input = new Scanner(System.in);
            System.out.print("\nWould you like to re-run program(Y/N)? "); // print prompt for user to re-run program
            again = input.next();
            System.out.println();
        }
    }

    public static void addHours(int[][] hours) // program addHours method
    {
        System.out.printf("\nEmployee#\tWeekly Hours\n"); // print header text
        System.out.printf("----------------------------\n"); // print header line
        for (int row = 0; row < hours.length; row++)
        {
            int sum = 0;
            for (int column = 0; column < hours[row].length; column++)
            {
                sum += hours[row][column]; // sum hours
            }
            System.out.printf("%4d\t\t%6d\n", row + 1, sum); // print employee # and sum of hours
        }
    }
}
