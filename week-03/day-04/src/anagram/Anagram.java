package anagram;

import java.util.Arrays;

public class Anagram {

  public boolean areTheseAnagrams(String word1, String word2) {
    try {
      if (sortString(word1).equals(sortString(word2))) {
        return true;
      }
    } catch (NullPointerException e) {
    }
    return false;
  }

  public String sortString(String word) {
    char[] wordCharArray1 = word.toCharArray();
    Arrays.sort(wordCharArray1);
    return Arrays.toString(wordCharArray1);
  }

}
