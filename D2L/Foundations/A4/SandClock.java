// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: Atom

public class SandClock
{
    public static void main(String[] args) // program main method
    {
        // print upper half of sandclock
        for (int i = 1; i < 6; i++)
        {
            for (int k = 1; k < i; k++)
                System.out.print("  "); // print spaces for each line

            for (int j = 11; j - i * 2 >= 1; j --)
                System.out.print(" *"); // print * for each line
            System.out.println(); // print new line
        }

        // print lower half of sandclock
        for (int i = 4; i >= 1; i--)
        {
            for (int k = 1; k < i; k++)
                System.out.print("  "); // print spaces for each line

            for (int j = 11; j - i * 2 >= 1; j --)
                System.out.print(" *"); // print * for each line
            System.out.println(); // print new line
        }

    }
}
