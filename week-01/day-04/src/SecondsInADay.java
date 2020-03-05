public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 49;
        int currentSeconds = 42;

        System.out.println((24 * 60 * 60)-((( (currentHours * 60) + currentMinutes) * 60 ) + currentSeconds));
    }
}
