package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    List<Domino> snakeDomino = new ArrayList<>();
    List<Domino> remainingDominoes = new ArrayList<>();
    remainingDominoes.addAll(dominoes);

    snakeDomino.add(remainingDominoes.get(0));
    remainingDominoes.remove(remainingDominoes.get(0));

    for (int i = 0; i < dominoes.size(); i++) {

      for (int j = 0; j < remainingDominoes.size(); j++) {
        if (snakeDomino.get(i).getRightSide() == remainingDominoes.get(j).getLeftSide()) {
          snakeDomino.add(remainingDominoes.get(j));
          remainingDominoes.remove(remainingDominoes.get(j));
          break;
        }
      }
    }

    System.out.println(dominoes);
    System.out.println(snakeDomino);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }

}