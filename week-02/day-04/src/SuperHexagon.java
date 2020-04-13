import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  // by Endre Valach

  public static void mainDraw(Graphics graphics) {

    int columns = 11; // Must be an odd number

    int center = (columns - 1) / 2; // Index of the center Column
    int height = 65; //HEIGHT / columns; // Height of hexagon
    int edge = (int) (2 / Math.sqrt(3) * height / 2); //Edge of hexagon

    // The margins to position in the center
    int marginLeft = (WIDTH - (edge * (columns * 3 / 2 + 1))) / 2;
    int marginTop = (HEIGHT - (height * columns)) / 2;

    //I draw to a white background with black lines
    graphics.setColor(new Color(43,43,43));
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    graphics.setColor(new Color(204, 120,50));

    //Loops to draw columns and rows
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < columns; j++) {

        //Make margin to pos
        int xPos = j * edge * 3 / 2 + marginLeft;
        int yPos = i * height + marginTop;

        int fromCenter = Math.abs(center - j); //How far the column is from the center

        if ((fromCenter / 2) <= i) { // Shaping the top section
          if ((j + center) % 2 == 0) { //Odd columns (counting from the center
            if (i < (columns - fromCenter / 2)) { // Shaping the bottom section of Odd columns
              drawHexagon(xPos, yPos, edge, height, graphics);
            }
          } else if (i < (columns - fromCenter) / 2 + center) { // "Even" columns
            yPos += height / 2; // Push down the even columns
            drawHexagon(xPos, yPos, edge, height, graphics);
          }
        }
      }
    }
  }

  public static void drawHexagon(int xPos, int yPos, int edge, int height, Graphics graphics) {
    Polygon hexagon = new Polygon();
    hexagon.addPoint(xPos, yPos + height / 2);
    hexagon.addPoint(xPos + edge / 2, yPos);
    hexagon.addPoint(xPos + edge * 3 / 2, yPos);
    hexagon.addPoint(xPos + edge * 2, yPos + height / 2);
    hexagon.addPoint(xPos + edge * 3 / 2, yPos + height);
    hexagon.addPoint(xPos + edge / 2, yPos + height);
    graphics.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
    graphics.fillPolygon(hexagon);
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