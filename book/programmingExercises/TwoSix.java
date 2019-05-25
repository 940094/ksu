import java.util.Scanner;

public class TwoSix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 0 and 1000: ");
    int num = input.nextInt();
    int one = num % 10;
    int two = (num / 10) % 10;
    int three = num / 100;
    int sum = one + two + three;
    System.out.println("The sum of the digits is " + sum);
  }
}
