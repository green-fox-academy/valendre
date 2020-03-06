import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {

        int a = 23;

        Scanner s = new Scanner(System.in);
        System.out.println("Guess the number!");
        int b = s.nextInt();
        while (b!=a) {
            if (b<a) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("The stried number is lower");
            }
            b = s.nextInt();
        }
        System.out.println("You found the number: " + a);
    }
}
