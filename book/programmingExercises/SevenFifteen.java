import java.util.Scanner;
import java.util.Arrays;

public class SevenFifteen {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter ten numbers: ");
    int[] arr = new int[11];

    for (int i = 0; i < 10; i++) {
      arr[i] = input.nextInt();
    }
    printArray(eliminateDuplicates(arr));
  }

  public static int[] eliminateDuplicates(int[] list) {
    Arrays.sort(list); // sort the array
    int i = 0; int index = 0;
    int[] duplicatesRemoved = new int[list.length];
    while (i < list.length - 1) {
      if (list[i] == list[i + 1] && i == list.length - 2) {
        duplicatesRemoved[index] = list[i];
        i++;
      }
      else if (list[i] == list[i + 1]) { // check if list[0] == list[1]
        i++;
      }
      else {
        duplicatesRemoved[index] = list[i];
        index++;
        i++;
      }
        // if so add to new array
        // increment counter
    }
    return duplicatesRemoved; // dummy value
  }

  public static void printArray(int[] list) {
    for (int i = 0; i < 10; i++) {
      if (list[i] != 0) System.out.print(list[i] + " ");
    }
    System.out.println("");
  }
}
