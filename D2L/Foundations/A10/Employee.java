// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 10
// IDE: Atom

public class Employee extends Person
{
    // declare object variables as private
    private Double salary;
    private java.util.Date dateHired;

    // construct default Employee object
    protected Employee()
    {
        this.dateHired = new java.util.Date(); // initialize dateHired variable
    }

    // construct an Employee object with the salary and date values
    protected Employee(Double salary, java.util.Date dateHired)
    {
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // construct an Employee object with the salary, date, name, address, and phone number values
    protected Employee(Double salary, java.util.Date dateHired, String name, String address, String phoneNumber)
    {
        super(name, address, phoneNumber); // user super to initialize name, address, and phone number variables from the person object
        this.salary = salary;
        this.dateHired = dateHired;
    }

    // get salary value
    public Double getSalary()
    {
        return salary;
    }

    // set a new salary value
    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

    // get dateHired value
    public java.util.Date getDateHired()
    {
        return dateHired;
    }

    // set dateHired value
    public void setDateHired(java.util.Date dateHired)
    {
        this.dateHired = dateHired;
    }

    // override toString method to print class name and data fields of the object
    public String toString()
    {
        return ("\nEmployee object:\n\tName:\t\t" + getName() + "\n\tAddress:\t" + getAddress() + "\n\tPhone#:\t\t" + getPhoneNumber() +
        "\n\tSalary:\t\t$" + salary + "\n\tDate Hired:\t" + dateHired +
        "\n");
    }
}
