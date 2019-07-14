// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 12
// IDE: Atom

import java.util.*; // import java.util classes

public class Vowels
{
    private String s; // declare private String variable s

    public Vowels() // create default constructor
    {
    }

    public Vowels(String s) // create Vowels object with s value
    {
        setS(s);
    }

    public String getS() // getter method to return String variable s, which is user inputted String
    {
        return s;
    }

    // setter to initiate s variable as user inputted string
    public void setS(String s) throws InputMismatchException
    {
        if (s.length() == 0)
            throw new InputMismatchException("Length must be greater than 0."); // throw exception is user inputted string is 0
        this.s = s;
    }

    public int countVowels(String s) // recursive countVowels method
    {
        return countVowels(s.toLowerCase(), 0); // call helper method and pass it a lowercase string and an index of zero
    }

    public int countVowels(String s, int index) // helper method
    {
        if (s.length() == index) return 0; // base case to end recursion
        else if (!(s.charAt(index) == 'a' || s.charAt(index) == 'e' || s.charAt(index) == 'i' || s.charAt(index) == 'o' || s.charAt(index) == 'u'))
            return 0 + countVowels(s, index + 1); // return 0 and continue recursion if no vowel
        else
            return 1 + countVowels(s, index + 1); // return 1 and continue recursion if there is a vowel
    }

    public static void main(String[] args) // program main method
    {
        String again = "Y";
        while (again.equals("y") || again.equals("Y")) // sentinel loop to prompt user to re-run program
        {
            // create Vowels object
            Vowels myVowels = new Vowels();

            // get user inputted string
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a string to count vowels (e.g., world): "); // print prompt for user to enter a string
            while(true) // validate user input
            {
                try
                {
                    myVowels.setS(input.nextLine()); // call setter method to set myVowels variable s
                    break;
                }
                catch (InputMismatchException e)
                {
                    System.out.print("Please enter a string to count vowels (e.g., world): "); // print prompt for user to enter a string
                    continue;
                }
            }

            // print results of count Vowels;
            System.out.println("Entered string:\t\t" + myVowels.getS()); // call method getS in object myVowels to print user inputted string
            System.out.print("Number of vowels:\t");
            System.out.println(myVowels.countVowels(myVowels.getS())); // call method countVowels in object myVowels to print count of vowels

            // prompt user to re-run program
            System.out.print("Do you want to re-run program(Y/N)? ");
            again = input.next();
            System.out.println();
        }
    }
}
