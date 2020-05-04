package com.greenfoxacademy.workshopweek09day01.domain;

public class DoUntil {
  private int result;

  public DoUntil(String operator, int until) {
    if (operator.equals("sum")) {
      result = 0;
      for (int i = 1; i <= until; i++) {
        result += i;
      }
    } else if (operator.equals("factor")) {
      result = 1;
      for (int i = 1; i <= until; i++) {
        result *= i;
      }
    }
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
