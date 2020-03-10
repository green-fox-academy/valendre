import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
  public static void main(String[] args) {
    HashMap<String, String> isbnList = new HashMap<>();
    isbnList.put("978-1-60309-452-8","A Letter to Jo");
    isbnList.put("978-1-60309-459-7","Lupus");
    isbnList.put("978-1-60309-444-3","Red Panda and Moon Bear");
    isbnList.put("978-1-60309-461-0","The Lab");

    for (String itemsIsbn: isbnList.keySet()) {
      System.out.println(isbnList.get(itemsIsbn).toString() + " (ISBN:" + itemsIsbn.toString() + ")");
    }
    isbnList.remove("978-1-60309-444-3");
    String wantToRemoveValue="The Lab";
    for (String  keyOf: isbnList.keySet()) {
      if(wantToRemoveValue.equals(isbnList.get(keyOf))) {
        isbnList.remove(keyOf);
      }
    }
    isbnList.put("978-1-60309-450-4","They Called Us Enemy");
    isbnList.put("978-1-60309-453-5","Why Did We Trust Him?");
    System.out.println(isbnList.containsKey("478-0-61159-424-8"));
    System.out.println(isbnList.get("978-1-60309-453-5"));

  }



}

