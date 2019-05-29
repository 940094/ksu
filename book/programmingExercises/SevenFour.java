import java.util.Scanner;

public class SevenFour {
  public static void main(String[] main) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter scores: ");
    int num;
    int[] scores = new int[100];
    int count = 0;
    int sum = 0;

    do {
      num = input.nextInt();
      scores[count] = num;
      System.out.print(scores[count] + " ");
      if (num >= 0) {
        count++;
        sum += num;
      }
    } while (num >= 0);

    analyzeScores(scores, count, sum);
  }
  public static void analyzeScores(int[] scores, int count, int sum) {
    System.out.println("\navg: " + sum/count);
    int avg = sum/count;
    int aboveAverageCount = 0; int belowAverageCount = 0;

    for (int i = 0; i < count; i++) {
      if (scores[i] >= avg) aboveAverageCount++;
      else belowAverageCount++;
    }
    System.out.println("at or above Avg: " + aboveAverageCount);
    System.out.println("below Avg: " + belowAverageCount);
  }
}
