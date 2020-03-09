// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

public class Sum {
  public static void main(String[] args) {
    int number = 10;
    System.out.println(sum(number));
  }

  public static int sum(int a) {
    int b = 0;
    boolean n = false;
    if (a < 0) {
      n = true;
      a *= -1;
    }
    for (int i = 0; i <= a; i++) {
      b += i;
    }
    if (n) {
      b *= -1;
    }
    return b;

  }

}
