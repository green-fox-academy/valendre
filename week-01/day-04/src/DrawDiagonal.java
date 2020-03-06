import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Type a number");
    int a = s.nextInt();
    String b = "";
    for (int i = 1; i <= a; i++) {
      b = "";
      for (int j = 1; j <= a; j++) {
        if ((i == 1) || (i == a) || (j == 1) || (j == a) || (i + (a - j) == a)) {
          b += "%";
        } else {
          b += " ";
        }
      }
      System.out.println(b);
    }
  }
}

