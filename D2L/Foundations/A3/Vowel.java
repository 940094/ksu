// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 3
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class Vowel
{
  public static void main(String[] args) // program main method
  {
    // prompt user for a letter
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a letter: "); // prompt user for a letter
    String s = input.nextLine();
    char letter = s.charAt(0); // declare and initialize character variable letter with the user inputted character
    System.out.println("You entered " + letter); // print letter

    char lowercaseLetter = Character.toLowerCase(letter); // declare and initialize variable to store inputted letter as lowercase

    // check if user inputted character is a vowel, consonant, or neither
    if (lowercaseLetter == 'a' || lowercaseLetter == 'e' || lowercaseLetter == 'i' || lowercaseLetter == 'o' || lowercaseLetter == 'u' )
      System.out.println(letter + " is a vowel"); // print vowel
    else if (lowercaseLetter <= 'z' && lowercaseLetter >= 'a')
      System.out.println(letter + " is a consonant"); // print consontant
    else
      System.out.println(letter + " is invalid input"); // print invalid input
  }
}
