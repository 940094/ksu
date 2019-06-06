// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 3
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class Payroll
{
  public static void main(String[] args) // program main method
  {
    //prompt user for input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter employee’s name: "); // prompt user for employee name
    String employeeName = input.nextLine();
    System.out.print("Enter weekly hours worked: "); // prompt user for hours worked
    double weeklyHours = input.nextDouble();
    System.out.print("Enter hourly pay rate: "); // prompt user for hourly pay rate
    double hourlyPayRate = input.nextDouble();
    System.out.print("Enter federal tax rate: "); // prompt user for federal tax rate
    double federalTaxRate = input.nextDouble();
    System.out.print("Enter state tax rate: "); // prompt user for state tax rate
    double stateTaxRate = input.nextDouble();

    // calculations
    double grossWeeklyPay = weeklyHours * hourlyPayRate; // calculate gross weekly pay
    double federalWithholding = grossWeeklyPay * federalTaxRate; // calculate federal witholding
    double stateWithholding = grossWeeklyPay * stateTaxRate; // calculate state withholding
    double netPay = grossWeeklyPay - federalWithholding - stateWithholding; // calculate net pay

    // print results
    System.out.println("\nPayroll statement"); // print header
    System.out.println("================="); // print header
    System.out.println("Employee Name:\t\t" + employeeName); // print employee name
    System.out.println("Hours Worked:\t\t" + (int)weeklyHours); // print hours worked
    System.out.printf("Pay Rate (per Hour):\t$%3.2f\n", hourlyPayRate); // print hourly pay rate
    System.out.printf("Gross Weekly Pay:\t$%3.2f\n", grossWeeklyPay); // print gross weekly pay
    System.out.printf("Federal Withholding:\t$%3.2f\n", federalWithholding); // print federal witholding
    System.out.printf("State Withholding:\t$%3.2f\n", stateWithholding); // print state withholding
    System.out.printf("Net Pay:\t\t$%3.0f\n", netPay); // print net pay
  }
}
