package pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> shipsOfArmada = new ArrayList<>();

  public Armada() {
    for (int i = 0; i < (int)Math.random()*20+40; i++) {
      shipsOfArmada.add(new Ship());
      shipsOfArmada.get(i).fillShip();
    }
  }

  public boolean war(Armada otherArmada) {
    int indexOfThisArmada = 0;
    int indexOfOtherArmada = 0;
    boolean thiswin = false;
    while (this.shipsOfArmada.size()-indexOfThisArmada>0 && otherArmada.shipsOfArmada.size()-indexOfOtherArmada>0) {
      if (this.shipsOfArmada.get(indexOfThisArmada).battle(otherArmada.shipsOfArmada.get(indexOfOtherArmada))) {
        indexOfOtherArmada++;
      } else {
        indexOfThisArmada++;
      }
    }
    if (this.shipsOfArmada.size()-indexOfThisArmada>0) {
      thiswin = true;
    }
    return thiswin;
  }


}
