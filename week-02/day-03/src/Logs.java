import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
  // Read all data from 'log.txt'.
  // Each line represents a log message from a web server
  // Write a function that returns an array with the unique IP adresses.
  // Write a function that returns the GET / POST request ratio.

  public static void main(String[] args) {
    try {
      Path path = Paths.get("log.txt");
      List<String> messages = Files.readAllLines(path);
      uniqueIPfunction(messages);
      getPostRatio(messages);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static String[] uniqueIPfunction(String... args) {
    List<String> messages = new ArrayList<>();
    for (String message : args) {
      messages.add(message)
    }
    List<String> uniqueIP = new ArrayList<>();
    for (String message : messages) {
      System.out.println(message);
      String[] pieces = message.split(" ");
      System.out.println(Arrays.toString(pieces));

      if (uniqueIP.contains(pieces[8])) {
      } else {
        uniqueIP.add(pieces[8]);
      }
    }
    String[] arrayToReturn = new String[uniqueIP.size()];
    arrayToReturn = uniqueIP.toArray(arrayToReturn);
    return arrayToReturn;

  }

  public static float getPostRatio(String... args) {
    List<String> messages = new ArrayList<>();
    for (String message : args) {
      messages.add(message)
    }
    int numberOfGet = 0;
    int numberOfPost = 0;
    float ratio;
    for (String message : messages) {
      System.out.println(message);
      String[] pieces = message.split(" ");
      System.out.println(Arrays.toString(pieces));
      if (pieces[11].equals("GET")) {
        numberOfGet++;
      } else if (pieces[11].equals("POST")) {
        numberOfPost++;
      }
    }
    ratio = numberOfGet / numberOfPost;
    return ratio;
  }
}
