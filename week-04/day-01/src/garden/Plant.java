package garden;

public class Plant {
  private String color;
  private float waterAmount;
  private int percentageOfAbsorb;
  private float minWater;

  public Plant(String color) {
    this.color = color;
    this.waterAmount = 0;
  }

  public void setPercentageOfAbsorb(int percentageofAbsorb) {
    this.percentageOfAbsorb = percentageofAbsorb;
  }

  public void setMinWater(float minWater) {
    this.minWater = minWater;
  }

  private void setWaterAmount(float waterAmount) {
    this.waterAmount = waterAmount;
  }

  public void watering(float water) {
    this.setWaterAmount(this.getWaterAmount() + (float) this.percentageOfAbsorb / 100 * water);
  }

  public void printInfo() {
    System.out.println("The " + this.color + " " + getClass().getSimpleName() +
        (minWater > waterAmount ? "" : " doesnt") + " need water.");
  }

  public float getMinWater() {
    return minWater;
  }

  public float getWaterAmount() {
    return waterAmount;
  }
}
