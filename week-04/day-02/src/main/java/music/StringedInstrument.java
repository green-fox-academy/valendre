package main.java.music;

public abstract class StringedInstrument extends Instruments{
  int numberOfStrings;

  public StringedInstrument(int numberOfStrings){
    this.numberOfStrings = numberOfStrings;
  }

  public abstract String sound();

  public void play() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}
