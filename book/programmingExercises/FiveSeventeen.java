import java.util.Scanner;

public class FiveSeventeen {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter # of lines: ");
    int lines = input.nextInt();

    String nums = "1";
    for (int i = 1; i <= lines; i++) {
      for (int j = 0; j < lines - i; j++) {
        System.out.print(" ");
      }
      System.out.print(nums);
      for (int j = 0; j <= lines - i; j++) {
        System.out.print(" ");
      }
      nums = (i + 1) + nums + (i + 1);
      System.out.print("\n");

    }
  }
}
