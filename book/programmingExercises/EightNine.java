import java.util.Scanner;
import java.util.Arrays;

public class EightNine {
  public static void main(String[] args) {
    String[][] board = {
      {" ", " ", " "},
      {" ", " ", " "},
      {" ", " ", " "},
    };
    String player;
    int i = 0;
    while (!draw(board) && !win(board)) {
      player = "X";
      if (i % 2 != 0) player = "O";
      i++;
      turn(board, player);

    }
  }
  public static void move(String[][] board, int row, int column, String player) {
    board[row][column] = player;

  }
  public static boolean win(String[][] board) {
    if (
      (board[0][0] == "X" && board[0][1]  == "X" &&  board[0][2] == "X") ||
      (board[0][0] == "O" && board[0][1]  == "O" &&  board[0][2] == "O") ||
      (board[1][0] == "X" && board[1][1]  == "X" &&  board[1][2] == "X") ||
      (board[1][0] == "O" && board[1][1]  == "O" &&  board[1][2] == "O") ||
      (board[2][0] == "X" && board[2][1]  == "X" &&  board[2][2] == "X") ||
      (board[2][0] == "O" && board[2][1]  == "O" &&  board[2][2] == "O") ||
      (board[0][0] == "X" && board[1][0]  == "X" &&  board[2][0] == "X") ||
      (board[0][0] == "O" && board[1][0]  == "O" &&  board[2][0] == "O") ||
      (board[0][1] == "X" && board[1][1]  == "X" &&  board[2][1] == "X") ||
      (board[0][1] == "O" && board[1][1]  == "O" &&  board[2][1] == "O") ||
      (board[0][2] == "X" && board[1][2]  == "X" &&  board[2][2] == "X") ||
      (board[0][2] == "O" && board[1][2]  == "O" &&  board[2][2] == "O") ||
      (board[0][0] == "X" && board[1][1]  == "X" &&  board[2][2] == "X") ||
      (board[0][0] == "O" && board[1][1]  == "O" &&  board[2][2] == "O") ||
      (board[0][2] == "X" && board[1][1]  == "X" &&  board[2][0] == "X") ||
      (board[0][2] == "O" && board[1][1]  == "O" &&  board[2][0] == "O")) {
      System.out.println("Winner!");
      return true;
    }
    return false;
  }
  public static boolean draw(String[][] board) {
    if (Arrays.asList(board[0]).contains(" ")) return false; // https://stackoverflow.com/questions/1128723/how-do-i-determine-whether-an-array-contains-a-particular-value-in-java
    else if (Arrays.asList(board[1]).contains(" ")) return false;
    else if (Arrays.asList(board[2]).contains(" ")) return false;
    else return true;
  }
  public static void turn(String[][] board, String player) {
    Scanner input = new Scanner(System.in);
    int column;
    int row;
    do {
      System.out.printf("-------------\n| %s | %s | %s |\n-------------\n| %s | %s | %s |\n-------------\n| %s | %s | %s |\n-------------\n", board[0][0], board[0][1], board[0][2], board[1][0], board[1][1], board[1][2], board[2][0], board[2][1], board[2][2]);
      System.out.printf("Enter a row (0, 1, or 2) for player %s: ", player);
      row = input.nextInt();
      System.out.printf("Enter a column (0, 1, or 2) for player %s: ", player);
      column = input.nextInt();
    } while (!legal(board, row, column));

    move(board, row, column, player);
  }
  public static boolean legal(String[][] board, int row, int column) {
    if (row > 2 || row < 0 || column > 2 || column < 0 || board[row][column] == "X" || board[row][column] == "O") {
      System.out.print("Illegal move!");
      return false;
    } else {
      return true;
    }
  }
}
