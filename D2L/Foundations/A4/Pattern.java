// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: Atom

public class Pattern
{
    public static void main(String[] args) // program main method
    {
        int blank = 0; // declare and initialize variable to count blank spaces

        // print 6 lines
        for (int i = 6; i >= 1; i--)
        {
            // print blanks in front of each line of numbers
            for (int k = 0; k < blank; k++)
                System.out.print("  "); // print blank

            // print numbers for each line after blanks
            for (int j = 1; j <= i; j++)
                System.out.print(j + " "); // print number
            System.out.println();
            blank++; // increment the number of blank spaces
        }
    }
}
