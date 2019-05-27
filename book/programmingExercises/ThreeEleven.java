import java.util.Scanner;

public class ThreeEleven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a month and year, both integers: ");
    int month = input.nextInt();
    int year = input.nextInt();
    int days = 0;

    if (month == 2) {
      if (year % 4 == 0) { //if leap year
        days = 29;
        }
      else {
        days = 28;
      }
    } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8  || month == 10  || month == 12) {
      days = 31;
    }
    else {
      days = 30;
    }

    System.out.println("There were " + days + " days in " + month + "/" + year);
  }
}

// ask for month and year
// store month and year
// find the number of days in a month given the year - library/api?
// print the value
