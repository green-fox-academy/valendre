package sum;

import static org.junit.Assert.*;

import apples.Apple;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SumTest {

  @Test
  public void sum() {
    Sum sum = new Sum();
    ArrayList<Integer> numbersForTesting = new ArrayList<>();
    numbersForTesting.addAll(Arrays.asList(1, 2, 3, 4, 5));
    assertEquals(15, sum.sum(numbersForTesting));
  }

  @Test
  public void sumEmptyList() {
    Sum sum = new Sum();
    ArrayList<Integer> numbersForTesting = new ArrayList<>();
    assertEquals(0, sum.sum(numbersForTesting));
  }

  @Test
  public void sumOneElementList() {
    Sum sum = new Sum();
    ArrayList<Integer> numbersForTesting = new ArrayList<>();
    numbersForTesting.add(1);
    assertEquals(1, sum.sum(numbersForTesting));
  }

  @Test
  public void sumMultipleElement() {
    Sum sum = new Sum();
    ArrayList<Integer> numbersForTesting = new ArrayList<>();
    numbersForTesting.addAll(Arrays.asList(10, 2, 3, 4, 5));
    assertEquals(24, sum.sum(numbersForTesting));
  }

  @Test
  public void sumNull() {
    Sum sum = new Sum();
    ArrayList<Integer> numbersForTesting = null;
    assertEquals(0, sum.sum(numbersForTesting));
  }
}