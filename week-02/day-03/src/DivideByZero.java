import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    try {
      System.out.println("type a number");
      Scanner sc = new Scanner(System.in);
      int dividor = sc.nextInt();
      divideTwoNumbers(dividor);
    } catch (ArithmeticException e){
      System.out.println("fail");
    }

  }
  public static void divideTwoNumbers (int dividor) {
    int ten = 10;
    System.out.println(ten + " / " + dividor + " = " + (int)ten/dividor);
  }
}
