// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 8
// IDE: Atom

public class Rectangle // program Rectangle class
{
    // declare and initialize class variables as private
    private double width = 1.0;
    private double height = 1.0;

    // no-argument constructor
    public Rectangle()
    {
    }

    // constructor with width and heigh arguments
    public Rectangle(double width, double height)
    {
        this.width = width; // set instance of width variable to width argument
        this.height = height; // set instance of height variable to height argument
    }

    // getter method for width variable
    public double getWidth()
    {
        return width;
    }

    // getter method for height variable
    public double getHeight()
    {
        return height;
    }

    // method to return rectangle area
    public double getArea()
    {
        return width * height;
    }

    // method to return rectangle perimeter
    public double getPerimeter()
    {
        return width * 2 + height * 2; // calculate perimeter of rectangle
    }

    // method to return width and height of rectangle as a string
    public String toString()
    {
        width = Math.round(width); // round width variable
        height = Math.round(height); // round height variable

        // print width and height of unit, adjusting language for single widths and heights
        if (width <= 1 && height <= 1)
            return ((int)width + " unit wide and " + (int)height + " unit high.");
        else if (width <= 1)
            return ((int)width + " unit wide and " + (int)height + " units high.");
        else if (height <= 1)
            return ((int)width + " units wide and " + (int)height + " unit high.");
        else
            return ((int)width + " units wide and " + (int)height + " units high.");
    }
}
