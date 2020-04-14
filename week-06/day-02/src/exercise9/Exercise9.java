package exercise9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    String exampleString = "aaabbcqwerrrrrrtt";

    Map<String, Long> counterMap = new HashMap<>();

    Map<String, Long> characterFrequency = Arrays.stream(exampleString.split(""))
        .collect(Collectors.groupingBy(character -> character, Collectors.counting()));

    System.out.println(characterFrequency);
  }

}
