// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 10
// IDE: Atom

public class Visitor extends Person
{
    // declare private variables
    private String visitPurpose;
    private java.util.Date visitDate;

    // construct default Visitor object
    protected Visitor()
    {
    }

    // construct Visitor object with visitPurpose and visitDate values
    protected Visitor(String visitPurpose, java.util.Date visitDate)
    {
        this.visitPurpose = visitPurpose;
        this.visitDate = visitDate;
    }

    // construct Visitor object with visitPurpose, visitDate, name, address, and phone number values
    protected Visitor(String visitPurpose, java.util.Date visitDate, String name, String address, String phoneNumber)
    {
        super(name, address, phoneNumber); // initialize name, address, and phoneNumber variables from the Person object
        this.visitPurpose = visitPurpose;
        this.visitDate = visitDate;
    }

    // get visitPurpose
    public String getVisitPurpose()
    {
        return visitPurpose;
    }

    // set a new visitPurpose
    public void setVisitPurpose(String visitPurpose)
    {
        this.visitPurpose = visitPurpose;
    }

    // get visitDate
    public java.util.Date getVisitDate()
    {
        return visitDate;
    }

    // set a new visitDate
    public void setVisitDate(java.util.Date visitDate)
    {
        this.visitDate = visitDate;
    }

    // override toString method to print class name and data fields of the object
    public String toString()
    {
        return ("\nVisitor object:\n\tName:\t\t" + getName() + "\n\tAddress:\t" + getAddress() + "\n\tPhone#:\t\t" + getPhoneNumber() +
        "\n\tVisit:\t\t" + visitPurpose + "\n\tVisit Date:\t" + visitDate +
        "\n");
    }
}
