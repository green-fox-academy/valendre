package countletters;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class CountLettersTest {

  @Before
  public void setUp() throws Exception {
    CountLetters countLetters = new CountLetters();
  }

  @Test
  public void countLetters() {
    CountLetters countLetters = new CountLetters();
    String word = "Aabccddd";
    HashMap<Character, Integer> expectedDictionary = new HashMap<Character, Integer>();
    expectedDictionary.put('A', 1);
    expectedDictionary.put('a', 1);
    expectedDictionary.put('b', 1);
    expectedDictionary.put('c', 2);
    expectedDictionary.put('d', 3);
    HashMap<Character, Integer> computedDictionary = new HashMap<>();
    computedDictionary.putAll(countLetters.countLetters(word));
    assertEquals(expectedDictionary.keySet(), computedDictionary.keySet());
    for (char key: expectedDictionary.keySet()) {
      assertEquals(expectedDictionary.get(key), computedDictionary.get(key));
    }
  }
}