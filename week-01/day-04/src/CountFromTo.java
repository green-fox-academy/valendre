import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        int a = scanner.nextInt();
        System.out.println("Second number:");
        int b = scanner.nextInt();
        if (a>=b) {
            System.out.println("The second number should be bigger");
        } else {

            for (int i = a; i < b; i++) {
                System.out.println(i);

            }
        }
    }

}
