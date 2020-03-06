import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    System.out.println("Type a number!");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    String b = "";
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= a; j++) {
        if ((j == 1) || (j == a) || (i == 1) || (i == a)) {
          b += "#";
        } else {
          b += " ";
        }
      }
      System.out.println(b);
      b = "";
    }
  }
}
