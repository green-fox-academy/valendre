import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Your number is: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if ((a%2)==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
