package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

  @Test
  public void eatRandomTimes() {
    Animal animal = new Animal();
    int randomTimes = (int) Math.random() * 50;
    for (int i = 0; i < randomTimes; i++) {
      animal.eat();
    }
    assertEquals((long) 50-randomTimes, animal.getHunger());
  }

  @Test
  public void eatTooMuch() {
    Animal animal = new Animal();
    for (int i = 0; i < 100; i++) {
      animal.eat();
    }
    assertEquals((long) 0, animal.getHunger());
  }

  @Test
  public void drinkRandomTimes() {
    Animal animal = new Animal();
    int randomTimes = (int) Math.random() * 50;
    for (int i = 0; i < randomTimes; i++) {
      animal.drink();
    }
    assertEquals((long) 50-randomTimes, animal.getThirst());
  }

  @Test
  public void drinkTooMuch() {
    Animal animal = new Animal();
    for (int i = 0; i < 100; i++) {
      animal.drink();
    }
    assertEquals((long) 0, animal.getThirst());
  }

  @Test
  public void playRandomTimes() {
    Animal animal = new Animal();
    int randomTimes = (int) Math.random() * 50;
    for (int i = 0; i < randomTimes; i++) {
      animal.play();
    }
    assertEquals((long) 50+randomTimes, animal.getHunger());
    assertEquals((long) 50+randomTimes, animal.getThirst());
  }

  @Test
  public void getHunger() {
    Animal animal = new Animal();
    assertEquals((long) animal.hunger, animal.getHunger());

  }

  @Test
  public void getThirst() {
    Animal animal = new Animal();
    assertEquals((long) animal.thirst, animal.getThirst());
  }
}