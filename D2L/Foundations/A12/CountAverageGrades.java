// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 12
// IDE: Atom

import java.util.*; // import java.util Classes

public class CountAverageGrades
{
    private int classSize; // declare private classSize variable
    private int[] grades; // declare private grades variable

    protected CountAverageGrades() // program general constructor
    {
    }

    protected CountAverageGrades(int[] grades, String classSize) // constructor to create CountAverageGrades object with grades and classSize variables
    {
        setClassSize(classSize);
        setGrades(grades);
    }

    public int getClassSize() // getter method for classSize
    {
        return classSize;
    }

    // setter method for classSize
    public void setClassSize(String s) throws InputMismatchException
    {
        Scanner scan = new Scanner(s);
        boolean hasNextInt = scan.hasNextInt();
        int num = scan.nextInt();
        if (!hasNextInt || num <= 0)
            throw new InputMismatchException("Class Size must be greater than 0.");
        this.classSize = num;
    }

    public int[] getGrades() // getter method for grades
    {
        return grades;
    }

    // setter method for grades array
    public void setGrades(int[] grades) throws InputMismatchException
    {
        for (int i = 0; i < grades.length; i++)
        {
            if (!(grades[i] <= 100 && grades[i] >= 0))
                throw new InputMismatchException("Entered integers must be between 0 and 100"); // throw exception if ineteger is not ebetween 0-100
        }
        this.grades = grades;
    }

    public double findAverage(int[] grades) // findAverage method
    {
        return findAverage(grades, 0);
    }

    public double findAverage(int[] grades, int index) // program recursive findAverage helper method
    {
        if (index == grades.length)
            return 0;
        else if (index == 0)
            return (grades[index] + findAverage(grades, index + 1)) / grades.length; // return Average
        else
            return grades[index] + findAverage(grades, index + 1); // return sum + method findAverage for next method
    }

    public void printGrades() // method to print grades in grades array
    {
        for (int i = 0; i < grades.length; i++)
        {
            System.out.print(grades[i] + " "); // print next grade
        }
    }

    public static void main(String[] args) // program main method
    {
        Scanner input = new Scanner(System.in);
        String again = "y";
        while (again.equals("Y") || again.equals("y")) // sentinel loop to allow user to re-run program
        {
            // declare and initialize instance of myCountAverageGrades object
            CountAverageGrades myCountAverageGrades = new CountAverageGrades();

            // prompt user for class size
            System.out.print("Please enter a class size as an integer (e.g. 3): "); // prompt user for class size
            while(true)
            {
                input = new Scanner(System.in);
                try
                {
                    myCountAverageGrades.setClassSize(input.next()); // use setter method to initialize classSize to user inputted variable
                    break;
                }
                catch (InputMismatchException e)
                {
                    System.out.print("Please enter a class size as an integer (e.g. 3): "); // prompt user for class size
                    continue;
                }
            }

            // prompt user to enter integers between 0-100
            input = new Scanner(System.in);
            int classSize = myCountAverageGrades.getClassSize(); // use getter to initialize classSize variable
            int[] temp = new int[classSize]; // declare and initialize array based on class size
            System.out.print("Please enter a list of " + classSize + " integers between 0-100 (e.g. 1 5 95): ");
            while (true) // validate user input
            {
                input = new Scanner(System.in); // initiate input as new scanner object

                // populate array with user inputted integers
                for (int i = 0; i < classSize; i++)
                {
                    temp[i] = input.nextInt();
                }

                // use exception handling to verify user inputted integers are between 0-100
                try
                {
                    myCountAverageGrades.setGrades(temp); // call setGrades method of myCountAverageGrades object to verify user inputs
                    break;
                }
                catch (InputMismatchException e)
                {
                    System.out.print("Please re-enter a a list of " + classSize + " integers between 0-100 (e.g. 1 5 95): "); // print prompt for user to re-enter list if exception thrown
                    continue;
                }
            }

            // print user inputted class size
            System.out.println("Class Size:\t" + myCountAverageGrades.getClassSize());

            // print user inputted grades
            System.out.print("Entered Grades:\t");
            myCountAverageGrades.printGrades(); // print user inputted grades

            // print results of findAverage
            System.out.printf("\nClass average:\t%1.2f\n", myCountAverageGrades.findAverage(myCountAverageGrades.getGrades()));

            // prompt user to re-run program
            input = new Scanner(System.in);
            System.out.print("Do you want to re-run program(Y/N)? ");
            again = input.next();
            System.out.println();
        }
    }
}
