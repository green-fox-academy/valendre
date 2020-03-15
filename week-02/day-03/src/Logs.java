import java.io.IOException;
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
      Path path = Paths.get("./textFiles/log.txt");
      List<String> messages = Files.readAllLines(path);
      System.out.println("unique IP adresses");
      String[] uniqueIpArray = uniqueIPfunction(messages.toArray(new String[0]));
      System.out.println(Arrays.toString(uniqueIpArray));
      float ratio = getPostRatio(messages.toArray(new String[0]));
      float getPercentage = ratio / (1 + ratio) * 100;
      float postPercentage = 1 / (1 + ratio) * 100;
      System.out.println("the GET " + getPercentage + "% / POST request " + postPercentage + "%, ratio " + ratio);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public static String[] uniqueIPfunction(String... args) {
    List<String> uniqueIPs = new ArrayList<>();
    for (String message : args) {
      String[] pieces = message.split(" ");
      if (!uniqueIPs.contains(pieces[8])) {
        uniqueIPs.add(pieces[8]);
      }
    }
    return uniqueIPs.toArray(new String[uniqueIPs.size()]);

  }

  public static float getPostRatio(String... args) {
    int numberOfGet = 0;
    int numberOfPost = 0;
    for (String message : args) {
      String[] pieces = message.split(" ");
      if (pieces[11].equals("GET")) {
        numberOfGet++;
      } else if (pieces[11].equals("POST")) {
        numberOfPost++;
      }
    }
    return  (float) numberOfGet / (float) numberOfPost;
  }
}