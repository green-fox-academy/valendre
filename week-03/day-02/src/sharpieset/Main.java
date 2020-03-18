package sharpieset;

import sharpie.Sharpie;

public class Main {
  public static void main(String[] args) {
    SharpieSet mySharpies = new SharpieSet();
    mySharpies.listOfSharpies.add(new Sharpie("Green", 20));
    mySharpies.listOfSharpies.add(new Sharpie("Yellow", 18));
    mySharpies.listOfSharpies.add(new Sharpie("Pink", 25));
    mySharpies.listOfSharpies.add(new Sharpie("Blue", 25));

    for (int i = 0; i < 100; i++) {
      mySharpies.listOfSharpies.get(2).use();
    }
    mySharpies.removeTrash();
    mySharpies.countUsable();
  }
}
