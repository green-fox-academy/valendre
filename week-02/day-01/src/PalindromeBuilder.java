public class PalindromeBuilder {
  public static void main(String[] args) {
    String str = "greenfox";
    System.out.println(palindromBuilder(str));

  }

  public static String palindromBuilder(String a) {
    char array[] = a.toCharArray();
    String b = "";
    int c = a.length();
    for (int i = 0; i < c; i++) {
      b += array[i];
    }
    for (int i = 0; i < c; i++) {
      b += array[c - i -1];
    }
    return b;
  }
}
