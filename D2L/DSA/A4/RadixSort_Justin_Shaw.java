// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class RadixSort_Justin_Shaw
{
    private static Queue_Justin_Shaw<Integer>[] queues; // declare and array of queues

    public static void main(String[] args) // program main method
    {
        String again = "y";
        while (again.equals("Y") || again.equals("y"))
        {
            // declare and initialize an array inputs of size 6
            int[] inputs = new int[6];

            // validate input for positive integers since p. 882 of book assumes keys are positive integers
            boolean allPositive = false;
            while (allPositive == false)
            {
                allPositive = true;
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter 6 non-negative integers (e.g. 1 2 3 4 5 6): ");
                for (int i = 0; i < inputs.length; i++)
                {
                     inputs[i] = input.nextInt();
                     if (inputs[i] < 0)
                     {
                         allPositive = false;
                         break;
                     }
                }
            }


            // print unsorted integers from array
            System.out.print("Inputs array before sorting:\t");
            for (int i = 0; i < inputs.length; i++)
            {
                if (i < inputs.length - 1)
                    System.out.print(inputs[i] + ", ");
                else
                    System.out.println(inputs[i]);
            }

            // find max integer to know how many times to repeat the sort of adding to queue and emptying queue
            int longestInt = 0;
            int currentLengthOfInt;
            for (int i = 0; i < inputs.length; i++)
            {
                currentLengthOfInt = DigitCount(inputs[i]);
                if (currentLengthOfInt > longestInt)
                {
                    longestInt = currentLengthOfInt;
                }
            }


            // create an array of queues
            queues = new Queue_Justin_Shaw[10];
            for (int i = 0; i < 10; i++)
                queues[i] = new Queue_Justin_Shaw<Integer>();

            // sort array
            for (int phase = 1; phase <= longestInt; phase++)
            {
                // add to queue based on digit
                for (int i = 0; i < inputs.length; i++)
                {
                    int num = inputs[i];
                    int digit = ExtractDigit(phase, inputs[i]); // call ExtractDigit to return current digit being evaluated
                    queues[digit].enqueue(num);
                }
                // empty queue back to list from bucket0 to bucket9
                int count = 0;
                for (int i = 0; i < queues.length; i++)
                {
                    while (!queues[i].isEmpty() && count < 6)
                    {
                        inputs[count] = queues[i].dequeue(); // add to array from stack
                        count++;
                    }
                }
            }

            // print sorted integers from array
            System.out.print("Inputs array after sorting:\t");
            for (int i = 0; i < inputs.length; i++)
            {
                if (i < inputs.length - 1)
                    System.out.print(inputs[i] + ", ");
                else
                    System.out.println(inputs[i]);
            }

            // prompt user to re-run program
            Scanner input = new Scanner(System.in);
            System.out.print("\nDo you want to re-run the program (Y/N)? ");
            again = input.next();
            System.out.println();
        }
    }

    public static int ExtractDigit(int position, int largestValue) // program to return a digit from an integer given the current position
    {
        int digit;
        digit = (int)(largestValue % Math.pow(10, position)) / (int) Math.pow(10, position - 1); // calculate digit froma a number given a position and a number
        return digit;
    }

    public static int DigitCount(int num) // program to return the count of how many digits are in a number
    {
            int count = 0;
            while (num > 1)
            {
                num /= 10;
                count ++;
            }
            return count;
    }
}
