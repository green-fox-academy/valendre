package sharpie;

public class Sharpie {
  public String color;
  public Float width;
  public Float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    this.inkAmount = (float) 100;
  }

  public void use() {
    inkAmount--;
  }
}
