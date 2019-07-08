// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 10
// IDE: Atom

public class Faculty extends Employee
{
    // set private variables
    private String officeNumber;
    private String rank;

    // construct default Faculty class
    protected Faculty()
    {
    }

    // construct Faculty class with officeNumber and rank values
    protected Faculty(String officeNumber, String rank)
    {
        this.officeNumber = officeNumber;
        setRank(rank);
    }

    // construct Faculty class with salary, dateHired, officeNumber, rank, name, address, and phone number values
    protected Faculty(Double salary, java.util.Date dateHired, String officeNumber, String rank, String name, String address, String phoneNumber)
    {
        super(salary, dateHired, name, address, phoneNumber); // initialize salary, dateHired, name, address, and phone number from employee object
        this.officeNumber = officeNumber;
        setRank(rank);
    }

    // get officeNumber
    public String getOfficeNumber()
    {
        return officeNumber;
    }

    // set new officeNumber
    public void setOfficeNumber(String officeNumber)
    {
        this.officeNumber = officeNumber;
    }

    // get rank
    public String getRank()
    {
        return rank;
    }

    // set new rank
    public void setRank(String rank)
    {
        if (rank.equals("Assistant Professor") || rank.equals("Associate Professor") || rank.equals("Full Professor"))
            this.rank = rank;
        else
            System.out.println("\n" + rank + "is an invalid input.");
    }

    // override toString method to print class name and data fields of the object
    public String toString()
    {
        return ("\nFaculty object:\n\tName:\t\t" + getName() + "\n\tAddress:\t" + getAddress() + "\n\tPhone#:\t\t" + getPhoneNumber() +
        "\n\tSalary:\t\t$" + getSalary() + "\n\tDate Hired:\t" + getDateHired() +
        "\n\tOffice#:\t" + officeNumber + "\n\tRank:\t\t" + rank +
        "\n");
    }
}
