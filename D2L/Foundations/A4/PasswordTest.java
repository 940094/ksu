// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 4
// IDE: Atom

import java.util.Scanner;

public class PasswordTest
{
    public static void main(String[] args) // program main method
    {
        char again = 'y'; // declare and initialize loop control as true, or 'y'

        // continuously prompt user to enter password and then validate
        while (again == 'y')
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Your password must have at least one uppercase, lowercase, digit, one non-digit/non-character, and be at least 8 characters."); // print password requirements
            System.out.print("Please Enter Password:\t"); // prompt user to enter password
            String password = input.nextLine();
            int strlen = password.length(); // declare and initialize length of password
            boolean validLower, validUpper, validDigit, validNotDigitNOrLetter; // declare validators
            validLower = validUpper = validDigit = validNotDigitNOrLetter = false; // initialize validator variables as false

            // itereate through the inputted string to validate password, character-by-character
            for (int i = 0; i < strlen; i++)
            {
                char ch = password.charAt(i);
                if (ch >= 'A' && ch <= 'Z') validUpper = true; // change validUpper from false to true if there is an uppercase letter
                else if (ch >= 'a' && ch <= 'z') validLower = true; // change validLower from false to true if there is a lowercase letter
                else if (Character.isDigit(ch)) validDigit = true; // change validDigit from false to true if there is a digit
                else validNotDigitNOrLetter = true; // change variable from false to true if there is no digit or letter
            }

            // print inputted password and whether or not its valid
            System.out.println();
            System.out.println("Entered Password:\t" + password); // print inputted password
            if (validLower == true && validUpper == true && validDigit == true && validNotDigitNOrLetter == true && strlen >=8)
                System.out.println("Verdict:\t\tValid Password"); // print verdict as valid password
            else
                System.out.println("Verdict:\t\tInvalid Password"); // print verdict as invalid password
            System.out.println();

            // prompt user to try another password
            System.out.print("Try another password (y/n)? "); // prompt user to try another password
            again = input.next().charAt(0); // set the again variable to inputted response to (y/n)
        }
    }
}
