package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  List<Pirate> crew = new ArrayList<>();
  Pirate captain;

  public void fillShip() {
    captain = new Pirate();
    for (int i = 0; i < (int) (Math.random() * 49 + 1); i++) {
      crew.add(new Pirate());
    }
  }

  public String toString() {
    return "Captain consumed " + captain.consumedRum + " rum(s). Captain is " + captain.state + ". "
        + countAlivePirate() + " alive pirates in the crew.";
  }

  public boolean battle(Ship otherShip) {
    boolean win = true;
    if (this.countAlivePirate() - this.captain.consumedRum >
        otherShip.countAlivePirate() - otherShip.captain.consumedRum) {
      this.winnerParty();
      otherShip.losePirates();
      win = true;
    } else {
      this.losePirates();
      otherShip.winnerParty();
      win = false;
    }
    return win;
  }

  public int countAlivePirate() {
    int numberOfAlivePirate = 0;
    for (int i = 0; i < crew.size(); i++) {
      if (crew.get(i).state.equals("alive")) {
        numberOfAlivePirate++;
      }
    }
    return numberOfAlivePirate;
  }

  public void winnerParty() {
    int numberOfRums = (int)(Math.random()*10+1);
    captain.drinkSomeRum(numberOfRums);
      for (int i = 0; i < crew.size(); i++) {
        crew.get(i).drinkSomeRum(numberOfRums);
      }
  }
  public void losePirates() {
    for (int i = 0; i < crew.size(); i++) {
      if (Math.random()>0.5) {
        crew.get(i).die();
      }
    }
  }

}
