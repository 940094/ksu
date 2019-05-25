import java.util.Scanner;

public class TwoThirteen {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the monthly saving amount: ");
    double monthlySavings = input.nextDouble();
    double month1 = monthlySavings * (1 + 0.00417);
    double month2 = (monthlySavings + month1) * (1 + 0.00417);
    double month3 = (monthlySavings + month2) * (1 + 0.00417);
    double month4 = (monthlySavings + month3) * (1 + 0.00417);
    double month5 = (monthlySavings + month4) * (1 + 0.00417);
    double month6 = (monthlySavings + month5) * (1 + 0.00417);
    System.out.println("After the sixth month, the account value is $" + month6);
  }
}
