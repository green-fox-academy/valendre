//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("type a number");
    int baseOfFactorial = scanner.nextInt();
    System.out.println(factorio(baseOfFactorial));

  }

  public static double factorio(int baseOfFactorial) {
    double factorial = 1;
    for (int i = 1; i <= baseOfFactorial; i++) {
      factorial *= i;
    }
    return factorial;
  }
}
