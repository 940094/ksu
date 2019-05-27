import java.util.Scanner;

public class ThreeTwo {
  public static void main(String[] args) {
    int one = (int)(100 * Math.random());
    int two = (int)(100 * Math.random());
    int three = (int)(100 * Math.random());
    int sum = one + two + three;
    System.out.println("What is the sum of " + one + " " + two + " and " + three + " ?");
    Scanner input = new Scanner(System.in);
    int answer = input.nextInt();
    System.out.println(one + " + " + two + " + " + three + " = " + answer + " is " + (answer == sum));
    if (answer == sum) {
      System.out.println("Nice work!");
    } else {
      System.out.println("Sorry, that's not right!");
    };
  }
}
