package pirates;

public class BattleApp {
  public static void main(String[] args) {
    Ship firstShip = new Ship();
    Ship secondShip = new Ship();
    firstShip.fillShip();
    secondShip.fillShip();
    System.out.println(firstShip.toString());
    System.out.println(secondShip.toString());
    if (firstShip.battle(secondShip)) {
      System.out.println("first ship won.");
    } else {
      System.out.println("second ship won");
    }
    System.out.println(firstShip.toString());
    System.out.println(secondShip.toString());
  }
}
