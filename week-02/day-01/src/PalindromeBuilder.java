public class PalindromeBuilder {
  public static void main(String[] args) {
    String baseOfPalindrome = "greenfox";
    System.out.println(palindromBuilder(baseOfPalindrome));
  }

  public static String palindromBuilder(String baseOfPalindrome) {
    char array[] = baseOfPalindrome.toCharArray();
    String palindrome = "";
    int lengthOfPalindrome = baseOfPalindrome.length();
    for (int i = 0; i < lengthOfPalindrome; i++) {
      palindrome += array[i];
    }
    for (int i = 0; i < lengthOfPalindrome; i++) {
      palindrome += array[lengthOfPalindrome - i - 1];
    }
    return palindrome;
  }
}
