import java.util.Arrays;

public class ChangeElement {
  // - Create an array variable named `numbers`
  //   with the following content: `[1, 2, 3, 8, 5, 6]`
  // - Change the 8 to 4
  // - Print the fourth element
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 8, 5, 6};
    Arrays.sort(numbers);
    int a = Arrays.binarySearch(numbers, 8);
    numbers[a] = 4;
    Arrays.sort(numbers);
    System.out.println(numbers[3]);

  }
}
