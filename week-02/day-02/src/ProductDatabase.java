import java.util.HashMap;

public class ProductDatabase {
  public static void main(String[] args) {
    HashMap<String, Integer> productData = new HashMap<>();
    productData.put("Eggs", 200);
    productData.put("Milk", 200);
    productData.put("Fish", 400);
    productData.put("Apples", 150);
    productData.put("Bread", 50);
    productData.put("Chicken", 550);

    System.out.println("How much is the fish? " + productData.get("Fish"));

    String mostExpensive = "";
    String cheapest = "";
    int max = 0;
    int min = productData.get(productData.keySet().toArray()[0]);
    int productUnder = 0;
    int sum = 0;
    boolean isThere125 = false;

    for (String product : productData.keySet()) {
      if (max < productData.get(product)) {
        mostExpensive = product;
        max = productData.get(product);
      }
      if (min > productData.get(product)) {
        cheapest = product;
        min = productData.get(product);
      }
      if (300 > productData.get(product)) {
        productUnder++;
      }
      if (125 == productData.get(product)) {
        isThere125 = true;
      }
      sum += productData.get(product);


    }

    System.out.println("What is the most expensive product? " + mostExpensive);
    System.out.println("What is the average price? " + (float) sum / productData.size());
    System.out.println("How many products' price is below 300? " + productUnder);
    System.out.println("Is there anything we can buy for exactly 125? " + isThere125);
    System.out.println("What is the cheapest product? " + cheapest);

  }
}

