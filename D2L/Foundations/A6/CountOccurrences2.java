// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 6
// IDE: Atom

import java.util.Scanner; // import Scanner class
import java.util.Arrays; // import Arrays class

public class CountOccurrences2
{
    public static void main(String[] args) // program main method
    {
        Scanner input = new Scanner(System.in);

        String again = "Y";
        while (again.equals("Y") || again.equals("y")) // use sentinel loop to prompt user to re-run program
        {
            // prompt userto create an array of up to 10 integers
            int[] list = new int[10]; // declare and initialize array
            System.out.print("Entered up to 10 integers between 1 and 100 (0 to stop): "); // prompt user to enter integers
            int num = input.nextInt();
            System.out.println();
            int index = 0; // declare and initalize index to zero
            while(num != 0 && index < 10)// while num is not zero && count <= 10;
            {
                if (num <= 100 & num >= 1) //if between 1 - 100 count; 0 to stop
                {
                    list[index] = num; // set list at index equal to next inputted num
                    index++;
                }
                num = input.nextInt();
            }

            // print occurences of each unique integer in the array
            Count(list);

            // prompt user to enter another string
            System.out.print("\nDo you want to enter another string (Y/N)? "); // print prompt
            again = input.next();
            System.out.println();
        }
    }
    public static void Count(int[] list) // count occurences of each unique integer in the array
    {
        int[] countList = new int[100]; // declare and initialize array of integers of size 100 to count occurence of each value in the passed list
        int[] printedList = new int[10]; // declare and initialize array of integers of size 10 to track which values in the passed list have been printed

        for (int i = 0; i < list.length; i++) // iterate over user inputted array and increment counter array for each number
        {
            int currentNum = list[i]; // declare and initialize current number variable to next number in list
            countList[currentNum] += 1; // increment value at corresponding index of count list variable
        }

        for (int i = 0; i < list.length; i++) // iterate over user inputted array and print corresponding count from the counter array
        {
            int currentNum = list[i];
            if (countList[currentNum] != 0 && currentNum != 0)
            {
                if (countList[currentNum] == 1)
                    System.out.println(currentNum + " occured\t" + countList[currentNum] + " time"); // print occurences
                else
                    System.out.println(currentNum + " occured\t" + countList[currentNum] + " times"); // print occurences
                countList[currentNum] = 0;
            }
        }
    }
    public static int linearSearch(int[] printedList, int key) // check if number is already in an array
    {
        for (int i = 0; i < printedList.length; i++)
        {
            if (key == printedList[i]) // return the index if the key is in the array
                return i;
        }
        return -1; // return -1 if the key is not in the list
    }
}
