import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHaxagonSecondTime {

  public static void mainDraw(Graphics graphics) {

    int columns = 11; // Must be an odd number
    int center = (columns - 1) / 2; // Index of the center Column
    int height = HEIGHT / columns; // Height of hexagon
    int edge = (int) (2 / Math.sqrt(3) * height / 2); //Edge of hexagon
    int marginLeft = (WIDTH - (edge * (columns * 3 / 2 + 1))) / 2;
    int marginTop = (HEIGHT - (height * columns)) / 2;

    graphics.setColor(new Color(43, 43, 43));
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    graphics.setColor(new Color(204, 120, 50));


    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < columns; j++) {

        int xPos = j * edge * 3 / 2 + marginLeft;
        int yPos = i * height + marginTop;
        int indexToHideTop = Math.abs(center - j) / 2;
        int indexToHideBottom = columns - indexToHideTop - ((j+1)%2)*((center-1)/ 2-1);
        if ((j + center) % 2 == 1) {
          yPos += height / 2; // Push down the even columns
        }

        Polygon hexagon = new Polygon();
        hexagon.addPoint(xPos, yPos + height / 2);
        hexagon.addPoint(xPos + edge / 2, yPos);
        hexagon.addPoint(xPos + edge * 3 / 2, yPos);
        hexagon.addPoint(xPos + edge * 2, yPos + height / 2);
        hexagon.addPoint(xPos + edge * 3 / 2, yPos + height);
        hexagon.addPoint(xPos + edge / 2, yPos + height);

        if (indexToHideTop <= i && i < indexToHideBottom) {
          graphics.drawPolygon(hexagon);
        }
      }
    }
  }

  // region Don't touch the code below
  static int WIDTH = 720;
  static int HEIGHT = 720;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
  //endregion
}