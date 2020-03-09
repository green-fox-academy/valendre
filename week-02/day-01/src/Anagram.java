import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    String a = "dog";
    String b = "god";
    if (anagram(a,b)) {
      System.out.println("These are anagrams");
    }
    System.out.println();
  }

  public static boolean anagram(String a, String b) {
    boolean c = false;
    char aarray[] = a.toCharArray();
    char barray[] = b.toCharArray();
    Arrays.sort(aarray);
    Arrays.sort(barray);
    if (Arrays.equals(aarray, barray)) {
      c = true;
    }
    return c;
  }
}
