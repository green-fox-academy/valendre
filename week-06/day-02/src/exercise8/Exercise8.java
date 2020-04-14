package exercise8;

import java.util.Arrays;
import java.util.List;

public class Exercise8 {
  public static void main(String[] args) {

    List<Character> characters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g');

    StringBuilder charactersToString = new StringBuilder();
    characters.stream()
        .forEach(charactersToString::append);

    System.out.println(charactersToString);


  }
}
