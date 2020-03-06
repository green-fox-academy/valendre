import java.util.Scanner;
public class DrawDiamondSecondTime {
  public static void main(String[] args) {
    System.out.println("Type a number");
    Scanner s = new Scanner(System.in);
    int e = s.nextInt();
    String b = "#";
    String c = " ";
    for (int i = 1; i <= e; i++) {
      if (e/2 >= i) {
        System.out.println(c.repeat(e - i-(e/2)) + b.repeat(i * 2 - 1));
      } else  {
        System.out.println(c.repeat(i - 1-(e/2)) + b.repeat((e - i)* 2 + 1 ));
      }
    }
  }
}