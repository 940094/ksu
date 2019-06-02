// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 1
// IDE: Atom

import java.util.Scanner; //import scanner class

public class HelloWorld // change class from "Hello World" to "Hello" to match file name
{
  public static void main(String args[]) // program main method
  {
    Scanner s = new Scanner(System.in);

    System.out.print("Please enter your name: "); // prompt user for input
    String name = s.nextLine(); // read user input

    System.out.println("Hello " + name + "!"); // print out your message
  }
}
