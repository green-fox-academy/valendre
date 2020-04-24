package com.greenfoxacademy.programmerfoxclub.models;

import java.util.Arrays;
import java.util.List;

public class Tricks {

  private static List<String> trickList = Arrays.asList("code in java", "write HTML", "jump", "run");

  public static List<String> getTrickList() {
    return trickList;
  }
}
