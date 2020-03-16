import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    String wordToCompare1 = "dog";
    String wordToCompare2 = "god";
    if (anagram(wordToCompare1, wordToCompare2)) {
      System.out.println("These are anagrams");
    }
    System.out.println();
  }

  public static boolean anagram(String wordToCompare1, String wordToCompare2) {
    char charArray1[] = wordToCompare1.toCharArray();
    char charArray2[] = wordToCompare2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    if (Arrays.equals(charArray1, charArray2)) {
      return true;
    }
    return false;
  }
}
