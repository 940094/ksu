import java.util.Scanner;

public class TwoFive {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the subtotal and a gratuity rate: ");
    Double subtotal = input.nextDouble(); //10.0
    Double gratuityRate = input.nextDouble(); // 15.0
    Double gratuity = subtotal * gratuityRate / 100; // 10.0 * 15.0
    Double total = subtotal + gratuity; // 10.0 + 1.5
    System.out.println("The gratuity is $" + gratuity + " and the total is $" + total );
  }
}
