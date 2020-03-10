import java.util.HashMap;
import java.util.Map;


public class ShoppingList2 {
  public static void main(String[] args) {
    HashMap<String, Float> productsWithPrices = new HashMap<>();
    productsWithPrices.put("Milk", (float) 1.07);
    productsWithPrices.put("Rice", (float)1.59);
    productsWithPrices.put("Eggs", (float)3.14);
    productsWithPrices.put("Cheese", (float)12.60);
    productsWithPrices.put("Chicken Breasts", (float)9.40);
    productsWithPrices.put("Apples", (float)2.31);
    productsWithPrices.put("Tomato", (float)2.58);
    productsWithPrices.put("Potato", (float)1.75);
    productsWithPrices.put("Onion", (float)1.10);

    HashMap<String, Integer> bobsShoppingList= new HashMap<>();
    bobsShoppingList.put("Milk", 3);
    bobsShoppingList.put("Rice", 2);
    bobsShoppingList.put("Eggs", 2);
    bobsShoppingList.put("Cheese", 1);
    bobsShoppingList.put("Chicken Breasts", 4);
    bobsShoppingList.put("Apples", 1);
    bobsShoppingList.put("Tomato", 2);
    bobsShoppingList.put("Potato", 1);

    HashMap<String, Integer> alicesShoppingList= new HashMap<>();
    alicesShoppingList.put("Rice", 1);
    alicesShoppingList.put("Eggs", 5);
    alicesShoppingList.put("Chicken Breasts", 5);
    alicesShoppingList.put("Apples", 1);
    alicesShoppingList.put("Tomato", 10);

    /*
    How much does Bob pay?
How much does Alice pay?
Who buys more Rice?
Who buys more Potato?
Who buys more different products?
Who buys more products? (piece)
     */
    float bobPays=0;
    int bobPieces=0;
    for (Map.Entry<String, Integer> product : bobsShoppingList.entrySet()) {
      bobPieces+=product.getValue();
      bobPays+=(product.getValue()*productsWithPrices.get(product.getKey()));
    }
    System.out.println("How much does Bob pay? " + bobPays);

    float alicePays=0;
    int alicePieces=0;
    for (Map.Entry<String, Integer> product : alicesShoppingList.entrySet()) {
      alicePieces+=product.getValue();
      alicePays+=(product.getValue()*productsWithPrices.get(product.getKey()));
    }
    System.out.println("How much does Alice pay? " + alicePays);

    String whoBoughjtMoreRice ="";
    if (bobsShoppingList.get("Rice") > alicesShoppingList.get("Rice")) {
      whoBoughjtMoreRice="Bob";
    } else if (bobsShoppingList.get("Rice") > alicesShoppingList.get("Rice")) {
      whoBoughjtMoreRice="Alice";
    } else {
      whoBoughjtMoreRice ="Both of the same.";
    }
    System.out.println("Who buys more Rice? "+ whoBoughjtMoreRice);

    String whoBoughjtMorePotato ="";

    if (bobsShoppingList.containsKey("Potato") && alicesShoppingList.containsKey("Potato")){
      if (bobsShoppingList.get("Potato") > alicesShoppingList.get("Potato")) {
        whoBoughjtMorePotato="Bob";
      } else if (bobsShoppingList.get("Potato") > alicesShoppingList.get("Potato")) {
        whoBoughjtMorePotato="Alice";
      } else {
        whoBoughjtMorePotato ="Both of the same.";
      }
    } else if (bobsShoppingList.containsKey("Potato")) {
      whoBoughjtMorePotato="Bob";
    } else if (alicesShoppingList.containsKey("Potato")) {
      whoBoughjtMorePotato="Alice";
    } else {
      whoBoughjtMorePotato="Nobody bought potato.";
    }

    System.out.println("Who buys more Potato? "+ whoBoughjtMorePotato);

    String whoBoughtmoreUnique = "";
    if (bobsShoppingList.size()>alicesShoppingList.size()) {
      whoBoughtmoreUnique="Bob";
    } else if (bobsShoppingList.size()<alicesShoppingList.size()) {
      whoBoughtmoreUnique="Alice";
    } else {
      whoBoughtmoreUnique="Both of the same.";
    }
    System.out.println("Who buys more different products? " + whoBoughtmoreUnique);

    String theMorePieces;
    if (bobPieces>alicePieces) {
      theMorePieces ="Bob";
    } else if (bobPieces<alicePieces){
      theMorePieces ="Alice";
    } else {
      theMorePieces ="Both of them is the same.";
    }
    System.out.println("Who buys more products? (piece) " + theMorePieces);
  }
}

