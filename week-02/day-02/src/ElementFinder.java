import java.util.*;

public class ElementFinder {
  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(containsSeven(arrayList));
    System.out.println(containsSevenAlt(arrayList));
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!

  }

  public static String containsSeven(ArrayList arraylist) {
    if (arraylist.contains(7)) {
      return "Hoorray";
    } else {
      return "Noooooo";
    }
  }

  public static String containsSevenAlt(ArrayList arrayList) {
    String hoorrayOrNoooo = "Noooooo";
    for (int i = 0; i < arrayList.size(); i++) {
      if (arrayList.get(i).equals(7)) {
        hoorrayOrNoooo = "Hoorray";
      }
    }
    return hoorrayOrNoooo;
  }
}