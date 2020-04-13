package aircraftcarrier;

import java.awt.desktop.FilesEvent;
import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class Carrier {
  private List<Aircraft> aircrafts;
  private int storedAmmo;
  private int healthPoint;
  private Exception NoAmoException;

  public Carrier(int initialAmmo, int healthPoints) {
    this.storedAmmo = initialAmmo;
    this.healthPoint = healthPoints;
  }

  public int getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }

  public void add(Aircraft aircraft) {
    this.aircrafts.add(aircraft);
  }

  public void fill() throws Exception {
    if (this.storedAmmo == 0) {
      throw NoAmoException;
    }
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < aircrafts.size(); j++) {
        if ((j==0 && aircrafts.get(j).isPriority()) || (j==1 && !aircrafts.get(j).isPriority())) {
          if (this.storedAmmo >= (aircrafts.get(j).getMaxAmmo() - aircrafts.get(j).getAmmunition())) {
            aircrafts.get(j).setAmmunition(aircrafts.get(j).getMaxAmmo());
            this.storedAmmo -= (aircrafts.get(j).getMaxAmmo() - aircrafts.get(j).getAmmunition();
          } else {
            aircrafts.get(j).ammunition += this.storedAmmo;
            this.storedAmmo = 0;
            break;
          }
        }
      }
    }
  }

  private void fight(Carrier anotherCarrier) {
    for (int i = 0; i < this.aircrafts.size(); i++) {
      Files.

    }

  }

  /*

fight
It should take another carrier as a reference parameter and fire all the ammo from the aircrafts to it, then subtract all the damage from its health points
getStatus
It should return a string about itself and all of its aircrafts' statuses in the following format:

HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
Aircrafts:
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
If the health points are 0 then it should return: It's dead Jim :(
   */
}
