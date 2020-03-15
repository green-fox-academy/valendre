import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {

    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    System.out.println(lineCounter("./textFiles/it_isnt_exist.txt"));
    System.out.println(lineCounter("./textFiles/duplicated-chars.txt"));
  }

  public static int lineCounter(String fileName) {
    try {
      return Files.readAllLines(Paths.get(fileName)).size();
    } catch (IOException e) {
      return 0;
    }
  }
}
