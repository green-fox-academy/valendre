import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Lottery {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv

    String fileName = "./textFiles/Lottery.csv";
    findFiveMostCommon(fileName);
  }

  public static int[][] findFiveMostCommon(String fileName) {
    Path csvPath = Paths.get(fileName);
    List<String> rows;
    HashMap<Integer, Integer> numberCounter = new HashMap<>();
    int[][] mostCommonNumbers = {{0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}};
    try {
      rows = Files.readAllLines(csvPath);
    } catch (IOException e) {
      e.printStackTrace();
      return mostCommonNumbers;
    }

    for (String row : rows) {
      for (int i = 0; i < 5; i++) {
        try {
          int numberToCount = Integer.parseInt(row.split(";")[11 + i]);
          if (!(numberCounter.containsKey(numberToCount))) {
            numberCounter.put(numberToCount, 1);
          } else {
            numberCounter.replace(numberToCount, numberCounter.get(numberToCount) + 1);
          }
        } catch (NumberFormatException e) {
          continue;
        }
      }
    }

    for (int number : numberCounter.keySet()) {
      for (int i = 0; i < 4; i++) {
        if (numberCounter.get(number) > mostCommonNumbers[i][1]) {
          for (int j = 3; j >= i; j--) {
            mostCommonNumbers[j + 1][0] = mostCommonNumbers[j][0];
            mostCommonNumbers[j + 1][1] = mostCommonNumbers[j][1];
          }
          mostCommonNumbers[i][0] = number;
          mostCommonNumbers[i][1] = numberCounter.get(number);
          break;
        }
      }
    }

    for (int i = 0; i < 5; i++) {
      System.out.println(mostCommonNumbers[i][0] + ", " + mostCommonNumbers[i][1]);
    }


    return mostCommonNumbers;
  }
}