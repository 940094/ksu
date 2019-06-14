// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 3
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class ReverseString_Justin_Shaw
{
    public static void main(String[] args) // program main method
    {
        char again = 'y';
        while (again == 'y' || again == 'Y') // continuously reverse inputted string
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: "); // prompt user to enter a string
            String forward = input.nextLine();
            int strlen = forward.length(); // declare and initiate string length
            Stack_Justin_Shaw<String> myList = new Stack_Justin_Shaw<String>(); // create a Stack class

            System.out.println("\nInput String:\t\t" + forward); // print forward string

            char ch;
            int i = 0; int j = 0; // declare and initialize two pointers to point to start and end of each word
            while (j < strlen) // iterate through the string and add word to stack
            {
                ch = forward.charAt(j);
                if (j == strlen - 1) // edge case: add last word to stack
                {
                    myList.push(forward.substring(i,j+1)); // add substring to stack
                }
                else if (ch == ' ') // general case: add word to stack
                {
                    myList.push(forward.substring(i,j)); // add substring to stack
                    i = j + 1; // initialize i at start of new word
                }
                j++;
            }

            // iterate through the stack and pop off last word and print in reverse order
            System.out.print("Reversed String:\t");
            while (!myList.isEmpty())
            {
                System.out.print(myList.top() + " "); // print reverse string one word at a time
                myList.pop(); // remove printed word
            }
            System.out.println();

            // prompt user to enter another string
            System.out.print("Would you like to enter another string (Y/N)? ");
            again = input.next().charAt(0);
        }
    }
}
