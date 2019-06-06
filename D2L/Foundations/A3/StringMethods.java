// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 3
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class StringMethods
{
  public static void main(String[] args) // program main method
  {
    // Read User Input
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a string: "); // read user input
    String string1 = input.nextLine();
    System.out.print("Please enter a second string: "); // read user input
    String string2 = input.nextLine();

    // Part A: print length of string1
    System.out.println("a) Length of String 1:\t" + string1.length() + " characters");

    // Part B: print length of string2
    System.out.println("b) Length of String 2:\t" + string2.length() + " characters");

    // Part C: Concatenate both strings, separated by space and print the result
    System.out.println("c) Concatenation:\t" + string1 + " " + string2);

    // Part D: Check if the two strings have same set of characters with regard to case (i.e., equal).
    if (string1.equals(string2))
      System.out.println("d) Equal Strings?\t" + "Equal"); // print equal
    else
      System.out.println("d) Equal Strings?\t" + "Not equal"); // print not equal

    // Part E: Convert string1 to upper case and print the result
    System.out.println("e) Uppercase String 1:\t" + string1.toUpperCase());

    // Part F: Convert string2 to lower case and print the result
    System.out.println("f) Lowercase String 2:\t" + string2.toLowerCase());

    // Part G: Extract a valid sub-string of multiple characters from string1 and print the result
    System.out.println("g) Valid substring:\t" + string1.substring(1, 3));
  }
}
