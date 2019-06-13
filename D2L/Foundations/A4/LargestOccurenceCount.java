// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: Atom

import java.util.Scanner; // import Java class

public class LargestOccurenceCount
{
    public static void main(String[] args) // program public class
    {
        char again = 'y';
        while (again == 'y')
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter positive integers (0 to quit): "); // prompt user to enter positive numbers
            int num = input.nextInt(); // declare current number as first integer
            int max = num; // declare and initialize max number as current number
            String numbers = num + ""; // declare and initialize string of numbers as current number

            // iterate through each inputted number until 0
            while (num != 0)
            {
                num = input.nextInt();
                if (num > 0)
                {
                    numbers += " " + num; // add current number to string of numbers
                    if (num > max) max = num; // udate max if current number is larger than max
                }
            }

            int count = 0; // declare and initialize a counter to count occurences of max

            // iterate through string of numbers and count each occurance of max
            for (int i = 0; i < numbers.length(); i += 2)
            {
                num = numbers.charAt(i); // set number to current number
                if (num == max + 48) count++; // increment count if num equals max
            }

            // print inputted numbers, max, and occurences
            System.out.println("You entered:\t" + numbers); // print string of numbers
            System.out.println("Largest value:\t" + max); // print max
            System.out.println("Occurences:\t" + count + " times"); // print occurences
            System.out.println();

            // prompt user to re-run program
            System.out.print("Do you want to re-run the program (y/n)? ");
            again = input.next().charAt(0);
        }
    }
}
