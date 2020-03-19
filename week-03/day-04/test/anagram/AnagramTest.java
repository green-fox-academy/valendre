package anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  @Test
  public void areTheseAnagrams() {
    Anagram anagram = new Anagram();
    String word1 = "Abcdefgh";
    String word2 = "hgfedcbA";
    assertEquals(true, anagram.areTheseAnagrams(word1, word2));
  }

  @Test
  public void areTheseAnagramsEmptyNull() {
    Anagram anagram = new Anagram();
    String word1 = "";
    String word2 = null;
    assertEquals(false, anagram.areTheseAnagrams(word1, word2));
  }

  @Test
  public void areTheseAnagramsSubstringofEachOther() {
    Anagram anagram = new Anagram();
    String word1 = "Abcdefghh";
    String word2 = "hgfedcbA";
    assertEquals(false, anagram.areTheseAnagrams(word1, word2));
  }
}