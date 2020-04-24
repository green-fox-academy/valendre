package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;

public interface FoxInterface {

  public boolean check(String name);

  public Fox get(String name);

  public void add(String name);
}
