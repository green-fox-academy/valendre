import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
  }

  public static int[] unique(int[] a) {
    int c = 1;
    Arrays.sort(a);
    int[] b = new int[a.length];
    b[0]=a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i - 1] != a[i]) {
        b[c] = a[i];
        c++;

      }
    }
    int d[] = Arrays.copyOfRange(b,0,c);
    System.out.println(Arrays.toString(d));
    return d;
  }

}

