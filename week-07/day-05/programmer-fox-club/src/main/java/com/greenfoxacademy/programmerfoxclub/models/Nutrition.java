package com.greenfoxacademy.programmerfoxclub.models;

import java.util.Arrays;
import java.util.List;

public class Nutrition {
  private static List<String> foodList = Arrays.asList("salad", "burger", "pizza", "kebab");
  private static List<String> drinkList = Arrays.asList("water", "lemonade", "coke", "beer");

  public static List<String> getFoodList() {
    return foodList;
  }

  public static List<String> getDrinkList() {
    return drinkList;
  }
}

