import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file

    System.out.println(ticTacResult("win-o.txt"));
    // Should print "O"

    System.out.println(ticTacResult("win-x.txt"));
    // Should print "X"

    System.out.println(ticTacResult("draw.txt"));
    // Should print "Draw"
  }

  public static String ticTacResult(String filename) {

    String winnerIs = "Draw";
    try {



      Path path = Paths.get(filename);
      List<String> rowsList = Files.readAllLines(path);
      String[] rows = rowsList.toArray(new String[0]);
      char[][] square = new char[3][3];
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          square[i][j] = rows[i].charAt(j);
        }
      }
      for (int i = 0; i < 3; i++) {
        if (square[0][i] == square[1][i] && square[0][i] == square[2][i]) {
          winnerIs = String.valueOf(square[0][i]);
        } else if (square[i][0] == square[i][1] && square[i][0] == square[i][2]) {
          winnerIs = String.valueOf(square[i][0]);
        }
      }
      if (winnerIs.equals("Draw")) {
        if (square[0][0] == square[1][1] && square[0][0] == square[2][2]) {
          winnerIs = String.valueOf(square[0][0]);
        } else if (square[2][0] == square[1][1] && square[2][0] == square[0][2]) {
          winnerIs = String.valueOf(square[2][0]);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return winnerIs;

  }
}