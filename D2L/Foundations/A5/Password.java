// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class Password
{
    public static void main(String[] args) // program main method
    {
        Scanner input = new Scanner(System.in);

        String again = "y"; // declare and initialize sentinel variable
        while (again.equals("y") || again.equals("Y")) // sentinel loop
        {
            System.out.print("Enter a password: "); // prompt user to enter a password
            String password = input.nextLine();

            String judgment; // declare variable judgment
            if (CheckPassword(password)) // call CheckPassword to check if password is valid
                judgment = "Valid Password"; // set judgment to valid
            else
                judgment = "Invalid Password"; // set judgment to invalid

            System.out.println("Entered password:\t" + password); // print entered password
            System.out.println("Judgment:\t\t" + judgment); // print judgment

            System.out.print("\nDo you want to check another password (Y/N)? "); // prompt user to run program again
            again = input.nextLine();
            System.out.println();
        }
    }
    public static boolean CheckPassword(String password) // checks if password is valid
    {
        if (atLeastEightChars(password) && onlyLettersAndNumbers(password) && atLeastThreeDigits(password) && atLeastTwoLowerCaseLetters(password))
            return true; // if a valid password, then return true
        return false;
    }
    public static boolean atLeastEightChars(String password) // checks if password includes at least 8 characters
    {
        if (password.length() >= 8)
            return true;
        return false;
    }
    public static boolean onlyLettersAndNumbers(String password) // checks if password contains only letters and digits
    {
        for (int i = 0; i < password.length(); i++) // iterate through each character in the password string
        {
            char ch = password.charAt(i); // delcare and initialize current character
            if (!Character.isLetterOrDigit(ch)) // if current character is not a letter or digit, then return false
                return false;
        }
        return true;
    }
    public static boolean atLeastThreeDigits(String password) // checks if password includes at least 3 digits
    {
        int counter = 0; // initialize counter
        for (int i = 0; i < password.length(); i++) // loop through every character in password
        {
            char ch = password.charAt(i); // declare and initialize current character
            if (Character.isDigit(ch)) counter++; // if character is digit, then increment counter
            if (counter >= 3) return true; // if counter is greather than or equal to 3 return true
        }
        return false;
    }
    public static boolean atLeastTwoLowerCaseLetters(String password) // checks if password includes at least 2 lower-case letters
    {
        int counter = 0; // initialize counter
        for (int i = 0; i < password.length(); i++) // loop through each character in password
        {
            char ch = password.charAt(i); // declare and initialize current character
            if (Character.isLowerCase(ch)) counter++; // if character is lower case, then increment counter
            if (counter >= 2) return true; // if counter is greather than or equal to 2, then return true
        }
        return false;
    }
}
