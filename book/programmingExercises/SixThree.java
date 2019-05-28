import java.util.Scanner;

public class SixThree {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a number: ");
    int num = input.nextInt();
    System.out.println("Number is Palindrome? " + isPalindrome(num));
  }

  public static int reverse(int number) {
    String s = number + "";
    String reversed = "";
    int len = s.length();
    for (int i = 0; i < len; i++) {
      reversed += number % 10; // append last digit to reversed
      number = number / 10; // remove last digit from s
    }
    return Integer.parseInt(reversed);
  }

  public static boolean isPalindrome(int number) {
    return reverse(number) == number;
  }
}
