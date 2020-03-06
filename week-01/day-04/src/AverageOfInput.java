import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = 0;
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Type " + i + ". number:");
            a+= scanner.nextInt();
        }

        System.out.println("Sum: " + a + ", avarage: " + (float)a/5);

    }
}
