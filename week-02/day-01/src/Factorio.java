//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
import java.util.Scanner;

public class Factorio {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("type a number");
    int a = s.nextInt();
    System.out.println(factorio(a));

  }
  public static double factorio (int a) {
    double b=1;
    for (int i = 1; i <=a ; i++) {
      b*=i;
    }
    return b;
  }
}
