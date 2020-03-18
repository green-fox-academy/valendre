package petrolstation;

public class Main {
  public static void main(String[] args) {
    Station smallGasStation = new Station();
    smallGasStation.gasAmount = 1000;

    Car suzuki = new Car();

    smallGasStation.refill(suzuki);
  }
}
