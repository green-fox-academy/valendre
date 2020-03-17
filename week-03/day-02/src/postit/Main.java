package postit;

import java.awt.Color;

public class Main {
  public static void main(String[] args) {
    PostIt firstPostIt = new PostIt(Color.ORANGE,"Idea 1",Color.BLUE);
    PostIt secondPostIt = new PostIt(Color.PINK,"Awesome",Color.BLACK);
    PostIt thirdPostIt = new PostIt(Color.YELLOW,"Superb",Color.GREEN);
  }
}
