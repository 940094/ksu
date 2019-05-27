import java.util.Scanner;

public class ThreeEight {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter three numbers: ");
    int one = input.nextInt();
    int two = input.nextInt();
    int three = input.nextInt();

    if (one > two && one > three) {
      if (two > three) {
        System.out.println(one + " " + two + " " + three);
      }
      else {
        System.out.println(one + " " + three + " " + two);
      }
    }
    else if (two > one && two > three) {
      if (one > three) {
        System.out.println(two + " " + one + " " + three);
      }
      else {
        System.out.println(two + " " + three + " " + one);
      }
    }
    else {
      if (one > two) {
        System.out.println(three + " " + one + " " + two);
      }
      else {
        System.out.println(three + " " + two + " " + one);
      }
    };
  }
}
