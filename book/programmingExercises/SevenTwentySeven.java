import java.util.Scanner;
import java.util.Arrays;

public class SevenTwentySeven {
  public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    System.out.print("Please enter array 1: ");
    int[] list1 = read();
    System.out.print("Please enter array 2: ");
    int[] list2 = read();
    if (equals(list1, list2)) System.out.println("Two lists are identical");
    else System.out.println("Two lists are not identical");
  }
  public static boolean equals(int[] list1, int[] list2) {
    Arrays.sort(list1);
    Arrays.sort(list2);
    return Arrays.equals(list1, list2);
  }
  public static int[] read() {
    Scanner input = new Scanner(System.in);
    int length = input.nextInt();
    int[] list = new int[length];
    for (int i = 0; i < length; i++) {
      list[i] = input.nextInt();
    }
    return list;
  }
}
