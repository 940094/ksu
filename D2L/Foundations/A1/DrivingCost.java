// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 1
// IDE: Atom

import java.util.Scanner; // import the Scanner class

public class DrivingCost
{
  public static void main(String[] args) // program main method
  {
    Scanner input = new Scanner(System.in);

    System.out.print("\nPlease enter the distance to drive (miles): "); // get distance from user
    double distanceToDrive = input.nextDouble();
    System.out.print("Please enter the fuel efficiency (mpg): "); // get fuel efficiency from user
    double fuelEfficiency = input.nextDouble();
    System.out.print("Please enter the price per gallon (dollars): "); // get price per gallon from user
    double pricePerGallon = input.nextDouble();

    double tripCost = distanceToDrive / fuelEfficiency * pricePerGallon; // calculate trip cost

    System.out.println("\nThe distance (miles):\t\t" + distanceToDrive); // print distance
    System.out.println("Fuel efficiency (mpg):\t\t" + fuelEfficiency); // print fuel efficiency
    System.out.printf("Price per gallon (dollars):\t$%1.2f\n", pricePerGallon); // print price per gallon
    System.out.printf("The trip cost (dollars):\t$%1.2f\n", tripCost); // I could not get the suggestion from the book (Listing 2.8) to work in every edge case so I used printf
  }
}
