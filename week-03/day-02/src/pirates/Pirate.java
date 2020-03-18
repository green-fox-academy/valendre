package pirates;

public class Pirate {
  String state;
  int consumedRum;
  boolean hasParrot;

  public Pirate() {
    state = "alive";
    consumedRum = 0;
    hasParrot = false;
  }

  public void drinkSomeRum() {
    drinkSomeRum(1);
  }

  public void drinkSomeRum(int numberOfRums) {
    drinkRumExact(numberOfRums);
  }

  private void drinkRumExact(int numBerOfRums) {
    if (state.equals("alive")) {
      consumedRum += numBerOfRums;
    } else if (state.equals("dead")) {
      printHeIsDead();
    }
  }

  public void howsItGoingMate() {
    if (state.equals("alive")) {
      if (consumedRum > 0) {
        System.out.println("Pour me anudder!".repeat((int) (Math.random() * 5)));
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        state = "passed out";
      }
    } else if (state.equals("dead")) {
      printHeIsDead();
    }
  }

  public void die() {
    state = "dead";
  }

  public void brawl(Pirate anotherPirate) {
    if (this.state.equals("alive")) {
      if (anotherPirate.equals("alive")) {
        switch ((int) (Math.random() * 2 + 1)) {
          case 0:
            this.die();
            break;
          case 1:
            anotherPirate.die();
            break;
          case 2:
            this.state = "passed out";
            anotherPirate.state = "passed out";
            break;
        }
      }
    } else {
      printHeIsDead();
    }
  }

  public void printHeIsDead() {
    if (state.equals("dead")) {
      System.out.println("he's dead");
    }
  }

  public void addParrot() {
    hasParrot = true;
  }
}
