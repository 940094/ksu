import java.util.Scanner;

public class StringToInt {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input a string of numbers: ");
    int num = 0;
    do {
      num = Integer.parseInt(input.next());
      System.out.println(num);
    } while (num != 0);
  }
}
