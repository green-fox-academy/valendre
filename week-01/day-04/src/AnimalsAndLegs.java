import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        System.out.println("the number of chickens the farmer has:");
        Scanner scanner = new Scanner(System.in);
        int chicken = scanner.nextInt();
        System.out.println("the number of pigs owned by the farmer:");
        int pig = scanner.nextInt();
        int legs = chicken * 2 + pig * 4;

        System.out.println("Legs: " + legs);


    }
}
