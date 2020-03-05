public class CodingHours {
    public static void main(String[] args) {

        int DailyCodingHours = 6;
        int SemesterInWeeks = 17;

        int HoursOfCoding = 5*DailyCodingHours*SemesterInWeeks;
        System.out.println("Hours of coding: " + HoursOfCoding);

        float AvarageCodingHours = DailyCodingHours * (float) 5 / 52 * 100;
        System.out.println("Percentage of coding hours: " + AvarageCodingHours);

    }
}
