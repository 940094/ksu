// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 11
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class TestAccount
{
    public static void main(String[] args) // program main method
    {
        Scanner input = new Scanner(System.in);
        String again = "y";
        while (again.equals("Y") || again.equals("y")) // sentinel loop to allow user to re-run program
        {
            // program myObject
            Account myObject = new Account(123456, 10_000); // declare and initialize myObject variable as Account object with initial values
            System.out.printf("\nmyObject initialized:%s", myObject.toString());

            myObject.setAnnualInterestRate(2.5); // set interest rate of myObject Account object
            myObject.withdraw(3_500); // withdraw 3,500 from myObject balance
            myObject.deposit(500); // deposit 500 to myObject balance

            System.out.printf("\n\nmyObject after withdrawing 3,500, depositing 500, and setting interest rate to 2.5%%:");
            System.out.printf("\nmyObject account balance:\t\t$%1.2f", myObject.getBalance()); // print myObject balance
            System.out.printf("\nmyObject earned monthly interest:\t$%1.2f", myObject.getMonthlyInterest()); // print myObject interest rate
            System.out.printf("\nmyObject date created:\t\t\t%s\n", myObject.getDateCreated()); // print myObject date created

            // prompt user to initialize Account object myAccount
            System.out.println("\nCreating myAccount and yourAccount objects:");
            System.out.print("Please initialize myAccount with an account id and initial value as an integer and double, respectively (e.g. 12345 700.00): "); // prompt user to initialize myAccount Account object with initial values
            int accountId = input.nextInt();
            double balance = input.nextDouble();
            Account myAccount = initializeAccount(accountId, balance); // validate user inputted input for IllegalArgumentException

            // prompt user to set interest rate for Account object myAccount
            input = new Scanner(System.in);
            System.out.print("Please set the interest rate for myAccount as a double (e.g. 3.25): "); // prompt user to set interest rate for myAccount object
            verifyInterestRate(input.nextDouble(), myAccount); // validate user inputted interest rate
            System.out.println(myAccount.toString()); // print meaningful data about myAccount object

            // prompt user to initialize Account object yourAccount
            input = new Scanner(System.in);
            System.out.print("\nmyAccount successfully created. Now, initialize yourAccount with an account id and initial value as an integer and double, respectively (e.g. 12345 700.00): "); // prompt user to initialize myAccount Account object with initial values
            accountId = input.nextInt();
            balance = input.nextDouble();
            Account yourAccount = initializeAccount(accountId, balance); // validate user inputted input for IllegalArgumentException

            // prompt user to set interest rate fro Account Object yourAccount
            input = new Scanner(System.in);
            System.out.print("Please set the interest rate for yourAccount as a double (e.g. 3.25): "); // prompt user to enter yourAccount interest rate
            verifyInterestRate(input.nextDouble(), yourAccount); // validate user inputted interest rate
            System.out.println(yourAccount.toString()); // print meaningful data about yourAccount object

            // prompt user to test setId() method
            input = new Scanner(System.in);
            System.out.println("--------------------------");
            System.out.println("Testing setId() method:");
            System.out.print("Enter the new account ID for myAccount as an integer (e.g. 12345): "); // prompt user to enter an integer myAccount account ID
            int num = input.nextInt();
            System.out.println("myAccount Account ID before being changed:\t" + myAccount.getId()); // print old account ID
            myAccount.setId(num); // change account ID
            System.out.println("myAccount Account ID after being changed:\t" + myAccount.getId()); // print new account ID

            input = new Scanner(System.in);
            System.out.print("Enter the account ID for yourAccount as an integer (e.g. 12345): "); // prompt user to enter an integer for yourAccount account ID
            num = input.nextInt();
            System.out.println("yourAccount Account ID before being changed:\t" + yourAccount.getId()); // print old account ID
            yourAccount.setId(num); // change account ID
            System.out.println("yourAccount Account ID after being changed:\t" + yourAccount.getId()); // print new account ID

            // test getId() method
            System.out.println("--------------------------");
            System.out.println("Testing getId() method:");
            System.out.println("myAccount Account ID:\t" + myAccount.getId()); // print myAccount account ID
            System.out.println("yourAccount Account ID:\t" + yourAccount.getId()); // print yourAccount account ID

            // prompt user to test withdraw() method
            input = new Scanner(System.in);
            System.out.println("--------------------------");
            System.out.println("Testing withdraw() method:");
            double oldBalance = myAccount.getBalance();
            System.out.print("Please set a withdraw amount for myAccount as a double (e.g. 100.00): "); // prompt user to enter withdraw amount for myAccount
            double withdraw = verifyWithdraw(input.nextDouble(), myAccount); // validate user input for IllegalArgumentException
            System.out.printf("myAccount balance before withdrawing $%1.2f:\t$%1.2f\n", withdraw, oldBalance); // print account balance before withdraw
            System.out.printf("myAccount balance after withdrawing $%1.2f:\t$%1.2f\n", withdraw, myAccount.getBalance()); // print account balance after withdraw

            input = new Scanner(System.in);
            oldBalance = yourAccount.getBalance();
            System.out.print("Please set a withdraw amount for yourAccount as a double (e.g. 100.00): "); // prompt user to enter withdraw amount for myAccount
            withdraw = verifyWithdraw(input.nextDouble(), yourAccount); // validate user input for IllegalArgumentException
            System.out.printf("yourAccount balance before withdrawing $%1.2f:\t$%1.2f\n", withdraw, oldBalance); // print account balance before withdraw
            System.out.printf("yourAccount balance after withdrawing $%1.2f:\t$%1.2f\n", withdraw, yourAccount.getBalance()); // print account balance after withdraw

            // prompt user to test deposit() method
            input = new Scanner(System.in);
            System.out.println("--------------------------");
            System.out.println("Testing deposit() method:");
            oldBalance = myAccount.getBalance();
            System.out.print("Please enter a deposit amount for myAccount as a double (e.g. 100.00): "); // prompt user to enter a deposit amount for myAccount
            double deposit = verifyDeposit(input.nextDouble(), myAccount); // validate user input for IllegalArgumentException
            System.out.printf("myAccount balance before depositing $%1.2f:\t$%1.2f\n", deposit, oldBalance); // print balance before deposit
            System.out.printf("myAccount balance after depositing $%1.2f:\t$%1.2f\n", deposit, myAccount.getBalance()); // print balance after deposit

            input = new Scanner(System.in);
            oldBalance = yourAccount.getBalance();
            System.out.print("Please enter a deposit amount for yourAccount as a double (e.g. 100.00): "); // prompt user to enter a deposit amount for myAccount
            deposit = verifyDeposit(input.nextDouble(), yourAccount); // validate user input for IllegalArgumentException
            System.out.printf("yourAccount balance before depositing $%1.2f:\t$%1.2f\n", deposit, oldBalance); // print balance before deposit
            System.out.printf("yourAccount balance after depositing $%1.2f:\t$%1.2f\n", deposit, yourAccount.getBalance()); // print balance after deposit

            // prompt user to test setBalance() method
            input = new Scanner(System.in);
            System.out.println("--------------------------");
            System.out.println("Testing setBalance() method:");
            System.out.print("Please set a new balance amount for myAccount as a double (e.g. 100.00): "); // prompt user to set new balance for myAccount
            balance = input.nextDouble();
            while (balance < 0)
            {
                input = new Scanner(System.in);
                System.out.print("Please enter a non-negative balance amount as a double (e.g. 100.00): "); // re-prompt user to enter non-negative balance
                balance = input.nextDouble();
            }
            System.out.printf("myAccount balance before setting the new balance to $%1.2f:\t$%1.2f\n", balance, myAccount.getBalance()); // print previous balance
            myAccount.setBalance(balance); // set new balance
            System.out.printf("myAccount balance after setting the new balance to $%1.2f:\t$%1.2f\n", balance, myAccount.getBalance()); // print new balance

            input = new Scanner(System.in);
            System.out.print("Please set a new balance amount for yourAccount as a double (e.g. 100.00): "); // prompt user to set balance amount for yourAccount
            balance = input.nextDouble();
            while (balance < 0)
            {
                input = new Scanner(System.in);
                System.out.print("Please enter a non-negative balance amount as a double (e.g. 100.00): "); // re-prompt user to set non-negative balance amount
                balance = input.nextDouble();
            }
            System.out.printf("yourAccount balance before setting new balance to $%1.2f:\t$%1.2f\n", balance, yourAccount.getBalance()); // print previous balance
            yourAccount.setBalance(balance); // set new balance
            System.out.printf("yourAccount balance after setting new balance to $%1.2f:\t\t$%1.2f\n", balance, yourAccount.getBalance()); // print new balance

            // test getBalance() method
            System.out.println("--------------------------");
            System.out.println("Testing getBalance() method:");
            System.out.printf("myAccount balance:\t$%1.2f\n", myAccount.getBalance()); // print myAccount balance
            System.out.printf("yourAccount balance:\t$%1.2f\n", yourAccount.getBalance()); // print yourAccount balance

            // test getDateCreated() method
            System.out.println("--------------------------");
            System.out.println("Testing getDateCreated() method:");
            System.out.printf("myAccount was created on:\t%s\n", myAccount.getDateCreated()); // print myAccount date created
            System.out.printf("yourAccount was created on:\t%s\n", yourAccount.getDateCreated()); // print yourAccount date created

            // test getAnnualInterestRate() method
            System.out.println("--------------------------");
            System.out.println("Testing getAnnualInterestRate() method:");
            System.out.printf("myAccount annual interest rate:\t\t%1.2f%%\n", myAccount.getAnnualInterestRate());  // print myAccount interest rate
            System.out.printf("yourAccount annual interest rate:\t%1.2f%%\n", yourAccount.getAnnualInterestRate()); // print yourAccount interest rate

            // prompt user to test setAnnualInterestRate() method
            input = new Scanner(System.in);
            System.out.println("--------------------------");
            double oldInterestRate = myAccount.getAnnualInterestRate();
            System.out.println("Testing setAnnualInterestRate() method:");
            System.out.print("Please set a new annual interest rate for myAccount as a double (e.g. 2.30): "); // prompt user to set interest rate for myAccount
            double newInterestRate = verifyInterestRate(input.nextDouble(), myAccount); // validate user inputted interest rate
            System.out.printf("myAccount annual interest rate before setting the new interest rate to %1.2f%%:\t%1.2f%%\n", newInterestRate, oldInterestRate); // print old interest rate
            System.out.printf("myAccount annual interest rate after setting the new interest rate to %1.2f%%:\t%1.2f%%\n", newInterestRate, newInterestRate); // print new interest rate

            input = new Scanner(System.in);
            oldInterestRate = yourAccount.getAnnualInterestRate();
            System.out.print("Please set a new annual interest rate for yourAccount as a double (e.g. 2.30): "); // prompt user to set interest rate for yourAccount
            newInterestRate = verifyInterestRate(input.nextDouble(), yourAccount); // validate user inputted interest rate
            System.out.printf("yourAccount annual interest rate before setting the new interest rate to %1.2f%%:\t%1.2f%%\n", newInterestRate, oldInterestRate); // print old interest rate
            System.out.printf("yourAccount annual interest rate after setting the new interest rate to %1.2f%%:\t%1.2f%%\n", newInterestRate, newInterestRate); // print new interest rate

            // test getMonthlyInterestRate() method
            System.out.println("--------------------------");
            System.out.println("Testing getMonthlyInterestRate() method:");
            System.out.printf("myAccount monthly interest rate:\t%1.2f%%\n", myAccount.getMonthlyInterestRate()); // print monthly interest rate for myAccount
            System.out.printf("yourAccount monthly interest rate:\t%1.2f%%\n", yourAccount.getMonthlyInterestRate()); // print monthly interest rate for yourAccount

            // test getMonthlyInterest() method
            System.out.println("--------------------------");
            System.out.println("Testing getMonthlyInterest() method:");
            System.out.printf("myAccount monthly interest amount based on a balance of $%1.2f:\t\t$%1.2f\n", myAccount.getBalance(), myAccount.getMonthlyInterest()); // print monthly interest for myAccount
            System.out.printf("yourAccount monthly interest amount based on a balance of $%1.2f:\t$%1.2f\n", yourAccount.getBalance(), yourAccount.getMonthlyInterest());  // print monthly interest for yourAccount

            // test toString() method
            System.out.println("--------------------------");
            System.out.println("Testing toString() method:");
            System.out.printf("\nmyAccount toString() method:%s\n", myAccount.toString()); // print meaningful data for myAccount
            System.out.printf("\nyourAccount toString() method:%s\n", yourAccount.toString()); // print meaningful data for yourAccount

            // prompt user to re-run program
            input = new Scanner(System.in);
            System.out.print("\nWould you like to re-run the program (Y/N)? "); // print prompt for user to re-run program
            again = input.next();
            System.out.println();
        }
    }
    public static Account initializeAccount(int accountId, double balance) // method to initialize account with user inputted balance
    {
        while (true)
        {
            Scanner input = new Scanner(System.in);
            try
            {
                new Account(accountId, balance); // initialize myAccount variable as an Account object with account Id and balance
                return new Account(accountId, balance);
            }
            catch (IllegalArgumentException e)
            {
                System.out.print("IllegalArgumentException. Please initialize account with a positive initial balance as a double (e.g. 700.00): "); // re-prompt user to enter a non-negative initial account balance
                balance = input.nextDouble();
                continue;
            }
        }
    }
    public static double verifyDeposit(double deposit, Account account) // method to verify user inputted deposit amount
    {
        while(true)
        {
            Scanner input = new Scanner(System.in); // initialize new scanner object
            try
            {
                account.deposit(deposit); // call desposit method with user inputted deposit
                return deposit;
            }
            catch (IllegalArgumentException e)
            {
                System.out.print("IllegalArgumentException. Please enter a positive deposit amount as a double (e.g. 100.00): "); // print illegal argument exception
                deposit = input.nextDouble();
                continue;
            }
        }
    }
    public static double verifyWithdraw(double withdraw, Account account) // method to verify user inputted withdraw amount
    {
        while(true)
        {
            Scanner input = new Scanner(System.in); // initialize new scanner object
            try
            {
                account.withdraw(withdraw); // call withdraw method with user inputted withdraw amount
                return withdraw;
            }
            catch (IllegalArgumentException e)
            {
                System.out.print("IllegalArgumentException. Please enter a positive withdraw amount as a double (e.g. 100.00): "); // print IllegalArgumentException
                withdraw = input.nextDouble();
                continue;
            }
        }
    }
    public static double verifyInterestRate(double rate, Account account) // method to verify user inputted interest rate
    {
        while(true)
        {
            Scanner input = new Scanner(System.in); // initialize new scanner object
            try
            {
                account.setAnnualInterestRate(rate); // call annual interest rate method with user inputted rate
                return rate;
            }
            catch (IllegalArgumentException e)
            {
                System.out.print("IllegalArgumentException. Please enter a positive Annual Interest Rate as a double (e.g. 5.50): "); // print IllegalArgumentException
                rate = input.nextDouble();
                continue;
            }
        }
    }
}
