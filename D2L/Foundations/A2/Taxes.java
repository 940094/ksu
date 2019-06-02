// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 2
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class Taxes
{
  public static void main(String[] args) // program main method
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Please Enter Your Annual Income (rounded to the nearest dollar): "); // prompt user to enter income
    int income = input.nextInt(); // read users input and assign to the income variable
    int taxBracket; // declare taxBracket variable

    if (income <= 30_000) // determine users tax bracket as 3% if income is less than 30,000
      taxBracket = 3;
    else if (income > 30_000 && income <= 70_000) // determine users tax bracket
      taxBracket = 10;
    else if (income > 70_000 && income <= 150_000) // determine users tax bracket
      taxBracket = 15;
    else if (income > 150_000 && income <= 300_000) // determine users tax bracket
      taxBracket = 20;
    else if (income > 300_000 && income <= 900_000) // determine users tax bracket
      taxBracket = 35;
    else // determine users tax bracket
      taxBracket = 40;

    int taxAmount = income * taxBracket / 100; // calculate the users tax amount

    System.out.println("Your income:\t\t$" + income); // print income
    System.out.println("Your tax bracket:\t" + taxBracket + "%"); // print tax bracket
    System.out.println("Your tax amount:\t$" + taxAmount); // print tax amount
  }
}
