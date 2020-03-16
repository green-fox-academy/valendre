import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // If someone has no pair, he/she should be the element of the list too
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
    ArrayList<String> matchesList = new ArrayList<>();
    int maxLengthOfArray;
    if (girls.size() > boys.size()) {
      maxLengthOfArray = girls.size();
    } else {
      maxLengthOfArray = boys.size();
    }
    for (int i = 0; i < maxLengthOfArray; i++) {
      if (i < girls.size()) {
        matchesList.add(girls.get(i));
      }
      if (i<boys.size()) {
        matchesList.add(boys.get(i));
      }
    }
    return matchesList;
  }
}