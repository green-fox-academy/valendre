package com.greenfoxacademy.workshop.greenfoxclassapp.services;

import java.util.List;

public interface StudentInterface {

  public List<String> findAll();

  public void save(String student);

  public int count();

  public String check(String name);
}

