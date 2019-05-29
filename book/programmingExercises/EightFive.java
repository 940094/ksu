import java.util.Scanner;
import java.util.Arrays;

public class EightFive {
  public static void main(String[] args) {
    System.out.print("Enter matrix1: ");
    double[][] m1 = read(); //1 2 3 4 5 6 7 8 9
    System.out.print("Enter matrix2: ");
    double[][] m2 = read(); //0 2 4 1 4.5 2.2 1.1 4.3 5.2
    System.out.println("The matrices are added as follows: ");
    print(m1, m2);
  }
  public static double[][] read() {
    Scanner input = new Scanner(System.in);
    double[][] m = new double[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        m[i][j] = input.nextDouble();
      }
    }
    return m;
  }
  public static void print(double[][] m1, double[][] m2) {
    for (int i = 0; i < m1.length; i++) {
      // print a line of matrix 1
      for (int j = 0; j < m1[0].length; j++) {
        System.out.print(m1[i][j] + " ");
      }
      if (i != 1) System.out.print("       ");
      else System.out.print("   +   ");

      // print a line of matrix 2
      for (int j = 0; j < m2[0].length; j++) {
        System.out.print(m2[i][j] + " ");
      }
      if (i != 1) System.out.print("       ");
      else System.out.print("   =   ");

      // print a line of sumMatrix
      for (int j = 0; j < m2[0].length; j++) {
        System.out.print((m1[i][j] + m2[i][j]) + " ");
      }

      // new line
      System.out.println("");
    }

  }
}
