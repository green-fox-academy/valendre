import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyFile {
  // Write a function that copies the contents of a file into another
  // It should take the filenames as parameters
  // It should return a boolean that shows if the copy was successful

  public static void main(String[] args) {
    String path = "./textFiles/WriteMultipleLinesFile.txt";
    System.out.println("Was the copy successful? " + fileCopier(path));
  }

  public static boolean fileCopier(String path) {
    boolean succed = false;
    try {
      Files.copy(Paths.get(path), Paths.get("./textFiles/copiedfile.txt"));
      succed = true;
    } catch (Exception e) {
      succed = false;
    } finally {
      return succed;
    }

  }
}
