// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 10
// IDE: Atom

public class Triangle extends GeometricObject
{
    // declare private side variables
    private double side1;
    private double side2;
    private double side3;

    // construct generic Triangle object
    public Triangle()
    {
        this(1.0, 1.0, 1.0);
    }

    // construct Triangle object that takes side1, side2, and side3 values
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // construct Triangle object that takes side1, side2, side3, color, and filled variables
    public Triangle(double side1, double side2, double side3, String color, boolean filled)
    {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // get Side1 value
    public double getSide1()
    {
        return side1;
    }

    // get Side2 value
    public double getSide2()
    {
        return side2;
    }

    // get Side3 value
    public double getSide3()
    {
        return side3;
    }

    // set new Side1 value
    public void setSide1(double side1)
    {
        this.side1 = side1;
    }

    // set new Side2 value
    public void setSide2(double side2)
    {
        this.side2 = side2;
    }

    // set new Side3 value
    public void setSide3(double side3)
    {
        this.side3 = side3;
    }

    // calculate and return value for area of triangle
    public double getArea()
    {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    // calculate and return value for perimeter of triangle
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }

    // return String of Triangle object values
    public String toString()
    {
        return ("\nSide 1:\t\t" + side1 + "\nSide 2:\t\t" + side2 + "\nSide 3:\t\t" + side3
         + "\nArea:\t\t" + getArea() + "\nPerimeter:\t" + getPerimeter()  + "\nColor:\t\t" + super.getColor() + "\nIs Filled:\t" + super.isFilled());
    }

    // return String of Triangle object values given a name argument
    public String toString(String name)
    {
        return ("\nTriangle:\t" + name + "\nSide 1:\t\t" + side1 + "\nSide 2:\t\t" + side2 + "\nSide 3:\t\t" + side3
         + "\nArea:\t\t" + getArea() + "\nPerimeter:\t" + getPerimeter()  + "\nColor:\t\t" + super.getColor() + "\nIs Filled:\t" + super.isFilled()
         + "\nDate Created:\t" + super.getDateCreated());
    }
}
