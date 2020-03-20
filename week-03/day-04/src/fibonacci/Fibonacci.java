package fibonacci;

public class Fibonacci {

  public long getFibonacci(int index) {
    long fibonacciNumber = 1;
    long perviusNumber = 1;
    long temp;
    if (index==0){
      return 0;
    }
    if (!(index==1 || index ==2)) {
      for (int i = 2; i < index; i++) {
        temp = fibonacciNumber;
        fibonacciNumber += perviusNumber;
        perviusNumber = temp;
      }
    }
    return fibonacciNumber;
  }

}
