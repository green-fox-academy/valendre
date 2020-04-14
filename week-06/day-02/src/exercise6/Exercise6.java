package exercise6;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise6 {
  public static void main(String[] args) {

    String myString = "AbCdEfG";

    List<Character> uppercaseletters = myString.chars()
        .mapToObj(character -> (char)character)
        .filter(Character::isUpperCase)
        .collect(Collectors.toList());

    System.out.println(uppercaseletters);
  }
}
