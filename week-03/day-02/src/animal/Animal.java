package animal;

public class Animal {
  public int hunger;
  int thirst;

  public Animal() {
    this(50, 50);
  }

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public void eat() {
    this.hunger--;
    if (hunger < 0) {
      this.hunger = 0;
    }
  }

  public void drink() {
    this.thirst--;
    if (this.thirst<0) {
      this.thirst=0;
    }
  }

  public void play() {
    this.hunger++;
    this.thirst++;
  }

  public int getHunger() {
    return this.hunger;
  }
  public int getThirst(){
    return this.thirst;
  }
}
