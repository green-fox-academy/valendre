import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    System.out.println("What is your name? ");
    Scanner scanner = new Scanner(System.in);
    String yourName = scanner.nextLine();
    System.out.println("Hello " + yourName + "!");
  }
}
