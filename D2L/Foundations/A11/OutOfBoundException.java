// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 11
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class OutOfBoundException
{
    private int index; // declare variable to store user inputted index
    private int[] list = new int[10]; // declare and initialize an array of size 10

    public OutOfBoundException() // default constructor
    {
        setList(); // populate array with random integers from 0 - 100, inclusive
    }

    public OutOfBoundException(String s) // constructor to store values passed by user inputted string
    {
        setList(); // populate array with random integers from 0 - 100, inclusive
        setIndex(s);
    }

    public int[] getList() // getter method to return list array
    {
        return list;
    }

    public void setList() // setter method to initialize array
    {
        for (int i = 0; i < list.length; i++)
        {
            list[i] = (int)(Math.random() * 101); // populate next element in array with random integer from 0 - 100, inclusive
        }
    }

    public int getIndex() // getter method to return index
    {
        return index;
    }

    // setter to initiate s variable as user inputted string
    public void setIndex(String s) throws IndexOutOfBoundsException
    {
        Scanner scan = new Scanner(s);
        if (!scan.hasNextInt())
            throw new IndexOutOfBoundsException("Index out of bounds."); // throw exception if user input is not int
        index = scan.nextInt();
    }

    public int getElement() // method returns element value
    {
        return list[index];
    }

    public static void main(String[] args) // program main method
    {

        Scanner input = new Scanner(System.in);

        String again = "y";
        while(again.equals("Y") || again.equals("y")) // sentinel loop to allow user to re-run program
        {
            // create new OutOfBoundException object
            OutOfBoundException myOutOfBoundException = new OutOfBoundException();

            // prompt user to enter valid index
            System.out.print("Enter valid index between 0 and 9 as an integer: ");
            while (true)
            {
                try
                {
                    myOutOfBoundException.setIndex(input.next()); // call setter method to validate user inputed index
                    System.out.println("The element at index " + myOutOfBoundException.index + " is " + myOutOfBoundException.getElement()); // print index and element at index
                    break;
                }
                catch (IndexOutOfBoundsException e)
                {
                    input = new Scanner(System.in);
                    System.out.print("Index out of bound, re-enter a valid index as an integer: "); // prompt user to re-enter index
                    continue;
                }
            }

            // prompt user to re-run program
            input = new Scanner(System.in);
            System.out.print("Do you want to re-run program (Y/N)? ");
            again = input.next();
            System.out.println();
        }
    }
}
