// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 11
// IDE: Atom

import java.util.Date; // import Date class

public class Account // program Account class
{
    // declare private variables for the Account class
    private int id = 0; // declare and initialize id variable as 0
    private double balance = 0.0; // declare and initialize balance variable as 0
    private double annualInterestRate = 0.0; // declare and initialize annualInterestRate variable as 0
    private Date dateCreated = new Date(); // declare and initialize dateCreated variable as a Date object

    // no-argument constructor
    public Account()
    {
    }

    // constructor with id and balance arguments
    public Account(int id, double balance) throws IllegalArgumentException
    {
        this.id = id; // set instance of id variable equal to id argument
        if (balance > 0)
            this.balance = balance; // set instance of balance variable equal to balance argument
        else
            throw new IllegalArgumentException("Initial balance cannot be zero or negative.");
    }

    // getter method for private id varaible
    public int getId()
    {
        return id;
    }

    // setter method for private id varaible
    public void setId(int id)
    {
        this.id = id; // set instance of id variable equal to id argument
    }

    // getter method for private balance varaible
    public double getBalance()
    {
        return balance;
    }

    // setter method for private balance varaible
    public void setBalance(double balance) throws IllegalArgumentException
    {
        this.balance = balance; // set instance of balance variable equal to balance argument
    }

    // getter method for private annualInterestRate varaible
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    // setter method for private annualInterestRate varaible
    public void setAnnualInterestRate(double rate) throws IllegalArgumentException
    {
        if (rate > 0)
            annualInterestRate = rate; // set instance of annualInterestRate variable equal to rate argument
        else
            throw new IllegalArgumentException("Annual Interest Rate must be greater than 0.");
    }

    // getter method for private dateCreated varaible
    public Date getDateCreated()
    {
        return dateCreated;
    }

    // return monthly interest rate
    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12; // divide annualInterestRate by 12 to get monthly interest
    }

    // return monthly interest amount
    public double getMonthlyInterest()
    {
        return balance * getMonthlyInterestRate() / 100; // multiple current balance * monthly interest rate and divide by 100 to get earned monthly interest
    }

    // withdraw argument amount
    public void withdraw(double amount) throws IllegalArgumentException
    {
        if (amount > 0)
            balance = balance - amount;
        else
            throw new IllegalArgumentException("Withdraw amount cannot be 0 or negative.");
    }

    // deposit argument amount
    public void deposit(double amount) throws IllegalArgumentException
    {
        if (amount > 0)
            balance = balance + amount;
        else
            throw new IllegalArgumentException("Deposit amount cannot be 0 or negative.");
    }

    // return string of account id, account balance, interest rate, and date created
    public String toString()
    {
        return ("\nAccount ID:\t\t" + id + "\nAccount Balance:\t$" + balance + "\nInterest Rate:\t\t" + annualInterestRate + "%" + "\nDate Opened:\t\t" + dateCreated.toString());
    }
}
