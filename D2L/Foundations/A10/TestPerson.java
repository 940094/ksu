// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 10
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class TestPerson
{
    public static void main(String[] args) // program main method
    {
        String again = "Y";
        while (again.equals("Y") || again.equals("y")) // sentinel loop to allow user to re-run program
        {
            Scanner input = new Scanner(System.in);

            // create and print Person object
            System.out.println("\nCreating Person object:");
            String[] personVariables = promptUserForPersonVariables(); // get user inputted variables for person object
            Person myPerson = new Person(personVariables[0], personVariables[1], personVariables[2]); // create new object
            System.out.print(myPerson.toString()); // call toString() on object and print the result

            // create and print Student object
            System.out.println("\nCreating Student object:");
            personVariables = promptUserForPersonVariables(); // get user inputted variables for person object
            System.out.print("Please enter a student status as a string - Freshmen, Sophomore, Junior, or Senior: "); // prompt user to enter status as a string
            String status = input.next();
            while (!(status.equals("Freshmen") || status.equals("Sophomore") || status.equals("Junior") || status.equals("Senior")))
            {
                System.out.print("Please enter a student status as a string - Freshmen, Sophomore, Junior, or Senior: "); // re-prompt user to enter status as a string
                status = input.next();
            }
            Student myStudent = new Student(status, personVariables[0], personVariables[1], personVariables[2]); // create new object
            System.out.print(myStudent.toString()); // call toString() on object and print the result

            // create and print Employee object
            System.out.println("\nCreating Employee object:");
            personVariables = promptUserForPersonVariables(); // get user inputted variables for person object
            Double salary = promptUserForSalary(); // declare and initialize salary variable as return value of promptUserForSalary
            java.util.Date dateHired = promptUserForDateHired(); // declare and initialize dateHired as return value of promptUserForDateHired
            Employee myEmployee = new Employee(salary, dateHired, personVariables[0], personVariables[1], personVariables[2]); // create new object
            System.out.print(myEmployee.toString()); // call toString() on object and print the result

            // create and print Visitor object
            System.out.println("\nCreating Visitor object:");
            personVariables = promptUserForPersonVariables(); // get user inputted variables for person object
            System.out.print("Please enter a purpose for the visit as a string: "); // prompt user to enter visitPurpose as a string
            input = new Scanner(System.in); // initailize input to call nextLine;
            String visitPurpose = input.nextLine(); // declare and initialize visitPurpose variable as user inputted string
            java.util.Date visitDate = new java.util.Date(); // declare and initialize visit date as Date object with current time
            Visitor myVisitor = new Visitor(visitPurpose, visitDate, personVariables[0], personVariables[1], personVariables[2]); // create new object
            System.out.print(myVisitor.toString()); // call toString() on object and print the result

            // create and print Faculty object
            System.out.println("\nCreating Faculty object:");
            personVariables = promptUserForPersonVariables(); // get user inputted variables for person object
            salary = promptUserForSalary(); // initialize salary variable as return value of promptUserForSalary
            dateHired = promptUserForDateHired(); // initialize dateHired as return value of promptUserForDateHired

            System.out.print("Please enter an office number as a string (e.g., KH-309): "); // prompt user to enter officeNumber as a string
            input = new Scanner(System.in); // initailize input to call nextLine;
            String officeNumber = input.nextLine();

            System.out.print("Please enter a faculty rank as a string - Assistant Professor, Associate Professor, or Full Professor: "); // prompt user to enter rank as a string
            input = new Scanner(System.in); // initailize input to call nextLine;
            String rank = input.nextLine();
            while (!(rank.equals("Assistant Professor") || rank.equals("Associate Professor") || rank.equals("Full Professor")))
            {
                System.out.print("Please enter a faculty rank as a string - Assistant Professor, Associate Professor, or Full Professor: "); // re-prompt user to enter rank as a string
                input = new Scanner(System.in);
                rank = input.nextLine();
            }
            Faculty myFaculty = new Faculty(salary, dateHired, officeNumber, rank, personVariables[0], personVariables[1], personVariables[2]); // create new object
            System.out.print(myFaculty.toString()); // call toString() on object and print the result

            // create and print Staff object
            System.out.println("\nCreating Staff object:");
            personVariables = promptUserForPersonVariables(); // get user inputted variables for person object
            salary = promptUserForSalary(); // declare and initialize salary variable as return value of promptUserForSalary
            dateHired = promptUserForDateHired(); // declare and initialize dateHired as return value of promptUserForDateHired
            System.out.print("Please enter a title as a string: "); // prompt user to enter a title
            input = new Scanner(System.in); // initailize input to call nextLine;
            String title = input.nextLine();
            Staff myStaff = new Staff(title, salary, dateHired, personVariables[0], personVariables[1], personVariables[2]); // create new object
            System.out.print(myStaff.toString()); // call toString() on object and print the result

            // prompt user to re-run program
            System.out.print("\nDo you want to re-run program(Y/N)? "); // print prompt for user to re-run program
            again = input.next();
            System.out.println();
        }
    }

    // prompt user for name, address, and phone number of a person and return the variables as an array of strings
    public static String[] promptUserForPersonVariables()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the name of a person as a string (e.g., John Smith): "); // prompt user for name
        String name = input.nextLine();
        System.out.print("Please enter an address as a string (e.g., 123 Main Street, Kennesaw, GA 13431): "); // prompt user for address
        String address = input.nextLine();
        System.out.print("Please enter a phone number as a string (e.g., (404) 123-5678): "); // prompt user for phone number
        String phoneNumber = input.nextLine();
        String[] temp = {name, address, phoneNumber}; // initialize temp array as name, address, and phone number
        return temp; // return array of name, address, and phone number
    }

    // program method promptUserForSalary to get and validate user inputted salary
    public static double promptUserForSalary()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter Salary as a double (e.g., 98580.00): "); // prompt user to enter salary
        Double salary = input.nextDouble();
        while (salary < 0)
        {
            System.out.print("Please enter non-negative Salary as a double (e.g., 98580.00): "); // re-prompt user to enter salary
            salary = input.nextDouble();
        }
        return salary; // return salary as a double
    }

    // program method promptUserForDateHired to get and validate user inputted date hired
    public static java.util.Date promptUserForDateHired()
    {
        Scanner input = new Scanner(System.in);

        java.util.Date date = new java.util.Date(); // declare and initialize date as a Date object

        System.out.print("\nPlease enter a hire date in milliseconds from January 1, 1970 (currently it's " + date.getTime() + "): "); // prompt user for hire date in milliseconds
        long elapsedTime = input.nextLong(); // save user inputted milliseconds
        date.setTime(elapsedTime); // set date as new user inputted elapsed time

        return date; // return hire date as a date object
    }
}
