package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FoxListService implements FoxInterface{
  private List<Fox> foxes = new ArrayList<>();

  @Override
  public boolean check(String name) {
    if (foxes.contains(name)) {
      return true;
    }
    return false;
  }


}
