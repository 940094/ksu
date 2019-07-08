// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 10
// IDE: Atom

public class Person
{
    // declare object variables as private
    private String name;
    private String address;
    private String phoneNumber;

    // construct a default Person object
    protected Person()
    {
    }

    // construct a Person object with inputted name, address and phone number
    protected Person(String name, String address, String phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // get a name
    public String getName()
    {
        return name;
    }

    // set a new name
    public void setName(String name)
    {
        this.name = name;
    }

    // get an address
    public String getAddress()
    {
        return address;
    }

    // set a new address
    public void setAddress(String address)
    {
        this.address = address;
    }

    // get a phone number
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    // set a new phone number
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    // override toString method to print class name and data fields of the object
    public String toString()
    {
        return ("\nPerson object:\n\tName:\t\t" + name + "\n\tAddress:\t" + address + "\n\tPhone#:\t\t" + phoneNumber + "\n");
    }
}
