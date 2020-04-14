package exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Write a Stream Expression to find the foxes with green color!
Write a Stream Expression to find the foxes with green color, and age less then 5 years!
Write a Stream Expression to find the frequency of foxes by color!
 */
public class Exercise10 {
  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<Fox>();
    foxes.add(new Fox("vetulus", "green", 1));
    foxes.add(new Fox("arctic", "white", 8));
    foxes.add(new Fox("vulpes", "red", 4));

    List<Fox> greenFoxes = foxes.stream()
        .filter(fox -> fox.color == "green")
        .collect(Collectors.toList());

    List<Fox> youngGreens = foxes.stream()
        .filter(fox -> fox.color == "green" && fox.age < 5)
        .collect(Collectors.toList());

    Map<String, Long> foxColorFrequencies = foxes.stream()
        .collect(Collectors.groupingBy(fox -> fox.color, Collectors.counting()));

    System.out.println(foxColorFrequencies);
  }
}
