import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type in the expression:");
    String input[] = scanner.nextLine().split(" ");
    int result=0;
    if (input.length == 3) {
      char operation = input[0].charAt(0);
      int operand1 = Integer.parseInt(input[1]);
      int operand2 = Integer.parseInt(input[2]);
      if (operation == '+') {
        result = operand1 + operand2;
      } else if (operation == '-') {
        result = operand1 - operand2;
      } else if (operation == '*') {
        result = operand1 * operand2;
      } else if (operation == '/') {
        result = operand1 / operand2;
      } else if (operation == '%') {
        result = operand1 % operand2;
      }
    }
    System.out.println(result);
  }
}