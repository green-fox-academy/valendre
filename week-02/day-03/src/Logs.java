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
      System.out.println("unique IP adresses");
      String[] uniqueIpArray = uniqueIPfunction(messages.toArray(new String[0]));
      System.out.println(Arrays.toString(uniqueIpArray));
      float ratio = getPostRatio(messages.toArray(new String[0]));
      float getPercentage = ratio / (1 + ratio) * 100;
      float postPercentage = 1 / (1 + ratio) * 100;
      System.out.println("the GET " + getPercentage + "% / POST request " + postPercentage + "%, ratio " + ratio);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static String[] uniqueIPfunction(String... args) {
    List<String> messages = new ArrayList<>();
    for (String message : args) {
      messages.add(message);
    }
    List<String> uniqueIP = new ArrayList<>();
    for (String message : messages) {
      String[] pieces = message.split(" ");
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
      messages.add(message);
    }
    int numberOfGet = 0;
    int numberOfPost = 0;
    float ratio;
    for (String message : messages) {
      String[] pieces = message.split(" ");
      if (pieces[11].equals("GET")) {
        numberOfGet++;
      } else if (pieces[11].equals("POST")) {
        numberOfPost++;
      }
    }
    ratio = (float) numberOfGet / (float) numberOfPost;
    return ratio;
  }
}