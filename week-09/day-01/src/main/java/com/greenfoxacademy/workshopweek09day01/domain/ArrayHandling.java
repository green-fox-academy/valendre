package com.greenfoxacademy.workshopweek09day01.domain;

import java.util.Arrays;

public class ArrayHandling {
  private String what;
  private Integer[] numbers;

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public Integer[] getNumbers() {
    return numbers;
  }

  public void setNumbers(Integer[] numbers) {
    this.numbers = numbers;
  }

  public ResultInt getResult() {
    if (this.what.equals("sum")) {
      return new ResultInt(Arrays.stream(numbers).mapToInt(Integer::intValue).sum());
    } else if (this.what.equals("multiply")) {

      return new ResultInt(Arrays.stream(numbers).reduce(1, (Integer a, Integer b) -> a * b));
    }
    return null;
  }

  public ResultArray getResultArray() {
    if (this.what.equals("double")) {
      if (this.what.equals("double")) {
        return new ResultArray(Arrays.stream(numbers).mapToInt(Integer::intValue)
            .map(number -> number * 2).toArray());
      }
    }
    return null;
  }
}
