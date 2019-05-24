public class OneEight {
  public static void main(String[] args) {
    final double radius = 5.5;
    final double PI = 4 * (1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);
    double perimeter = 2 * radius * PI;
    double area = radius * radius * PI;
    System.out.println(perimeter);
    System.out.println(area);
  }
}
