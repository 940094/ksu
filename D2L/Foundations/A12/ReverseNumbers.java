// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 12
// IDE: Atom

import java.util.*;

public class ReverseNumbers
{
    private int[] numbers = new int[5]; // declare and initialize numbers variable to array of 5 ints
    private final int LAST_INDEX = 4; // declare and initialize lastIndex variable to 4, which is index of last variable

    protected ReverseNumbers() // donstruct default ReverseNumbers object
    {
    }

    public int[] getNumbers() // getter method for numbers array
    {
        return numbers;
    }

    // setter method for numbers array
    public void setNumbers(String s) throws InputMismatchException
    {
        Scanner scan = new Scanner(s);
        int count = 0;
        while(scan.hasNextInt() && count < 5) // iterate while the string has a next value
        {
            int num = scan.nextInt();
            if (num <= 0)
                throw new InputMismatchException("Numbers must be positive."); // throw exception if inputted num is less than or equal to zero
            else
                numbers[count] = num;
            count++;
        }
        if (count < 5)
            throw new InputMismatchException("Must input 5 numbers."); // throw exception is count is less than 4 user inputted integers
    }

    // method Reverse calls the helper Reverse method to print the reverse of ints in the array
    public void reverse(int[] numbers)
    {
        reverse(numbers, numbers[0], 0);
    }

    // helper method Reverse recursively reverses the numbers array
    private void reverse(int[] numbers, int num, int index)
    {
        if (num == 0)
        {
            System.out.print(" ");
            if (index != numbers.length -1)
                reverse(numbers, numbers[index + 1], index + 1); // call reverse method changing num to next element in array and incrementing index
        }
        else
        {
            System.out.print(num % 10); // print last digit in num, which is the element at current index in numbers arrays
            reverse(numbers, num / 10, index); // call reverse method removing last digit from num
        }
    }

    // method prints user inputted numbers
    public void printNumbers()
    {
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " "); // print next element in numbers array
        }
        System.out.println();
    }

    public static void main(String[] args) // program main method
    {
        String again = "y";
        while(again.equals("Y") || again.equals("y")) // sentinel loop to prompt user to re-run program
        {
            // declare and initialize myReverseNumbers variable as a ReverseNumbers object
            ReverseNumbers myReverseNumbers = new ReverseNumbers();

            // validate user inputted array of 5 integers to ensure it's positive
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter 5 positive integers (e.g. 1 2 3 4 5): "); // prompt user to enter 5 positibe integers
            while (true)
            {
                try
                {
                    myReverseNumbers.setNumbers(input.nextLine()); // call setNumbers method on myReverseNumbers object to verify user input
                    break;
                }
                catch (InputMismatchException e)
                {
                    System.out.print("Please re-enter 5 positive integers (e.g. 1 2 3 4 5): "); // re-prompt user to enter 5 positive integers
                    continue;
                }
            }

            // print entered numbers
            System.out.print("Entered Numbers:\t");
            myReverseNumbers.printNumbers();

            // print reversed numbers
            System.out.print("Reversed Numbers:\t");
            myReverseNumbers.reverse(myReverseNumbers.getNumbers());

            // prompt user to re-run program
            System.out.print("\nDo you want to re-run program(Y/N)? ");
            again = input.next();
            System.out.println();
        }
    }
}
