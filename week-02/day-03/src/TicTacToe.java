import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
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
      String[] rows = Files.readString(path).split("\n");

      for (int i = 0; i < 3; i++) {
        if (rows[0].charAt(i) == rows[1].charAt(i) && rows[0].charAt(i) == rows[2].charAt(i)) {
          winnerIs = String.valueOf(rows[0].charAt(i));
        } else if ((rows[i].charAt(0) == rows[i].charAt(1) && rows[i].charAt(0) == rows[i].charAt(2))) {
          winnerIs = String.valueOf(rows[i].charAt(0));
        }
      }
      if (winnerIs.equals("Draw")) {
        if ((rows[0].charAt(0) == rows[1].charAt(1) && rows[0].charAt(0) == rows[2].charAt(2))
            || (rows[0].charAt(2) == rows[1].charAt(1) && rows[1].charAt(1) == rows[2].charAt(0))) {
          winnerIs = String.valueOf(rows[1].charAt(1));
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return winnerIs;
  }
}