// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 2
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class PalindromeNumber
{
  public static void main(String[] args) // program main method
  {
    Scanner input = new Scanner(System.in); // create Scanner
    System.out.print("Please enter a 5-digit integer value: "); // prompt user for input
    int num = input.nextInt(); // declare and initialize num variable as user input

    if (num < 10_000 || num > 99_999) // check case if user input is less than or greater than 5 digits, assuming number must start with non-zero
    {
      System.out.println("Input value:\t" + num); // print input value
      System.out.println("Judgement:\t" + "Invalid input, must be a 5-digit number."); // print judgement
    }
    else
    {
    int num1 = num % 10; // parse 5th integer in user input
    int num2 = num / 10 % 10; // parse 4th integer in user input
    int num4 = num / 1000 % 10; // parse 2nd integer in user input
    int num5 = num / 10_000; // parse 1st integer in user input

      if (num5 == num1 && num2 == num4) // check if palindrome
      {
        System.out.println("Input value:\t" + num); // print input value
        System.out.println("Judgement:\t" + "Palindrome"); // print judgement
      }
      else
      {
        System.out.println("Input value:\t" + num); // print input value
        System.out.println("Judgement:\t" + "Not Palindrome"); // print judgement
      }
    }
  }
}
