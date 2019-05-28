import java.util.Scanner;

public class SixTwo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a series of integers: ");
    System.out.println(sumDigits(input.nextLong()));
  }

  public static int sumDigits(long n) {
    int len = (n + "").length();
    int sum = 0;
    for (int i = 0; i < len; i++) { //does a long have the length() method?
      sum += n % 10;
      n = n / 10;
    }
    return sum;
  }
}
