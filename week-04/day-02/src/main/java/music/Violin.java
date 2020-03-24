package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    this(4);
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
    this.name = "Electric Guitar";
  }

  @Override
  public String sound() {
    return "Screech";
  }

}
