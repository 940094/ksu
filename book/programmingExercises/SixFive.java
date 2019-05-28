import java.util.Scanner;

public class SixFive {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 3 numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();

    if (num1 > num2 && num1 > num3) {
      if (num2 > num3) {
        displaySortedNumbers(num1, num2, num3);
      } else {
        displaySortedNumbers(num1, num3, num2);
      }
    } else if (num2 > num1 && num2 > num3) {
      if (num1 > num3) {
        displaySortedNumbers(num2, num1, num3);
      } else {
        displaySortedNumbers(num2, num3, num1);
      }
    } else {
      if (num1 > num2) {
        displaySortedNumbers(num3, num1, num2);
      } else {
        displaySortedNumbers(num3, num2, num1);
      }
    }
  }
  public static void displaySortedNumbers(double num1, double num2, double num3) {
    System.out.println(num1 + " " + num2 + " " + num3);
  }
}
