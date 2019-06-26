// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 5
// IDE: Atom

public class MyRectangle
{
    public static boolean isValid(double width, double height) // check if rectangle width and height are valid
    {
        if (width + height > 30) // check if sum of width and height is greater than 30
            return true;
        return false;
    }
    public static double Area(double width, double height) // calculate rectangle area
    {
        return width * height; // return area
    }
    public static double Perimeter(double width, double height) // calcyate rectangle perimeter
    {
        return width * 2 + height * 2; // return perimeter
    }
}
