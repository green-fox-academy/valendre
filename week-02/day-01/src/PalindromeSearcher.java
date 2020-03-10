import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeSearcher {
  public static void main(String[] args) {
    String StrToSearchIn = "dog goat dad duck doodle never";
    String StrToSearchIn2 = "racecar";
    searchPalindrom(StrToSearchIn);
    searchPalindrom(StrToSearchIn2);

  }

  public static void searchPalindrom(String inputString) {
    char array[] = inputString.toCharArray();

    ArrayList<String> palindromes = new ArrayList<String>();
    for (int i = 0; i < inputString.length() - 2; i++) {
      if (array[i] == array[i + 2]) {
        int centerOfOddPal = (i + 1);
        palindromes.add("" + array[i] + array[i + 1] + array[i + 2]);
        boolean hasBiggerPal=true;
        int length = 5;
        while (hasBiggerPal){
          if(searchOddPal(centerOfOddPal, length, array)) {
            int startPos =centerOfOddPal-(length-1)/2;
            int endPos =centerOfOddPal+(length-1)/2;
            palindromes.add(newPal(startPos,endPos,array));
            length+=2;
          } else {
            hasBiggerPal=false;
          }
        }
      }
    }

    for (int i = 0; i < inputString.length() - 3; i++) {
      if ((array[i] == array[i + 3]) && (array[i + 1] == array[i + 2])) {
        int centerOfEvenPal =i + 1;
        palindromes.add("" + array[i] + array[i + 1] + array[i + 2] + array[i + 3]);
        boolean hasBiggerPal=true;
        int length = 6;
        while (hasBiggerPal){
          if(searchOddPal(centerOfEvenPal, length, array)) {
            int startPos =centerOfEvenPal-(length-2)/2;
            int endPos =centerOfEvenPal+(length-2)/2+1;
            palindromes.add(newPal(startPos,endPos,array));
            length+=2;
          } else {
            hasBiggerPal=false;
          }
        }
      }
    }
    System.out.println(Arrays.toString(palindromes.toArray()));
  }
  private static boolean searchOddPal (int postition, int length, char[] array) {
    boolean found =false;
    int distance = (length-1)/2;
    if ((postition>=distance)&& (postition+distance<=length)) {
      if (array[postition-distance] == array[postition+distance]) {
        found = true;
      }
    }
    return found;
  }
  private static String newPal (int startPos, int endPos, char[] array) {
    String newPal ="";
    for (int i = startPos; i <=endPos ; i++) {
      newPal+=array[i];
    }
    return newPal;
  }

}