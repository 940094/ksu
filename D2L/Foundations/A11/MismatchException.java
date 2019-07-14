// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 11
// IDE: Atom

import java.util.*; // import java.util Classes

public class MismatchException
{
    private String s; // declare String variable to store user inputted variables

    public MismatchException() // create default constructor
    {
    }

    public MismatchException(String s) // create constructore that sets s value
    {
        setS(s);
    }

    public String getS() // getter method to return String variable s, which is user inputted String
    {
        return s;
    }

    // setter to initiate s variable as user inputted string
    public void setS(String s) throws InputMismatchException
    {
        Scanner scan = new Scanner(s); // declare and initialize new scanner object
        int count = 0;

        // iterate through scanner string while count is less than 4
        while (count < 4)
        {
            if (scan.hasNextInt())
            {
                int num = scan.nextInt(); // declare and initialize num as nextInt();
                if (num > 100 || num < 0)
                    throw new InputMismatchException("Number must be between 0 and 100."); // throw error is user inputted integer is not 0-100
                count++;
            }
            else
                throw new InputMismatchException("Mismatch Error."); // throw error is user did not put in 4 ints
        }

        this.s = s;
    }

    public double getAverage() // method to calculate and return average of user inputted variables
    {
        Scanner scan = new Scanner(s); // declare and initialize new scanner object
        int sum = 0;

        for (int i = 0; i < 4; i++)
            sum += scan.nextInt(); // add next int to sum

        return sum / 4.0;
    }

    // method to printString with commas
    public void printString()
    {
        Scanner scan = new Scanner(s);
        int count = 0;
        while (scan.hasNextInt() && count < 4) // iterate through string and print nextInt
        {
            System.out.print(scan.nextInt()); // print next integer
            if (count < 3) System.out.print(", "); // print commas
            count++; // increment counter
        }
    }

    public static void main(String[] args) // program main method
    {
        String again = "y";
        while(again.equals("y") || again.equals("Y")) // sentinel loop to allow user to re-run program
        {
            MismatchException myMismatchException = new MismatchException(); // create new MismatchException object

            System.out.print("Enter four grades as integers between 0 and 100: ");// prompt user to enter grades

            // validate user inputted string of numbers
            while(true)
            {
                // read user input as a string
                Scanner input = new Scanner(System.in);
                String s = input.nextLine();

                // calculate average of 4 grades after validating user input
                try
                {
                    myMismatchException.setS(s); // call setS getter method to validate user input and calculate average
                    System.out.print("Entered grades are:\t");
                    myMismatchException.printString(); // print the user inputted grades
                    System.out.printf("\nStudent Average:\t%1.2f\n", myMismatchException.getAverage()); // print student average
                    break;
                }
                catch (InputMismatchException ex)
                {
                    System.out.print("Incorrect input, re-enter valid grades: "); // prompt user to re-enter valid input
                    continue;
                }
            }

            // prompt user to re-run program
            Scanner input = new Scanner(System.in);
            System.out.print("Do you want to re-run program (Y/N)? ");
            again = input.next();
            System.out.println();
        }
    }
}
