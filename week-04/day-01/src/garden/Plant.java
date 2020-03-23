package garden;

public class Plant {
  protected String color;
  protected float waterAmount;
  protected int percentageOfAbsorb;
  protected float minWater;

  public Plant(String color) {
    this.color = color;
    this.waterAmount = 0;
  }

  public void watering(float water) {
    this.waterAmount = this.waterAmount + (float) this.percentageOfAbsorb / 100 * water;
  }

  public void printInfo() {
    System.out.println("The " + this.color + " " + getClass().getSimpleName() +
        (minWater > waterAmount ? "" : " doesnt") + " need water.");
  }
}
