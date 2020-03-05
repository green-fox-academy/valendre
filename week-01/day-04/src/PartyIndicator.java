import java.util.Scanner;
public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of girls:");
        int g = scanner.nextInt();
        System.out.println("number of boys");
        int b = scanner.nextInt();

        if ((g==b) && (g+b>=20)) {
            System.out.println("The party is excellent!");
        } else if (g+b>=20){
            System.out.println("Quite cool party!");
        } else {
            System.out.println("Average party...");
        }
        if (g==0) {
            System.out.println("Sausage party");
        }

    }
}
