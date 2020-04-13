package fibonacci;

import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

public class FibonacciTest {

  @Test
  public void getFibonacci() {
    Fibonacci fibonacci = new Fibonacci();
    HashMap<Integer, Long> expectedFibonacciNumbers = new HashMap<>();
    expectedFibonacciNumbers.put(1, (long) 1);
    expectedFibonacciNumbers.put(2, (long) 1);
    expectedFibonacciNumbers.put(3, (long) 2);
    expectedFibonacciNumbers.put(4, (long) 3);
    expectedFibonacciNumbers.put(5, (long) 5);
    expectedFibonacciNumbers.put(6, (long) 8);
    expectedFibonacciNumbers.put(7, (long) 13);
    expectedFibonacciNumbers.put(8, (long) 21);
    expectedFibonacciNumbers.put(9, (long) 34);
    expectedFibonacciNumbers.put(10, (long) 55);
    expectedFibonacciNumbers.put(11, (long) 89);
    expectedFibonacciNumbers.put(12, (long) 144);
    expectedFibonacciNumbers.put(20, (long) 6765);
    expectedFibonacciNumbers.put(40, (long) 102334155);

    for (int key : expectedFibonacciNumbers.keySet()) {
      assertEquals((long) expectedFibonacciNumbers.get(key), fibonacci.getFibonacci(key));
    }
  }
}