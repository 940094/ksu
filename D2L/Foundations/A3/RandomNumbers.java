// Class: CS 5000
// Term: Summer 2019
// Name: Justin Shaw
// Instructor: Dr. Haddad
// Assignment: 3
// IDE: Atom

public class RandomNumbers
{
  public static void main(String[] args) // program main method
  {
    // Part A: Print a random integer number between 15 and 45 (inclusive).
    System.out.println("a) A random integer between 15 and 45 (inclusive):\t" + (15 + (int)(Math.random() * (30 + 1))));

    // Part B: Print a random integer number between -20 and 50 (inclusive).
    System.out.println("b) A random integer between -20 and 50 (inclusive):\t" + (-20 + (int)(Math.random() * (70 + 1))));

    // Part C: Print a random integer number between -10 and -70 (inclusive).
    System.out.println("c) A random integer between -10 and -70 (inclusive):\t" + (-70 + (int)(Math.random() * (60 + 1))));

    // Part D: Print a random floating-point number between 0.0 and 29.9999 (inclusive).
    System.out.printf("d) A random float between 0.0 and 29.9999 (inclusive):\t%11.10f\n", (float)(Math.random() * 30));
  }
}
