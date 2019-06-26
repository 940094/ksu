// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class KeyPad
{
    public static void main(String[] args) // program main method
    {
        String again = "y";
        while (again.equals("y") || again.equals("Y")) // sentinel loop
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter phone number: "); // prompt user for phone number
            String oldNumber = input.nextLine();
            String newNumber = ""; // declare and initialize new number as an empty String

            for (int i = 0; i < oldNumber.length(); i++) // create the new number by iterating through each character of the old number
            {
                char ch = oldNumber.charAt(i); // set current character
                if (Character.isLetter(ch)) // check if character is a letter
                    newNumber += getNumber(Character.toUpperCase(ch)); // add number equivalent of current character to new number
                else
                    newNumber += ch; // add current character to new number
            }

            System.out.println("You entered:\t" + oldNumber); // print old number
            System.out.println("Phone number:\t" + newNumber); // print new number

            System.out.print("Enter another number (Y/N)? "); // prompt user to run another number
            again = input.nextLine();
            System.out.println();
        }
    }
    public static int getNumber(char uppercaseLetter) // convert uppercase character to its corresponding integer
    {
        if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C') // return 2 if letter is between A and C
            return 2;
        else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F') // return 3 if letter is between D and F
            return 3;
        else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I') // return 4 if letter is between G and I
            return 4;
        else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L') // return 5 if letter is between J and L
            return 5;
        else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O') // return 6 if letter is between M and O
            return 6;
        else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S') // return 7 if letter is between P and S
            return 7;
        else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V') // return 8 if letter is between T and V
            return 8;
        else // else return 9
            return 9;
    }
}
