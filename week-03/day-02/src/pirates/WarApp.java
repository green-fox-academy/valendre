package pirates;

public class WarApp {
  public static void main(String[] args) {
    Armada firstArmada = new Armada();
    Armada secondArmada = new Armada();
    if (firstArmada.war(secondArmada)) {
      System.out.println("First Armada wins");
    } else {
      System.out.println("Second Armada wins");
    }

  }

}
