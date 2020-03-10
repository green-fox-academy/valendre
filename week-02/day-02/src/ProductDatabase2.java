import java.util.ArrayList;
import java.util.HashMap;

public class ProductDatabase2 {
  public static void main(String[] args) {
    HashMap<String, Integer> productData = new HashMap<>();
    productData.put("Eggs", 200);
    productData.put("Milk", 200);
    productData.put("Fish", 400);
    productData.put("Apples", 150);
    productData.put("Bread", 50);
    productData.put("Chicken", 550);

    ArrayList<String> listOfCheap = new ArrayList<>();
    HashMap<String, Integer> listOfExpensive = new HashMap<>();

    for (String product : productData.keySet()) {
      if (productData.get(product) < 201) {
        listOfCheap.add(product);
      }
      if (productData.get(product) > 150) {
        listOfExpensive.put(product, productData.get(product));
      }
    }
    System.out.println("Which products cost less than 201? (just the name)\n" + listOfCheap.toString());
    System.out.println("Which products cost more than 150? (name + price)\n" + listOfExpensive);

  }
}
