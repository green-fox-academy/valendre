package countletters;

import java.util.HashMap;

public class CountLetters {

  public HashMap<Character, Integer> countLetters(String word) {
    HashMap<Character, Integer> dictionary = new HashMap<Character, Integer>();
    for (int i = 0; i < word.length(); i++) {
      if (!dictionary.containsKey(word.charAt(i))) {
        dictionary.put(word.charAt(i),1);
      } else {
        dictionary.replace(word.charAt(i),dictionary.get(word.charAt(i))+1);
      }
    }
    return dictionary;
  }
}
