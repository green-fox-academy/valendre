package sharpieset;

import java.util.ArrayList;
import java.util.List;
import sharpie.Sharpie;

public class SharpieSet {
  List<Sharpie> listOfSharpies = new ArrayList<>();
  int numberOfUsable;

  public void countUsable() {
    numberOfUsable = 0;
    for (Sharpie sharpieToCount : listOfSharpies) {
      if (sharpieToCount.inkAmount > 0) {
        numberOfUsable++;
      }
    }
  }

  public void removeTrash() {
    for (int i = 0; i < listOfSharpies.size(); i++) {
      if (listOfSharpies.get(i).inkAmount == 0) {
        listOfSharpies.remove(i);
        i--;
      }
    }
  }
}

