package sum;

import java.util.ArrayList;

public class Sum {

  public int sum(ArrayList<Integer> numbersToSum) {
    if (numbersToSum == null) {
      return 0;
    }
    int sumInt = 0;
    for (int number : numbersToSum) {
      sumInt += number;
    }
    return sumInt;
  }
}
