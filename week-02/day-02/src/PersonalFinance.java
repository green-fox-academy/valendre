import java.util.ArrayList;
import java.util.Arrays;

public class PersonalFinance {
  public static void main(String[] args) {
    ArrayList<Integer> expenses = new ArrayList<>();
    expenses.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));
    int sum = 0;
    int max = expenses.get(0);
    int min = expenses.get(0);
    for (int expense : expenses) {
      sum += expense;
      if (max < expense) {
        max = expense;
      }
      if (min > expense) {
        min = expense;
      }
    }
    float avarage = max / expenses.size();
    System.out.println("How much did we spend? " + sum);
    System.out.println("Which was our greatest expense? " + max);
    System.out.println("Which was our cheapest spending? " + min);
    System.out.println("What was the average amount of our spendings? " + avarage);


  }
}
