package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class FoxListService implements FoxInterface{
  private List<Fox> foxes = new ArrayList<>();

  @Override
  public boolean check(String name) {
    Optional<String> optionalName= foxes.stream().map(fox -> fox.getName())
        .findFirst();
    if (optionalName.isPresent()) {
      return true;
    }
    return false;
  }

  @Override
  public Fox get(String name) {
    Optional<Fox> optionalFox = foxes.stream()
        .filter(fox -> fox.getName().equals(name))
        .findFirst();
    return optionalFox.orElseGet(() -> new Fox(name));
  }

  @Override
  public void add(String name) {
    if (!this.check(name)) {
      foxes.add(new Fox(name));
    }
  }

}
