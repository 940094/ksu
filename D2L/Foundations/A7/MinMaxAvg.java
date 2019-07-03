// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 7
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class MinMaxAvg
{
    public static void main(String[] args) // program main method
    {
        String again = "y";
        while (again.equals("y") || again.equals("Y")) // sentinel loop to allow user to re-run program
        {
            int[][] grades = new int[4][4]; // declare and initialize grades variable as 4x4 matrix of integers

            // fill grades array with random integers from 0 to 100
            for (int i = 0; i < grades.length; i++)
            {
                for (int j = 0; j < grades[i].length; j++)
                {
                    grades[i][j] = (int)(Math.random() * (100 + 1)); // fill grades matrix with random integers 0-100
                }
            }

            // print grades array
            System.out.println("Grades:"); // print Grades header
            for (int i = 0; i < grades.length; i++)
            {
                System.out.print("\t");
                for (int j = 0; j < grades[i].length; j++)
                {
                    System.out.print(grades[i][j] + "\t"); // print current grades variable
                }
                System.out.println();
            }

            // call minMaxAvg() to print highest, lowest, and average grade
            minMaxAvg(grades);

            // prompt user to re-run program
            Scanner input = new Scanner(System.in);
            System.out.print("\nDo you want to re-run the program(Y/N)? "); // print prompt for user to re-run program
            again = input.next();
            System.out.println();
        }
    }
    public static void minMaxAvg(int[][] grades) // program mainMaxAvg method
    {
        int highest = grades[0][0]; // declare and initialize highest variable as the first integer in the grades array
        int lowest = grades[0][0]; // declare and initialize lowest variable as the first integer in the grades array
        int sum = 0; // declare and initialize the sum variable as zero

        // determine highest grade, lowest grade, and sum of all grades
        for (int i = 0; i < grades.length; i++)
        {
            for (int j = 0; j < grades[i].length; j++)
            {
                if (grades[i][j] > highest)
                    highest = grades[i][j]; // set highest variable to current variable in grades
                if (grades[i][j] < lowest)
                    lowest = grades[i][j]; // set lowest variable to current variable in grades
                sum += grades[i][j]; // add current variable in grades to current value of sum
            }
        }

        // print highest grade, lowest grade, and average of all grades
        System.out.println("\nHighest grade:\t" + highest); // print highest grade
        System.out.println("Lowest grade:\t" + lowest); // print lowest grade
        System.out.printf("Class average:\t%2.2f", (sum/16.0)); // print class average
    }
}
