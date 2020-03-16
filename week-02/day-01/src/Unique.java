import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
  }

  public static int[] unique(int[] oldArray) {
    int lengthOfNewArray = 1;
    Arrays.sort(oldArray);
    int[] newArray = new int[oldArray.length];
    newArray[0] = oldArray[0];
    for (int i = 1; i < oldArray.length; i++) {
      if (oldArray[i - 1] != oldArray[i]) {
        newArray[lengthOfNewArray] = oldArray[i];
        lengthOfNewArray++;
      }
    }
    int d[] = Arrays.copyOfRange(newArray, 0, lengthOfNewArray);
    System.out.println(Arrays.toString(d));
    return d;
  }
}

