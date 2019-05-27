import java.util.Scanner; // allow user to input

public class FourTwentyOne {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a SSN: ");
    String s = input.nextLine();

    if (s.charAt(3) == '-' && s.charAt(6) == '-' && s.length() == 11) {
      System.out.println(s + " is a valid SSN");
    } else {
      System.out.println(s + " is an invalid SSN");
    }
  }
}

// read the string

// validate the format of the string: 3 numbers, a dash, 2 numbers, a dash, 4 numbers
