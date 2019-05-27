import java.util.Scanner;

public class FourFourteen {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter grade: ");
    char letter = input.nextLine().charAt(0);

    if (letter >= 65 && letter <= 69) {
      System.out.println("The numeric value for grade " + letter + " is " + Math.abs(letter - 69));// return number
    } else {
      System.out.println(letter + " is an invalid grade");
    }
  }
}
