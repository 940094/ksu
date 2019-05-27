import java.util.Scanner;

public class FourEleven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // check to make sure the input is between 0 - 15
    System.out.print("Enter a decimal value (0 to 15): ");
    int num = input.nextInt(); //store input as int

    if (num <= 9) {
      System.out.println("The hex value is " + num);
    }
    else if (num > 9 && num <= 15 ) {
      System.out.println("The hex value is " + (char)((num - 10) + 'A'));
    }
    else {
      System.out.println(num + " is an invalid input");
    }
  }
}
