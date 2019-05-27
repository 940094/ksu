import java.util.Scanner;

public class ThreeFive {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter today's day: ");
    int todayNum = input.nextInt() % 7;
    System.out.print("Enter the number of days elapsed since today: ");
    int futureDayNum = (input.nextInt() + todayNum) % 7;
    String today = "";
    String futureDay = "";

    if (futureDayNum == 0) {
      futureDay = "Sunday";
    } else if (futureDayNum == 1) {
          futureDay = "Monday";
    } else if (futureDayNum == 2) {
          futureDay = "Tuesday";
    } else if (futureDayNum == 3) {
          futureDay = "Wednesday";
    } else if (futureDayNum == 4) {
          futureDay = "Thursday";
    } else if (futureDayNum == 5) {
          futureDay = "Friday";
    } else if (futureDayNum == 6) {
          futureDay = "Saturday";
    }

    if (todayNum == 0) {
      today = "Sunday";
    } else if (todayNum == 1) {
          today = "Monday";
    } else if (todayNum == 2) {
          today = "Tuesday";
    } else if (todayNum == 3) {
          today = "Wednesday";
    } else if (todayNum == 4) {
          today = "Thursday";
    } else if (todayNum == 5) {
          today = "Friday";
    } else if (todayNum == 6) {
          today = "Saturday";
    }




    System.out.println("Today is " + today + " and the future day is " + futureDay);
  }
}
