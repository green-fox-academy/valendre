import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {

    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    System.out.println("How many number want you work with?");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a = 0;
    if (n <= 0) {
      System.out.println("Invalid input");
    } else {

      for (int i = 1; i <= n; i++) {
        System.out.println("Type " + i + ". number:");
        a += s.nextInt();
      }
      System.out.println("Sum: " + a + ", Avarage: " + (float) a / n);
    }
  }
}
