// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 1
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class SumDigits
{
  public static void main(String[] args) // program main method
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter a 4-digit number: "); // prompt user for input
    int num = input.nextInt(); // read user input

    int sum = 0; // declare and initialize sum variable
    sum += num % 10; // add the last digit to sum
    sum += num / 10 % 10; // add the second to last digit to sum
    sum += num / 100 % 10; // add the second digit to sum
    sum += num / 1000; // add the first digit to sum

    System.out.println("The input number is:\t" + num); // print out your message
    System.out.println("The sum of digits is:\t" + sum); // print out your message

  }
}
