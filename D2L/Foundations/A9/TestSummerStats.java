// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 9
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class TestSummerStats
{
    public static void main(String[] args) // program main method
    {
        String again = "y";
        while (again.equals("y") || again.equals("Y")) // sentinel loop to allow user to re-run program
        {
            Scanner input = new Scanner(System.in);

            // read user input for number of employees
            System.out.print("Please enter an integer for number of employees (e.g., 3): "); // prompt user for number of employees
            int employees = input.nextInt();
            while (employees < 1)
            {
                System.out.print("Please enter a positive integer for the number of employees (e.g. 3): "); // re-prompt user for number of employees
                employees = input.nextInt();
            }

            // read user input for number of years
            System.out.print("Please enter an integer for number of years (e.g., 3): "); // prompt user for number of years
            int years = input.nextInt();
            while (years < 1)
            {
                System.out.print("Please enter a positive integer for the number of years (e.g. 3): "); // re-prompt user for number of years
                years = input.nextInt();
            }

            SummerStats mySalaries = new SummerStats(employees, years); // declare and initialize mySalaries object of SummerStats Class with employees and years variables

            System.out.println("\nEmployee Data:\n"); // print employee data headline
            mySalaries.printSalaries(); // call printSalaries method to print users salaries

            System.out.println("Employee" + (mySalaries.mostMoney() + 1) + " made most money over the years."); // print employee who made the most money

            System.out.println("Highest salary was made in Year" + (mySalaries.highestSalaryYear() + 1) + "."); // print highest salary year

            // alow user to check an employees earnings
            System.out.print("\nPlease enter an integer representing the index of an employee to return his or her total earnings (e.g. 1): "); // prompt user for employee index
            int employee = input.nextInt();
            while (employee < 0 || employee >= employees)
            {
                System.out.print("Please enter a non-negative integer representing an employee index between 0-" + (employees - 1) + ": "); // re-prompt user for employee index
                employee = input.nextInt();
            }
            System.out.println("Total earning by Employee" + (employee + 1) + " is $" + mySalaries.totalEarnings(employee) + "."); // print total earning by user inputted employee

            System.out.println("\nTotal earning by all Employees is $" + mySalaries.allEarnings() + "."); // print total earnings by all employees

            // allow user to print highest salart employee for a user inputted year
            System.out.print("\nPlease enter an integer representing the index of a year to return the highest salary employee for that year (e.g. 1): "); // prompt user to enter a year index
            int year = input.nextInt();
            while (year < 0 || year >= years)
            {
                System.out.printf("Please enter a non-negative integer representing a year index between 0-%d: ", (years-1)); // re-prompt user to enter a year index
                year = input.nextInt();
            }
            System.out.println("In year" + (year + 1) + ", Employee" + (mySalaries.highestSalaryPerson(year) + 1) + " has the highest salary."); // print highest salary employee

            // print average salary for each year
            System.out.println("The average salary for year:"); // print the average salary header
            double[] tempList = mySalaries.averageSalaryEachYear(); // decalre and initialize a list of the average salary for each year
            System.out.print("\n\t");
            for (int i = 0; i < tempList.length; i++)
            {
                System.out.print("Year" + (i+1) + "\t\t"); // print the year header
            }
            System.out.print("\n\t");
            for (int i = 1; i < tempList.length; i++)
            {
                System.out.print("----------------"); // print the line header
            }
            System.out.print("---------\n\t");
            for (int i = 0; i < tempList.length; i++)
            {
                System.out.printf("$%1.2f\t", tempList[i]); // print the averge salary for each year from the tempList
            }
            System.out.println();

            //prompt user to re-run program
            System.out.print("Do you want to re-run program (Y/N)? "); // print prompt for user to re-run program
            again = input.next();
            System.out.println();
        }
    }
}
