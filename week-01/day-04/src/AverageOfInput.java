import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        System.out.println("First number:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("second number:");
        int b = scanner.nextInt();

        System.out.println("Third number:");
        int c = scanner.nextInt();

        System.out.println("Fourth number:");
        int d = scanner.nextInt();

        System.out.println("Fifth number:");
        int e = scanner.nextInt();

        int sum = a + b + c + d + e;
        int avarage = sum/5;

        System.out.println("Sum: " + sum + ", avarage: " + avarage);

    }
}
