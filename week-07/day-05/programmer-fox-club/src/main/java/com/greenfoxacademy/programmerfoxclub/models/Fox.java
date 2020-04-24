package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> tricks;
  private String food, drink;

  public Fox(String name) {
    this.name = name;
    this.tricks = new ArrayList<>();
    this.food = Nutrition.getFoodList().get(0);
    this.drink = Nutrition.getDrinkList().get(0);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void addTrick(String trick) {
    if (!this.tricks.contains(trick)) {
      this.tricks.add(trick);
    }
  }
}
