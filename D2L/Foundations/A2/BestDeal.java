// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 2
// IDE: Atom

import java.util.Scanner; // import Scanner class

public class BestDeal
{
  public static void main(String[] args) // program main method
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter small box weight (pounds): "); // prompt user for small box weight
    double smallBoxWeight = input.nextDouble();
    System.out.print("Please enter small box price (dollars): "); // prompt user for small box price
    double smallBoxPrice = input.nextDouble();
    System.out.print("Please enter large box weight (pounds): "); // prompt user for large box weight
    double largeBoxWeight = input.nextDouble();
    System.out.print("Please enter small box price (dollars): "); // prompt user for large box price
    double largeBoxPrice = input.nextDouble();

    double smallPricePerPound = smallBoxPrice / smallBoxWeight; // calculate small box price per pound
    double largePricePerPound = largeBoxPrice / largeBoxWeight; // calculate large box price per pound

    System.out.println("Small box weight:\t" + (int)smallBoxWeight + " Pounds"); // print small box weight
    System.out.println("Small box price:\t" + (int)smallBoxPrice + " Dollars"); // print small box price
    System.out.println("Large box weight:\t" + (int)largeBoxWeight + " Pounds"); // print large box weight
    System.out.println("Large box price:\t" + (int)largeBoxPrice + " Dollars"); // print large box price

    if (smallPricePerPound == largePricePerPound) // if boxes' price per pound are equal
      System.out.println("Judgment:\t\t" + "Both boxes are of the same value"); // print both boxes are equal value
    else if (smallPricePerPound > largePricePerPound)
      System.out.println("Judgment:\t\t" + "The large box is a better deal"); // print large box is better deal
    else
      System.out.println("Judgment:\t\t" + "The smaller box is a better deal"); // print small box is better deal
  }
}
