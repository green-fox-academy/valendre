package flyable;

public class Helicopter extends Vehicle implements Flyable {

  @Override
  public void land() {
    System.out.println("Helicopter landing.");
  }

  @Override
  public void fly() {
    System.out.println("Helicopter flies.");
  }

  @Override
  public void takeOff() {
    System.out.println("Helicopter takes off.");
  }
}
