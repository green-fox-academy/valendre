package garden;

public class Flower extends Plant {

  public Flower(String color) {
    super(color);
    this.setPercentageOfAbsorb(75);
    this.setMinWater(5);
  }
}
