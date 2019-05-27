import java.util.Scanner;

public class FourEight {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("The number for ASCII code: ");
    int asciCode = input.nextInt();
    char letter = (char)asciCode;
    System.out.println("The character for ASCII code " + asciCode + " is " + letter);
  }
}
