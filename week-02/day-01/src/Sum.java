// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

public class Sum {
  public static void main(String[] args) {
    int number = 10;
    System.out.println(sum(number));
  }

  public static int sum(int highestNumToSum) {
    int sumOfNums = 0;
    boolean negative = false;
    if (highestNumToSum < 0) {
      negative = true;
      highestNumToSum *= -1;
    }
    for (int i = 0; i <= highestNumToSum; i++) {
      sumOfNums += i;
    }
    if (negative) {
      sumOfNums *= -1;
    }
    return sumOfNums;
  }

}
