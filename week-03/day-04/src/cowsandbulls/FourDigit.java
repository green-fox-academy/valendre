package cowsandbulls;

import java.util.HashMap;

public class FourDigit {
  HashMap<Integer, Integer> fourDigit;

  public FourDigit() {
    for (int i = 1; i <= 4; i++) {
      this.fourDigit.put(i, (int) (Math.random() * 10));
    }
  }

  public FourDigit(String rawNumber) {
    for (int i = 0; i < 4; i++) {
      String subStr = rawNumber.substring(i, i + 1);
      int num = Integer.parseInt(subStr);
      this.fourDigit.put(i + 1, num);
    }
  }

  public int getValue(int key) {
    return this.fourDigit.get(key);
  }

  public void remove(int key) {
    this.fourDigit.remove(key);
  }

  public void removeByValue(int value) {
    for (int i = 1; i <= 4; i++) {
      if (this.fourDigit.get(i)==value) {
        this.fourDigit.remove(i);
        break;
      }
    }
  }

  public String toString(FourDigit fourDigit) {
    String strToReturn="";
    for (int i = 1; i <= 4; i++) {
      strToReturn+=fourDigit.getValue(i);
    }
    return strToReturn;
  }
}
