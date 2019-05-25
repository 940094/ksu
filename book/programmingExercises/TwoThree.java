import java.util.Scanner;

public class TwoThree {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a value for feet: ");
    Double feet = input.nextDouble();
    System.out.println(feet + " feet is " + feet * .305 + " meters");
  }
}
