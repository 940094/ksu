public class OneEleven {
  public static void main(String[] args) {
    double secondsInYear = 365 * 24 * 60 * 60.0; // 1000 seconds/year
    double pop2019 = 312_032_486;
    double pop2020 = pop2019 + (secondsInYear / 7) + (secondsInYear / 13) + (secondsInYear / 45);
    double pop2021 = pop2020 + (secondsInYear / 7) + (secondsInYear / 13) + (secondsInYear / 45);
    System.out.println(pop2020);
    System.out.println(pop2021);
  }
}
