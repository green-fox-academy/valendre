import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // By writing your name into it as a single line
    // The file should be named "my-file.txt"
    // In case the program is unable to write the file,
    // It should print the following error message: "Unable to write file: my-file.txt"

    String name = "Endi";
    fileManipulator(name);
  }

  public static void fileManipulator(String name) {
    try {
      Files.writeString(Paths.get("./textFiles/my-file.txt"), name);
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}