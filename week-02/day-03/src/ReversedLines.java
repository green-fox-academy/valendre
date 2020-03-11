import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt

    reverseLines();


  }

  public static void reverseLines() {
    try {
      Path oldPath = Paths.get("reversed-lines.txt");
      List<String> oldLines = Files.readAllLines(oldPath);
      List<String> newLines = new ArrayList<>();
      for (String oldLine: oldLines) {
        String newLine ="";
        for (int i = oldLine.length()-1; i >=0 ; i--) {
          newLine+=oldLine.charAt(i);
        }
        newLines.add(newLine);
      }
      Files.write(Paths.get("not-reversed-lines.txt"), newLines);
    } catch (Exception e) {
      e.printStackTrace();

    }
  }
}