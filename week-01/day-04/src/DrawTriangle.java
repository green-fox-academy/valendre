import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number");
        int a = scanner.nextInt();
        String b="";
        for (int i = 1; i <= a; i++) {
            b+="*";
            System.out.println(b);
        }
    }
}
