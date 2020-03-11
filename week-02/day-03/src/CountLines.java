import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {

    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    String fileName = "it_isnt_exist.txt";
    System.out.println(lineCounter(fileName));

  }
  public static int lineCounter(String fileName) {
    int numberOfLines =1;
    try {
      Path pathOfFile = Paths.get(fileName);
      List<String> linesOfFile = Files.readAllLines(pathOfFile);
      numberOfLines = linesOfFile.size();
    } catch (IOException e) {
      numberOfLines=0;
    } finally {
      return numberOfLines;
    }
  }
}
