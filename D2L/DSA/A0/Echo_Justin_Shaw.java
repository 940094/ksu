// Name: Justin Shaw
// Class: CS 5040
// Term: Summer 2019
// Instructor: Dr. Haddad
// Assignment: 0
// IDE: Atom

// Program Echo.java
// Demonstrate reading a string input from the user.
import java.util.Scanner;

public class Echo_Justin_Shaw
{
 // Reads a character string from the user and prints it.
 public static void main (String[] args)
 {
   String message;
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter a line of text:");
   message = scan.nextLine();
   System.out.println ("You entered: \"" + message + "\"");
 }
}
