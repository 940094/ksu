import java.util.Scanner;

public class TwoEight {
  public static void main(String[] args){
    long totalMilliseconds = System.currentTimeMillis(); // Obtain the total seconds since midnight, Jan 1, 1970 7 l
    long totalSeconds = totalMilliseconds / 1000;
    long currentSecond = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    long currentMinute = totalMinutes % 60;
    long totalHours = totalMinutes / 60;
    long currentHour = totalHours % 24;
    System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the time zone offset to GMT: ");
    int offset = input.nextInt();
    currentHour = currentHour + offset;
    System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
  }
}
