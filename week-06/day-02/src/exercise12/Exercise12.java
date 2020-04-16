package exercise12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise12 {

  public static void main(String[] args) throws IOException {

    String maxWeight = Files.readAllLines(Paths.get("text/swcharacters.txt"))
        .stream()
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

    double averageMaleHeight = Files.readAllLines(Paths.get("text/swcharacters.txt"))
        .stream()
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

    double averageFemaleHeight = Files.readAllLines(Paths.get("text/swcharacters.txt"))
        .stream()
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




  }

}
