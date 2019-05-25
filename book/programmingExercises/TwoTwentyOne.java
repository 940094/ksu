import java.util.Scanner;

public class TwoTwentyOne {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter investment amount: ");
    double investmentAmount = input.nextDouble();
    System.out.print("Enter annual interest rate in percentage: ");
    double annualInterestRate = input.nextDouble();
    System.out.print("Enter number of years: ");
    int numberOfYears = input.nextInt();
    double futureInvestmentValue = investmentAmount * Math.pow(
                                  (1 + annualInterestRate / 12.0 / 100),
                                  (numberOfYears * 12));
    System.out.println("Accumulated value is $" + futureInvestmentValue);
  }
}
