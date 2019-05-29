import java.util.Scanner;

public class SevenTwo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter 10 integers: ");
    int[] sourceArray = new int[10];

    for (int i = 0; i < 10; i++) {
      sourceArray[i] = input.nextInt();
    }
    for (int i = 9; i >= 0; i--) {
      System.out.print(sourceArray[i] + " ");
    }
    System.out.println("");
  }
}
