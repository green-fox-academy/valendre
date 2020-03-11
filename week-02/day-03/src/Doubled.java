import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    decryptDuplicatedChars();
  }

  public static void decryptDuplicatedChars() {
    try {
      Path path = Paths.get("duplicated-chars.txt");
      List<String> oldLines = Files.readAllLines(path);
      List<String> newLines = new ArrayList<>();
      for (String line : oldLines) {
        String newLine = "";
        for (int i = 0; i < line.length()-1; i+=2) {
          newLine+=line.charAt(i);
          if(line.charAt(i) != line.charAt(i+1)) {
            newLine+=line.charAt(i+1);
          }
        }

        newLines.add(newLine);
      }
      Files.write(Paths.get("not_duplicated_anymore.txt"), newLines);
    } catch (IOException e) {
      System.out.println("IOException \n" + e);
    }
  }
}