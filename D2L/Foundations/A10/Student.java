// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 10
// IDE: Atom

public class Student extends Person
{
    // declare private variables
    private String status;

    // construct default Student object
    protected Student()
    {
    }

    // construct a Student object with status value
    protected Student(String status)
    {
        setStatus(status);
    }

    // construct a Student object with status, name, address, and phone number values
    protected Student(String status, String name, String address, String phoneNumber)
    {
        super(name, address, phoneNumber); // initialize name, address, and phone number from person object
        setStatus(status);
    }

    //get a status
    public String getStatus()
    {
        return status;
    }

    // set a new status
    public void setStatus(String status)
    {
        if (status.equals("Freshmen") || status.equals("Sophomore") || status.equals("Junior") || status.equals("Senior"))
            this.status = status;
        else
            this.status = "invalid user input";
    }

    // override toString method to print class name and data fields of the object
    public String toString()
    {
        return ("\nStudent object:\n\tName:\t\t" + getName() + "\n\tAddress:\t" + getAddress() + "\n\tPhone#:\t\t" + getPhoneNumber() +
        "\n\tStatus:\t\t" + status +
        "\n");
    }
}
