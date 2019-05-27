import java.util.Scanner;

public class FiveEight {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number of students: ");
    int numberOfStudents = input.nextInt();

    int count = 0; double highestGrade = 0; String studentName = "";
    while (count < numberOfStudents) {
      System.out.print("Please enter the next student's name and grade: ");
      String tempName = input.next();
      //System.out.print("Please enter the student's grade: ");
      int tempGrade = input.nextInt();

      if (tempGrade > highestGrade) {
        highestGrade = tempGrade;
        studentName = tempName;
      }
      count++;
    }

    System.out.println(studentName + " is the student with the highest grade with a " + highestGrade);
  }
}
