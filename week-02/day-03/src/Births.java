import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Births {
  public static void main(String[] args) {
    // Create a function that
    // - takes the name of a CSV file as a parameter,
    //   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
    // - returns the year when the most births happened.
    //   - if there were multiple years with the same number of births then return any one of them

    // You can find such a CSV file in this directory named births.csv
    // If you pass "births.csv" to your function, then the result should be either 2006, or 2016.
    System.out.println(findMostBirthsYear("./textFiles/births.csv"));
  }
  public static String findMostBirthsYear(String nameOfCsv) {
    int mostBirthsNumber=0;
    String mostBirthsYear="";
    try {
      Path path = Paths.get(nameOfCsv);
      List<String> lines = Files.readAllLines(path);
      HashMap<String, Integer> years = new HashMap<>();
      for (String line:lines) {
        String year =line.split(";")[1].split("-")[0];
        if (years.containsKey(year)) {
          years.put(year,years.get(year)+1);
        } else {
          years.put(year,1);
        }
      }
      for (String yearToCompare: years.keySet()) {
        if (years.get(yearToCompare) > mostBirthsNumber) {
          mostBirthsYear=yearToCompare;
          mostBirthsNumber=years.get(yearToCompare);
        }
      }
    } catch (IOException e){
      e.printStackTrace();
    } finally {
      return mostBirthsYear;
    }
  }
}