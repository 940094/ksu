// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 2
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class PhoneBill
{
  public static void main(String[] args) // program main method
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your account number (e.g. 12345): "); // prompt user for account number
    int accountNumber = input.nextInt();
    System.out.print("Please enter your account type (r/p): "); // prompt user for account type
    char accountType = input.next().charAt(0);

    if (accountType == 'p' || accountType == 'P') // if premium account type
    {
      System.out.print("Please enter your daytime minutes (between 6:00AM to 6:00PM): "); // prompt user for daytime minutes
      int daytimeMinutes = input.nextInt();
      System.out.print("Please enter your nighttime minutes (between 6:00PM to 6:00AM): "); // prompt user for nighttime minutes
      int nighttimeMinutes = input.nextInt();

      int totalMinutes = daytimeMinutes + nighttimeMinutes; // calculate total minutes
      double amountDue = 25; // declare and initialize amountDue variable as 25

      if (daytimeMinutes > 50)
        amountDue += (daytimeMinutes - 50) * .1; // add cost of daytime minutes to amountDue

      if (nighttimeMinutes > 100)
        amountDue += (nighttimeMinutes - 100) * .1; // add cost of nighttime minutes to amountDue

      System.out.println("Account Number:\t\t" + accountNumber); // print account number
      System.out.println("Service type:\t\t" + "Premium"); // print account, or service, type
      System.out.println("Daytime minutes:\t" + daytimeMinutes); // print daytime minutes
      System.out.println("Nighttime minutes:\t" + nighttimeMinutes); // print nighttime minutes
      System.out.println("Total minutes:\t\t" + totalMinutes); // print total minutes
      System.out.printf("Amount Due:\t\t$%1.2f\n", amountDue); // print amount due, formatted to two decimals
    }
    else // if regular account
    {
      System.out.print("Please enter your total minutes (e.g. 30): "); // prompt user for total minutes
      int totalMinutes = input.nextInt();

      double amountDue = 20; // declare and initialize amountDue variable as 20
      if (totalMinutes > 20)
        amountDue += (totalMinutes - 20) * .1; // add cost of minutes to amountDue variable

      System.out.println("Account Number:\t" + accountNumber); // print account number
      System.out.println("Service type:\t" + "Regular"); // print account, or service, type
      System.out.println("Total minutes:\t" + totalMinutes); // print total minutes
      System.out.printf("Amount Due:\t$%1.2f\n", amountDue); // print amount due
    }
  }
}
