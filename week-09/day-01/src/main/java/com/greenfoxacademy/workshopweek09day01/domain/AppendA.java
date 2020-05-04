package com.greenfoxacademy.workshopweek09day01.domain;

public class AppendA {
  private String appended;

  public AppendA(String input) {
    this.appended = input +"a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
