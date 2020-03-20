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
    if (inkAmount < 0) {
      inkAmount = (float)0;
    }
  }

  public void use(float timesOfUse) {
    if (inkAmount < timesOfUse) {
      inkAmount = (float)0;
    } else {
      inkAmount -= timesOfUse;
    }
  }

  public Float getInkAmount() {
    return inkAmount;
  }
}
