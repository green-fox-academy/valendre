package postit;

import java.awt.Color;

public class PostIt {

  Color backgroundColor;
  String textOnIt;
  Color textColor;

  public PostIt(Color backgroundColor, String textOnIt, Color textColor) {
    this.backgroundColor = backgroundColor;
    this.textOnIt = textOnIt;
    this.textColor = textColor;
  }
}