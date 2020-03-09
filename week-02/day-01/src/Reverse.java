import java.util.Arrays;
import java.util.Collections;

public class Reverse {
  // - Create an array variable named `numbers`
  //   with the following content: `[3, 4, 5, 6, 7]`
  // - Reverse the order of the elements in `numbers`
  // - Print the elements of the reversed `numbers`
  public static void main(String[] args) {
    Integer[] numbers = {3, 4, 5, 6, 7};
    Arrays.sort(numbers, Collections.reverseOrder());
    System.out.println(Arrays.toString(numbers));
  }
}
