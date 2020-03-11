import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  // Write a function that copies the contents of a file into another
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful

  public static void main(String[] args) {
    String path = "WriteMultipleLinesFile.txt";
    System.out.println("Was the copy successful? " + fileCopier(path));

  }

  public static boolean fileCopier(String path) {
    boolean succed = false;
    try {
      Path myPath = Paths.get(path);
      List<String> myLines = Files.readAllLines(myPath);
      Files.write(Paths.get("copiedfile.txt"), myLines);
      succed = true;
    } catch (Exception e) {
      succed = false;
    } finally {
      return succed;
    }

  }
}
