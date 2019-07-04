// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 9
// IDE: Atom

public class SummerStats
{
    private int[][] salaries; // declare private 2D array reference variable named salaries

    // constructor method to create 2D array of salaries between 5,000-50,000
    public SummerStats(int employees, int years)
    {
        salaries = new int[employees][years]; // initialize salaries as size employees x years
        for (int i = 0; i < salaries.length; i++)
        {
            for (int j = 0; j < salaries[i].length; j++)
            {
                salaries[i][j] = 5_000 + (int)(Math.random() * 45_000); // store random salaries between 5,000-50,000 in cells of array
            }
        }
    }

    // method to return index of employee who made most total money over the years
    public int mostMoney()
    {
        int mostMoneyEarned = 0; // declare and initialize most money earned to 0
        int employeeIndex = -1; // declare and initialize employee index to -1
        int employeeTotalSalary; // declare total salary
        for (int i = 0; i < salaries.length; i++)
        {
            employeeTotalSalary = 0; // initialize total salary to 0
            for(int j = 0; j < salaries[i].length; j++)
            {
                employeeTotalSalary += salaries[i][j]; // sum an employees salary over all years
            }
            if (employeeTotalSalary > mostMoneyEarned)
            {
                mostMoneyEarned = employeeTotalSalary; // set mostMoneyEarned to employee salary
                employeeIndex = i; // set employee index to i
            }
        }
        return employeeIndex; // return employee index
    }

    // method to return index of highest salary year
    public int highestSalaryYear()
    {
        int yearIndex = -1; // declare and initialize variable as -1
        int highestYearSalary = 0; // declare and initialize highest salary as 0
        for (int i = 0; i < salaries.length; i++)
        {
            for (int j = 0; j < salaries[i].length; j++)
            {
                if (salaries[i][j] > highestYearSalary)
                {
                    highestYearSalary = salaries[i][j]; // set highest salary to current salary
                    yearIndex = j; // set yearIndex to current year, j
                }
            }
        }
        return yearIndex; // returns index of highest earning year, not the actual year number
    }

    // method to return total earnings given an employee index
    public int totalEarnings(int rowIndex)
    {
        int totalEarnings = 0; // declare and initialize total earnings to 0
        for(int j = 0; j < salaries[rowIndex].length; j++)
        {
            totalEarnings += salaries[rowIndex][j]; // sum all earnings for each year the inputted employee worked
        }
        return totalEarnings; // return total earnings
    }

    // method to return total earnings for all employees for all years
    public int allEarnings()
    {
        int allEarnings = 0; // declare and initialize all earnings as 0
        for (int i = 0; i < salaries.length; i++)
        {
            for (int j = 0; j < salaries[i].length; j++)
            {
                allEarnings += salaries[i][j]; // sum all salaries for all employees for all years
            }
        }
        return allEarnings; // return all earnings
    }

    // method to return index of highest salary person given a year index
    public int highestSalaryPerson(int columnIndex)
    {
        int salaryOfHighestSalaryPerson = salaries[0][columnIndex]; // declate and initialize salaryOfHighestSalaryPerson as first employee given a year
        int indexOfHighestSalaryPerson = 0; // declare and initialize index as 0
        for (int i = 1; i < salaries.length; i++)
        {
            if (salaries[i][columnIndex] > salaryOfHighestSalaryPerson)
            {
                salaryOfHighestSalaryPerson = salaries[i][columnIndex]; // set salary equal to current salary
                indexOfHighestSalaryPerson = i; // set index equal to i, current employee index
            }
        }
        return indexOfHighestSalaryPerson; // return index of highest salary person for a given year
    }

    // method to return an array of average salaries for each year
    public double[] averageSalaryEachYear()
    {
        double[] averageSalaryEachYear = new double[salaries[0].length]; // declare and initialize averageSalaryEachYear to number of years
        double yearlyAverage; // declare array of averages
        double sum; // declare sum
        for (int column = 0; column < salaries[0].length; column++)
        {
            sum = 0; // initialize sum as 0
            for (int row = 0; row < salaries.length; row++)
            {
                sum += salaries[row][column]; // set sum to sum of all salaries for each year
            }
            yearlyAverage = sum / (salaries.length * 1.0); // calculate average by diving sum by number of years
            averageSalaryEachYear[column] = yearlyAverage; // add yearly average to array of averages
        }

        return averageSalaryEachYear; // return array of average yearly salaries
    }

    // method to print table of salaries
    public void printSalaries()
    {
        for (int i = 1; i <= salaries[0].length; i++)
        {
            System.out.print("\t\tYear" + i); // print year header
        }
        System.out.print("\n\t\t"); // print line header

        for (int i = 1; i < salaries[0].length; i++)
        {
            System.out.print("----------------"); // print rest of line header
        }
        System.out.println("------");

        for (int i = 0; i < salaries.length; i++)
        {
            System.out.print("Employee" + (i + 1) + ":\t"); // print employee
            for (int j = 0; j < salaries[i].length; j++)
            {
                System.out.print("$" + salaries[i][j] + "\t\t"); // print salaries for each employee for each year
            }
            System.out.println();
        }
        System.out.println();
    }
}
