// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 7
// IDE: Atom

import java.util.Scanner;

public class MatrixAddition
{
    public static void main(String[] args) // program main method
    {
        String again = "y";
        while (again.equals("Y") || again.equals("y")) // program sentinel loop to allow user to re-run program
        {
            Scanner input = new Scanner(System.in);
            int[][] arr1 = new int[3][3]; // declare and initialize arr1 as 3x3 matrix
            int[][] arr2 = new int[3][3]; // declare and initialize arr2 as 3x3 matrix

            // prompt user to enter 3x3 matrix
            System.out.print("Please enter 9 integers for Matrix A, a 3x3 matrix: "); // print prompt for user to enter 3x3 matrix
            for (int i = 0; i < arr1.length; i++)
            {
                for (int j = 0; j < arr1[i].length; j++)
                {
                    arr1[i][j] = input.nextInt(); // add next user inputted integer to array
                }
            }

            // prompt user to enter another 3x3 matrix
            System.out.print("Please enter 9 integers for Matrix B, a 3x3 matrix: "); // print prompt for suer to enter 3x3 matrix
            for (int i = 0; i < arr2.length; i++)
            {
                for (int j = 0; j < arr2[i].length; j++)
                {
                    arr2[i][j] = input.nextInt(); // add next user inputted integer to array
                }
            }

            // print Matrix A
            System.out.println("\nMatrix A:"); // print matrix A header
            for (int i = 0; i < arr1.length; i++)
            {
                System.out.print("\t");
                for (int j = 0; j < arr1[i].length; j++)
                {
                    System.out.print(arr1[i][j] + "\t"); // print array contents
                }
                System.out.println();
            }

            // print Matrix B
            System.out.println("\nMatrix B:"); // print matrix B header
            for (int i = 0; i < arr2.length; i++)
            {
                System.out.print("\t");
                for (int j = 0; j < arr2[i].length; j++)
                {
                    System.out.print(arr2[i][j] + "\t"); // print array contents
                }
                System.out.println();
            }

            // call add() to add 2 matrices
            add(arr1, arr2);

            // prompt user to re-run program
            System.out.print("Do you want to re-run program (Y/N)? "); // print prompt for user to re-run program
            again = input.next();
            System.out.println();
        }
    }
    public static void add(int[][] arr1, int[][] arr2) // program add method
    {
        System.out.println("\nMatrix A+B:"); // print MatrixA+B header
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.print("\t");
            for (int j = 0; j < arr2[i].length; j++)
            {
                System.out.print((arr1[i][j] + arr2[i][j]) + "\t"); // print sum of arr1 + arr2
            }
            System.out.println();
        }
    }
}
