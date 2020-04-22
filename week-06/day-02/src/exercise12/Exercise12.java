package exercise12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise12 {

  public static void main(String[] args) throws IOException {

    String maxWeight = Files.lines(Paths.get("text/swcharacters.csv"))
        .skip(1)
        .map(string -> string.replace(",", "."))
        .map(string -> Arrays.asList(string.split(";")))
        .collect(Collectors.toMap(cell -> cell.get(0), cell -> cell.get(2)))
        .entrySet().stream()
        .filter(entry -> !entry.getValue().equals("unknown"))
        .filter(entry -> !entry.getValue().equals("mass"))
        .collect(Collectors.toMap(Map.Entry::getKey, weight -> Double.parseDouble(weight.getValue())))
        .entrySet().stream()
        .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

    System.out.println("The heaviest character is " + maxWeight);

    double averageMaleHeight = Files.lines(Paths.get("text/swcharacters.csv"))
        .skip(1)
        .map(string -> string.replace(",", "."))
        .map(string -> Arrays.asList(string.split(";")))
        .filter(cell -> cell.get(7).equals("male"))
        .map(cell -> cell.get(1))
        .filter(entry -> !entry.equals("unknown"))
        .filter(entry -> !entry.equals("height"))
        .map(Double::parseDouble)
        .mapToDouble(Double::doubleValue)
        .average()
        .getAsDouble();

    System.out.println("Average height of the male characters is " + averageMaleHeight);

    double averageFemaleHeight = Files.lines(Paths.get("text/swcharacters.csv"))
        .skip(1)
        .map(string -> string.replace(",", "."))
        .map(string -> Arrays.asList(string.split(";")))
        .filter(cell -> cell.get(7).equals("female"))
        .map(cell -> cell.get(1))
        .filter(entry -> !entry.equals("unknown"))
        .filter(entry -> !entry.equals("height"))
        .map(Double::parseDouble)
        .mapToDouble(Double::doubleValue)
        .average()
        .getAsDouble();

    System.out.println("Average height of the female characters is " + averageFemaleHeight);

    Map<String, Map<String, Long>> ageDistribution =
        Files.lines(Paths.get("text/swcharacters.csv"))
            .skip(1)
            .map(string -> Arrays.asList(string.split(";")))
            .collect(Collectors.groupingBy(gender -> {
                  if (gender.get(7).equals("male") || gender.get(7).equals("female")) {
                    return gender.get(7);
                  } else {
                    return "other";
                  }
                },
                Collectors.groupingBy(ageGroup -> {
                  try {
                    if (Integer.parseInt(ageGroup.get(6).replace("BBY", "")) < 21) {
                      return "below 21";
                    } else if (Integer.parseInt(ageGroup.get(6).replace("BBY", "")) <= 40) {
                      return "between 21-40";
                    } else {
                      return "above 40";
                    }
                  } catch (NumberFormatException e) {
                    return "unknown";
                  }
                }, Collectors.counting())));

    System.out.println(ageDistribution);

  }
}