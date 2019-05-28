// import java.util.Scanner;

public class SixThirty {
  public static void main(String[] args) {
    int sum = roll();
    if (sum == 11 || sum == 7) {
      System.out.println("You win");
    } else if (sum == 2 || sum == 3 || sum == 12) {
      System.out.println("You lose");
    } else {
      System.out.println("point is " + sum);
      int secondRoll;
      do {
        secondRoll = roll();
        if (secondRoll == 7) {
          System.out.println("You lose");
          break;
        }
        else if (secondRoll == sum) {
          System.out.println("You win");
          break;
        }
      } while (secondRoll != 7);
    }
  }
  public static int roll() {
    int num1 = (int)(Math.random() * 6) + 1;
    int num2 = (int)(Math.random() * 6) + 1;
    int sum = num1 + num2;
    System.out.println("Your rolled " + num1 + " + " + num2 + " = " + sum);
    return sum;
  }
}
