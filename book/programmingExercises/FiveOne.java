// practicing how to  convert a string to integers manually

import java.util.Scanner;

public class FiveOne {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer, the input ends if it is 0: ");
    String s = input.nextLine();
    // System.out.println(length);

    int left = 0; int right = 0; int positives = 0; int negatives = 0; double positiveSum = 0.0; int negativeSum = 0; String temp = ""; double total = 0;
    while (right < s.length() && right >= 0) {
      right = s.indexOf(' ', left); // get the index of the next space
      if (right < 0) {
        temp = s.substring(left);
      }
      else {
        temp = s.substring(left, right);
      }
      //
      int num = Integer.parseInt(temp.trim()); // convert the string to a number

      if (num == 0) {
        System.out.println("break");
        total++;
        break;
      } else if (num > 0) {
        positives++;
        positiveSum += num;
      }
      else {
        negatives++;
        negativeSum += num;
      }
      left = right + 1;
      total++;
    }


    if (positiveSum + negativeSum == 0) {
      System.out.println("No numbers are entered except 0");
    }
    else {
      System.out.println("The number of positives is " + positives);
      System.out.println("The number of negatives is " + negatives);
      System.out.println("The total is " + total);
      System.out.printf("The average is %3.2f \n", (positiveSum + negativeSum) / (positives + negatives));
    }
  }
}
