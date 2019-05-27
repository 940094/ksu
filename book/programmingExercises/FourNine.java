import java.util.Scanner;

public class FourNine {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char letter = input.nextLine().charAt(0); //stores "E" and then gets 'E'
    System.out.println(letter);
    int num = (int)letter;
    System.out.println("The Unicode for the character " + letter + " is " + num);
  }
}
