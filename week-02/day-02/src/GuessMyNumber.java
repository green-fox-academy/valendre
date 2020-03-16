import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Minimum number");

    int minNum = scanInt();
    System.out.println("Maximum number");
    int maxNum = scanInt();
    System.out.println("Number of lives");
    int lives = scanInt() + 1;

    int numToGuess = minNum + (int) Math.random() * (maxNum - minNum);
    System.out.println("I've the number between " + minNum + "-" + maxNum + ". You have " + (int) (lives - 1) + " lives.");

    int guess = 0;
    do {
      guess = scanInt();
      lives--;
      if (guess < numToGuess) {
        System.out.println("Too low. You have " + (int) (lives - 1) + " lives left.");
      } else if (guess > numToGuess) {
        System.out.println("Too high You have " + (int) (lives - 1) + " lives left.");
      } else {
        System.out.println("You won.");
      }
    }
    while (lives > 1 || guess == numToGuess);
    if (guess != numToGuess) {
      System.out.println("You lost.");
    }


  }

  public static int scanInt() {
    Scanner scanner = new Scanner(System.in);
    try {
      return scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("It wasn't a number, try again");
      scanInt();
    }
    return -1;
  }


}
