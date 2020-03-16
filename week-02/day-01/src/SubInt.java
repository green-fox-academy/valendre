import java.util.Arrays;

public class SubInt {
  public static void main(String[] args) {
    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array

    //  Example:
    System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    //  should print: '[]'
  }

  public static int[] subInt(int searchFor, int[] arrayToSearchIn) {

    int lengthOfNewArray = 0;
    int[] newArray = new int[arrayToSearchIn.length];
    for (int i = 0; i < arrayToSearchIn.length; i++) {
      String uj = Integer.toString(searchFor);
      String in = Integer.toString(arrayToSearchIn[i]);
      if (in.contains(uj)) {
        newArray[lengthOfNewArray] = i;
        lengthOfNewArray++;
      }
    }
    int[] reArray = Arrays.copyOfRange(newArray, 0, lengthOfNewArray);
    System.out.println(Arrays.toString(reArray));
    return reArray;
  }
}