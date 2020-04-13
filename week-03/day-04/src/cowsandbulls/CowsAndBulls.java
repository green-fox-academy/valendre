package cowsandbulls;

import java.util.HashMap;
import java.util.Scanner;

public class CowsAndBulls {
  FourDigit numberToGuess;
  boolean state;
  int counterOfGuesses;

  public CowsAndBulls() {
    this.numberToGuess = new FourDigit();
    this.state = true;
    this.counterOfGuesses = 1;
    System.out.println(numberToGuess.toString());
  }

  public static void main(String[] args) {
    CowsAndBulls cowsAndBulls = new CowsAndBulls();
    FourDigit guessNumbers;
    do {
      guessNumbers = new FourDigit(cowsAndBulls.inputGuess());
      System.out.println(cowsAndBulls.guess(guessNumbers));
    } while (cowsAndBulls.state == true);
    System.out.println("You won!");
  }

  public String inputGuess() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Take your " + this.counterOfGuesses + ". guess: ");
    String rawInput = scanner.nextLine();
    if (isValidGuess(rawInput)) {
      return rawInput;
    } else {
      rawInput = inputGuess();
    }
    return rawInput;
  }

  public int findCowsorBulls(boolean cowsOrBulls, HashMap<Integer, Integer> guessNumber) {
    int numberOfMatch = 0;
    HashMap<Integer, Integer> tempNumber = new HashMap<>();
    tempNumber.putAll(this.numberToGuess);
    for (int i = 1; i <= 4; i++) {
      int indexOFMap = i;
      if (guessNumber.containsKey(i)) {
        if (tempNumber.containsValue(guessNumber.get(i))) {
          if (!cowsOrBulls) {
            indexOFMap = getFirstKey(guessNumber.get(i), tempNumber);
          }
          numberOfMatch++;
          tempNumber.remove(indexOFMap);
          guessNumber.remove(i);
        }
      }
    }
    return numberOfMatch;
  }

  public String guess(FourDigit guessNumber) {
    String resultOfGuess = "";
    this.counterOfGuesses++;
    FourDigit tempNumber = new FourDigit("0000");
    int cows = 0;
    int bulls = 0;


    if (cows == 4) {
      this.state = false;
    }
    resultOfGuess += cows + " cow" + ((cows > 1) ? "s" : "") +
        " and " + bulls + " bull" + ((bulls > 1) ? "s" : "") + ".\n";

    return resultOfGuess;
  }

  public boolean isValidGuess(String rawInput) {
    boolean isValid = false;
    int rawNumber = 0;
    try {
      rawNumber = Integer.parseInt(rawInput);
    } catch (NumberFormatException e) {
      return isValid;
    }
    if (rawInput.length() == 4 && rawNumber >= 0 && rawNumber < 10000) {
      isValid = true;
    }
    return isValid;
  }

  public int getFirstKey(int value, HashMap<Integer, Integer> hashMap) {
    int keyToFind = 0;
    for (int key : hashMap.keySet()) {
      if (value == hashMap.get(key)) {
        keyToFind = key;
      }
    }
    return keyToFind;
  }

}

