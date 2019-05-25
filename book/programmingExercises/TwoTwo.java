import java.util.Scanner;

public class TwoTwo {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius and length of a cylinder: ");
    double radius = input.nextDouble();
    double length = input.nextDouble();
    double PI = 3.14159265359;
    double area = radius * radius * PI; //.1
    double volume = area * length; //.1
    System.out.println("The area is " + area);
    System.out.println("The volume is " + volume);
  }
}
