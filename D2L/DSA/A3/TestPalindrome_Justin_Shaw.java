// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 3
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class TestPalindrome_Justin_Shaw
{
    public static void main(String[] args) // program main method
    {
        char again = 'y';
        while (again == 'y' || again == 'Y') // continuously prompt user for string to test for palindrome
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string:\t"); // prompt user for string
            String s = input.nextLine();
            String reverse = "";
            Stack_Justin_Shaw<Character> myList = new Stack_Justin_Shaw<Character>(); // create Stack_Justin_Shaw class

            // add each character to the stack
            for (int i = 0; i < s.length(); i++)
            {
                myList.push(s.charAt(i)); // add character to stack
            }

            // remove each character from the stack and add to the reverse string
            for (int i = 0; i < s.length(); i++)
            {
                reverse += myList.top(); // add the character at the top of the stack to the reverse string
                myList.pop(); // remove character at the top of the stack
            }

            // print user output
            System.out.println("\nInput String:\t" + s); // print input string
            System.out.print("Judgment:\t");
            if (s.toUpperCase().equals(reverse.toUpperCase())) System.out.println("Palindrome"); // validate if palidrome
            else System.out.println("Not Palindrome");

            // re-prompt user to enter another string
            System.out.print("Do you want to re-run with different inputs (Y/N)? ");
            again = input.next().charAt(0);
        }
    }
}
