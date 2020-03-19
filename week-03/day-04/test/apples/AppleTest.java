package apples;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleTest {

  @Test
  public void getAppleTest() {
    Apple apple = new Apple();
    String expectedReturnString = "apple";
    String methodReturnString =  apple.getApple();
    assertEquals(expectedReturnString, methodReturnString);
  }
}