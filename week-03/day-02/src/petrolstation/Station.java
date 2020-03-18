package petrolstation;

public class Station {
  float gasAmount;



  public void refill(Car car) {
    this.gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }
}
