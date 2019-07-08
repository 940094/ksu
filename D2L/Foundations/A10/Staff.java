// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 10
// IDE: Atom

public class Staff extends Employee
{
    // declare private variables
    private String title;

    // construct default Staff object
    protected Staff()
    {
    }

    // construct Staff object with title value
    protected Staff(String title)
    {
        this.title = title;
    }

    // construct Staff object with title, name, address, phone, salary, and date hired value
    protected Staff(String title, Double salary, java.util.Date dateHired, String name, String address, String phoneNumber)
    {
        super(salary, dateHired, name, address, phoneNumber); // initialize salary, dateHired, name, address, and phoneNumber variables from employee ojbect
        this.title = title;
    }

    // get title value
    public String getTitle()
    {
        return title;
    }

    // set a new title value
    public void setTitle(String title)
    {
        this.title = title;
    }

    // override toString method to print class name and data fields of the object
    public String toString()
    {
        return ("\nStaff object:\n\tName:\t\t" + getName() + "\n\tAddress:\t" + getAddress() + "\n\tPhone#:\t\t" + getPhoneNumber() +
        "\n\tSalary:\t\t$" + getSalary() + "\n\tDate Hired:\t" + getDateHired() +
        "\n\tTitle:\t\t" + title +
        "\n");
    }
}
