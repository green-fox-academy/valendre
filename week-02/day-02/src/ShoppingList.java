import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
  public static void main(String[] args) {
    /*
    Create a list with the following items.
    Eggs, milk, fish, apples, bread and chicken
    Create an application which solves the following problems.
    Do we have milk on the list?
    Do we have bananas on the list?
     */
    ArrayList<String> shopingList = new ArrayList<>();
    shopingList.addAll(Arrays.asList("Eggs", "milk", "fish", "apples", "bread", "chicken"));
    System.out.println("Do we have milk on the list? " + shopingList.contains("milk"));
    System.out.println("Do we have banana on the list? " + shopingList.contains("banana"));
  }
}
