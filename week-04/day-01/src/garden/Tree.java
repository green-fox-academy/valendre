package garden;

public class Tree extends Plant {
  public Tree(String color) {
    super(color);
    this.setPercentageOfAbsorb(40);
    this.setMinWater(10);
  }
}
