package farm;

public class Main {
  public static void main(String[] args) {
    Farm myFarm = new Farm();
    myFarm.slots= 10;
    myFarm.breed();
    for (int i = 0; i < myFarm.slots*10; i++) {
      myFarm.listOfAnimals.get((int)(Math.random()*myFarm.listOfAnimals.size())).drink();
      myFarm.listOfAnimals.get((int)(Math.random()*myFarm.listOfAnimals.size())).eat();
      myFarm.listOfAnimals.get((int)(Math.random()*myFarm.listOfAnimals.size())).play();
    }
    myFarm.slaughter();
  }
}
