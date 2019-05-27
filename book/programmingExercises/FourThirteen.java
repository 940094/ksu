import java.util.Scanner;

public class FourThirteen {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    String s = input.nextLine();
    char letter = s.toUpperCase().charAt(0);

    // char letter = s.toUpperCase();
    if (letter > 'Z' || letter < 'A') {
      System.out.println(s + " is an invalid input");
    }
    else if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
      System.out.println(s + " is a vowel");
    }
    else {
      System.out.println(s + " is a consonant");
    }
  }
}
