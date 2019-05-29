import java.util.Scanner;

public class EightOne {
  public static void main(String[] args) {
    double[][] m = new double[3][4];
    System.out.print("Enter a 3x4 matrix row by row: \n");
    for (int i = 0; i < m.length; i++) {
      m[i] = read();
    }
    for (int i = 0; i < m[0].length; i++) {
      System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));
    }
  }
  public static double sumColumn(double[][] m, int columnIndex) {
    double sum = 0;
    for (int i = 0; i < m.length; i++) {
      sum += m[i][columnIndex];
    }
    return sum;
  }
  public static double[] read() {
    Scanner input = new Scanner(System.in);
    double[] arr = new double[4];
    for (int i = 0; i < 4; i++) {
      arr[i] = input.nextDouble();
    }
    return arr;
  }
}
