package com.greenfoxacademy.workshopweek09day01.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import org.thymeleaf.expression.Lists;

public class ArrayHandling {
  private String what;
  private int[] numbers;

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public ResultInt getResult() {
    if (this.what.equals("sum")) {
      return new ResultInt(Arrays.stream(numbers).sum());
    } else if (this.what.equals("multiply")) {

      return new ResultInt(Arrays.stream(numbers).reduce(1, ( int a, int b ) -> a * b));
    }
    return null;
  }

  public ResultArray getResultArray() {
    if (this.what.equals("double")) {
      if (this.what.equals("double")) {
        return new ResultArray(Arrays.stream(numbers).map(number -> number*2).toArray());
      }
    }
    return null;
  }
}
