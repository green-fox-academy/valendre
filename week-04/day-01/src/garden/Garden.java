package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> garden;

  public Garden() {
    this.garden = new ArrayList<>();
  }

  public void add(Plant plant) {
    this.garden.add(plant);
  }

  public void wateringPlants(float amountWater) {
    System.out.println("Watering with " + (int) amountWater);
    int numberOfThirstyPlants = 0;
    for (int i = 0; i < this.garden.size(); i++) {
      if (this.garden.get(i).minWater > this.garden.get(i).waterAmount) {
        numberOfThirstyPlants++;
      }
    }
    for (int i = 0; i < this.garden.size(); i++) {
      if (this.garden.get(i).minWater > this.garden.get(i).waterAmount) {
        this.garden.get(i).watering(amountWater / numberOfThirstyPlants);
      }
      this.garden.get(i).printInfo();
    }
    System.out.println();
  }

  public void printGardenInfo() {
    for (int i = 0; i < this.garden.size(); i++) {
      this.garden.get(i).printInfo();
    }
    System.out.println();
  }
}

