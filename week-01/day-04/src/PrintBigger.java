import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        int a = scanner.nextInt();

        System.out.println("Second number:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
