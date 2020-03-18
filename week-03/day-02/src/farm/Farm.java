package farm;

import animal.Animal;
import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> listOfAnimals;
  int slots;

  public Farm() {
    this.listOfAnimals= new ArrayList<>();
  }

  public void breed() {
    while (slots > listOfAnimals.size()) {
      listOfAnimals.add(new Animal());
    }
  }

  public void slaughter() {
    int valueOfLeastHungry = listOfAnimals.get(0).getHunger();
    int indexOfLeastHungry = 0;
    for (int i = 1; i < listOfAnimals.size(); i++) {
      if (listOfAnimals.get(i).hunger < valueOfLeastHungry) {
        valueOfLeastHungry = listOfAnimals.get(i).getHunger();
        indexOfLeastHungry = i;
      }
    }
    listOfAnimals.remove(indexOfLeastHungry);
  }

}
