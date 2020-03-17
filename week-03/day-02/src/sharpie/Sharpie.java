package sharpie;

public class Sharpie {
  String color;
  Float width;
  Float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    this.inkAmount = (float) 100;
  }

  public void use() {
    inkAmount--;
  }
}
