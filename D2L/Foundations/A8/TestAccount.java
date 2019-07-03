// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 8
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
            System.out.printf("\nmyObject account balance:\t\t$%1.2f", myObject.getBalance());
            System.out.printf("\nmyObject earned monthly interest:\t$%1.2f", myObject.getMonthlyInterest());
            System.out.printf("\nmyObject date created:\t\t\t%s\n", myObject.getDateCreated());
            //System.out.printf("\nmyObject toString() method:\t%s\n", myObject.toString()); // print meaningful data for myAccount


            // prompt user to initialize Account object myAccount
            System.out.println("\nCreating myAccount and yourAccount objects:");
            System.out.print("Please initialize myAccount with an account id and initial value as an integer and double, respectively (e.g. 12345 700.00): "); // prompt user to initialize myAccount Account object with initial values
            int accountId = input.nextInt();
            double balance = input.nextDouble();
            while (balance < 0)
            {
                System.out.print("Please initialize myAccount with non-negative initial value as a double (e.g. 700.00): "); // re-prompt user to enter a non-negative initial account balance
                balance = input.nextDouble();
            }
            Account myAccount = new Account(accountId, balance); // declare and initialize myAccount variable as an Account object with account Id and balance

            // prompt user to set interest rate for Account object myAccount
            System.out.print("Please set the interest rate for myAccount as a double (e.g. 3.25): "); // prompt user to set interest rate for myAccount object
            double interestRate = input.nextDouble();
            while (interestRate < 0)
            {
                System.out.print("Please initialize myAccount with non-negative interest rate as a double (e.g. 3.25): "); // re-prompt user to set a non-negative interest rate
                interestRate = input.nextDouble();
            }
            myAccount.setAnnualInterestRate(interestRate); // set interest rate for myAccount Account object
            System.out.println(myAccount.toString()); // print meaningful data about myAccount object

            // prompt user to initialize Account object yourAccount
            System.out.print("\nmyAccount successfully created. Now, initialize yourAccount with an account id and initial value as an integer and double, respectively (e.g. 12345 700.00): "); // prompt user to initialize myAccount Account object with initial values
            accountId = input.nextInt();
            balance = input.nextDouble();
            while (balance < 0)
            {
                System.out.print("Please initialize yourAccount with non-negative initial value as a double (e.g. 700.00): "); // re-prompt user to enter a non-negative initial balance
                balance = input.nextDouble();
            }
            Account yourAccount = new Account(accountId, balance); // declare and initialize yourAccount Account object with account ID and balance

            // prompt user to set interest rate fro Account Object yourAccount
            System.out.print("Please set the interest rate for yourAccount as a double (e.g. 3.25): "); // prompt user to enter yourAccount interest rate
            interestRate = input.nextDouble();
            while (interestRate < 0)
            {
                System.out.print("Please initialize yourAccount with non-negative interest rate as a double (e.g. 3.25): "); // re-prompt user to enter non-negative interest rate
                interestRate = input.nextDouble();
            }
            yourAccount.setAnnualInterestRate(interestRate); // set yourAccount interest rate
            System.out.println(yourAccount.toString()); // print meaningful data about yourAccount object

            // prompt user to test setId() method
            System.out.println("--------------------------");
            System.out.println("Testing setId() method:");
            System.out.print("Enter the new account ID for myAccount as an integer (e.g. 12345): "); // prompt user to enter an integer myAccount account ID
            int num = input.nextInt();
            System.out.println("myAccount Account ID before being changed:\t" + myAccount.getId()); // print old account ID
            myAccount.setId(num); // change account ID
            System.out.println("myAccount Account ID after being changed:\t" + myAccount.getId()); // print new account ID

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
            System.out.println("--------------------------");
            System.out.println("Testing withdraw() method:");
            System.out.print("Please set a withdraw amount for myAccount as a double (e.g. 100.00): "); // prompt user to enter withdraw amount for myAccount
            double withdraw = input.nextDouble();
            while (withdraw < 0)
            {
                System.out.print("Please enter a non-negative withdraw amount as a double (e.g. 100.00): "); // re-prompt user to enter non-negative withdraw amount
                withdraw = input.nextDouble();
            }
            System.out.printf("myAccount balance before withdrawing $%1.2f:\t$%1.2f\n", withdraw, myAccount.getBalance()); // print account balance before withdraw
            myAccount.withdraw(withdraw); // withdraw amount from myAccount
            System.out.printf("myAccount balance after withdrawing $%1.2f:\t$%1.2f\n", withdraw, myAccount.getBalance()); // print account balance after withdraw

            System.out.print("Please set a withdraw amount for yourAccount as a double (e.g. 100.00): "); // prompt user to enter withdraw amount for yourAccount
            withdraw = input.nextDouble();
            while (withdraw < 0)
            {
                System.out.print("Please enter a non-negative withdraw amount as a double (e.g. 100.00): "); // re-prompt user to enter non-negative withdraw amount
                withdraw = input.nextDouble();
            }
            System.out.printf("yourAccount balance before withdrawing $%1.2f:\t$%1.2f\n", withdraw, yourAccount.getBalance()); // print account balance before withdraw
            yourAccount.withdraw(withdraw); // withdraw amount from yourAccount
            System.out.printf("yourAccount balance after withdrawing $%1.2f:\t$%1.2f\n", withdraw, yourAccount.getBalance()); // print account balance after withdraw

            // prompt user to test deposit() method
            System.out.println("--------------------------");
            System.out.println("Testing deposit() method:");
            System.out.print("Please enter a deposit amount for myAccount as a double (e.g. 100.00): "); // prompt user to enter a deposit amount for myAccount
            double deposit = input.nextDouble();
            while (deposit < 0)
            {
                System.out.print("Please enter a non-negative deposit amount as a double (e.g. 100.00): "); // prompt user to re-enter non-negative amount
                deposit = input.nextDouble();
            }
            System.out.printf("myAccount balance before depositing $%1.2f:\t$%1.2f\n", deposit, myAccount.getBalance()); // print balance before deposit
            myAccount.deposit(deposit); // deposit amount into myAccount
            System.out.printf("myAccount balance after depositing $%1.2f:\t$%1.2f\n", deposit, myAccount.getBalance()); // print balance after deposit

            System.out.print("Please enter a deposit amount for yourAccount as a double (e.g. 100.00): "); // prompt user to enter a deposit amount for myAccount
            deposit = input.nextDouble();
            while (deposit < 0)
            {
                System.out.print("Please enter a non-negative deposit amount as a double (e.g. 100.00): "); // prompt user to re-enter non-negative amount
                deposit = input.nextDouble();
            }
            System.out.printf("yourAccount balance before depositing $%1.2f:\t$%1.2f\n", deposit, yourAccount.getBalance()); // print balance before deposit
            yourAccount.deposit(deposit); // deposit amount in yourAccount
            System.out.printf("yourAccount balance after depositing $%1.2f:\t$%1.2f\n", deposit, yourAccount.getBalance()); // print balance after deposit

            // prompt user to test setBalance() method
            System.out.println("--------------------------");
            System.out.println("Testing setBalance() method:");
            System.out.print("Please set a new balance amount for myAccount as a double (e.g. 100.00): "); // prompt user to set new balance for myAccount
            balance = input.nextDouble();
            while (balance < 0)
            {
                System.out.print("Please enter a non-negative balance amount as a double (e.g. 100.00): "); // re-prompt user to enter non-negative balance
                balance = input.nextDouble();
            }
            System.out.printf("myAccount balance before setting the new balance to $%1.2f:\t$%1.2f\n", balance, myAccount.getBalance()); // print previous balance
            myAccount.setBalance(balance); // set new balance
            System.out.printf("myAccount balance after setting the new balance to $%1.2f:\t$%1.2f\n", balance, myAccount.getBalance()); // print new balance

            System.out.print("Please set a new balance amount for yourAccount as a double (e.g. 100.00): "); // prompt user to set balance amount for yourAccount
            balance = input.nextDouble();
            while (balance < 0)
            {
                System.out.print("Please enter a non-negative balance amount as a double (e.g. 100.00): "); // re-prompt user to set non-negative balance amount
                balance = input.nextDouble();
            }
            System.out.printf("yourAccount balance before setting new balance to $%1.2f:\t$%1.2f\n", balance, yourAccount.getBalance()); // print previous balance
            yourAccount.setBalance(balance); // set new balance
            System.out.printf("yourAccount balance after setting new balance to $%1.2f:\t$%1.2f\n", balance, yourAccount.getBalance()); // print new balance

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
            System.out.println("--------------------------");
            System.out.println("Testing setAnnualInterestRate() method:");
            System.out.print("Please set a new annual interest rate for myAccount as a double (e.g. 2.30): "); // prompt user to set interest rate for myAccount
            double annualInterestRate = input.nextDouble();
            while (annualInterestRate < 0)
            {
                System.out.print("Please enter a non-negative interest rate as a double (e.g. 2.30): "); // re-prompt user to set non-negative interest rate
                annualInterestRate = input.nextDouble();
            }
            System.out.printf("myAccount annual interest rate before setting the new interest rate to %1.2f%%:\t%1.2f%%\n", annualInterestRate, myAccount.getAnnualInterestRate()); // print old interest rate
            myAccount.setAnnualInterestRate(annualInterestRate); // set new interest rate
            System.out.printf("myAccount annual interest rate after setting the new interest rate to %1.2f%%:\t%1.2f%%\n", annualInterestRate, myAccount.getAnnualInterestRate()); // print new interest rate

            System.out.print("Please set a new annual interest rate for yourAccount as a double (e.g. 2.30): "); // prompt user to set interest rate for yourAccount
            annualInterestRate = input.nextDouble();
            while (annualInterestRate < 0)
            {
                System.out.print("Please enter a non-negative interest rate as a double (e.g. 2.30): "); // re-prompt user to set non-negative interest rate
                annualInterestRate = input.nextDouble();
            }
            System.out.printf("yourAccount annual interest rate before setting the new interest rate to %1.2f%%:\t%1.2f%%\n", annualInterestRate, yourAccount.getAnnualInterestRate()); // print old interest rate
            yourAccount.setAnnualInterestRate(annualInterestRate); // set new interest rate
            System.out.printf("yourAccount annual interest rate after setting the new interest rate to %1.2f%%:\t%1.2f%%\n", annualInterestRate, yourAccount.getAnnualInterestRate()); // print new interest rate

            // test getMonthlyInterestRate() method
            System.out.println("--------------------------");
            System.out.println("Testing getMonthlyInterestRate() method:");
            System.out.printf("myAccount monthly interest rate:\t%1.2f%%\n", myAccount.getMonthlyInterestRate()); // print monthly interest rate for myAccount
            System.out.printf("yourAccount monthly interest rate:\t%1.2f%%\n", yourAccount.getMonthlyInterestRate()); // print monthly interest rate for yourAccount

            // test getMonthlyInterest() method
            System.out.println("--------------------------");
            System.out.println("Testing getMonthlyInterest() method:");
            System.out.printf("myAccount monthly interest amount based on a balance of $%1.2f:\t$%1.2f\n", myAccount.getBalance(), myAccount.getMonthlyInterest()); // print monthly interest for myAccount
            System.out.printf("yourAccount monthly interest amount based on a balance of $%1.2f:\t$%1.2f\n", yourAccount.getBalance(), yourAccount.getMonthlyInterest());  // print monthly interest for yourAccount

            // test toString() method
            System.out.println("--------------------------");
            System.out.println("Testing toString() method:");
            System.out.printf("\nmyAccount toString() method:%s\n", myAccount.toString()); // print meaningful data for myAccount
            System.out.printf("\nyourAccount toString() method:%s\n", yourAccount.toString()); // print meaningful data for yourAccount

            // prompt user to re-run program
            System.out.print("\nWould you like to re-run the program (Y/N)? "); // print prompt for user to re-run program
            again = input.next();
            System.out.println();
        }
    }
}
