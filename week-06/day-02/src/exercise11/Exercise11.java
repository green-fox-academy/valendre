package exercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise11 {
  public static void main(String[] args) {
    try {
      Map<String, Long> wordFrequencies =
          Arrays.asList(Files.lines(Paths.get("text/randomwiki.txt"))
              .collect(Collectors.joining(" "))
              .replace(".", " ")
              .replace(",", " ")
              .replace("-", " ")
              .replace("–", " ")
              .replace("_", " ")
              .replace("(", " ")
              .replace(")", " ")
              .replace("/", " ")
              .replace("[", " ")
              .replace("]", " ")
              .replace("  ", " ")
              .split(" "))
              .stream()
              .filter(string -> string != "")
              .collect(Collectors.groupingBy(word -> new String(word), Collectors.counting()))
              .entrySet()
              .stream()
              .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
              .limit(100)
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                  (oldValue, newValue) -> oldValue, LinkedHashMap::new));

      System.out.println(wordFrequencies.toString());

    } catch (IOException e) {
      System.out.println("Can't read the file!");
    }

  }
}
