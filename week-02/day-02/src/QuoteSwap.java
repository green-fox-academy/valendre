import java.util.*;

public class QuoteSwap {
  public static void main(String... args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap().

    // Also, print the sentence to the output with spaces in between.
    System.out.println(quoteSwap(list));
    // Expected output: "What I cannot create I do not understand."

  }

  public static String quoteSwap(ArrayList<String> list) {
    Collections.swap(list, list.indexOf("do"), list.indexOf("cannot"));
    String strToReturn = "";
    for (int i = 0; i < list.size() - 1; i++) {
      strToReturn += list.get(i) + " ";
    }
    strToReturn+=list.get(list.size()-1);
  return strToReturn;
  }
}