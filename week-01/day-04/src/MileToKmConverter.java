import java.util.Locale;
import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.println("Please add distance in miles: ");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);;
        double miles = scanner.nextDouble();

        double km = miles *1.609344;

        System.out.println("Distance is " + km +" km");


    }
}
