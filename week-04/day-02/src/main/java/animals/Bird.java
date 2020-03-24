package main.java.animals;

import flyable.Flyable;

public class Bird extends EggLayer implements Flyable {
  public Bird(String name) {
    super(name);
  }

  @Override
  public void land() {
    System.out.println("Bird lands.");
  }

  @Override
  public void fly() {
    System.out.println("Bird flies.");

  }

  @Override
  public void takeOff() {
    System.out.println("Bird takes off");
  }
}
