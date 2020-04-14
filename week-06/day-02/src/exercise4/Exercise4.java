package exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Exercise4 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    OptionalDouble averageOfOdds = numbers.stream()
        .filter(number -> number % 2 == 1)
        .mapToDouble(n -> n)
        .average();

    System.out.println(averageOfOdds);
  }
}
