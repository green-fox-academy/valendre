import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static void mainDraw(Graphics graphics) {

    int columns = 7;
    if (columns % 2 != 1) {
      columns--;
    }

    int center = (columns - 1) / 2;
    int height = HEIGHT / columns / 2;
    int edge = (int) (2 / Math.sqrt(3) * height);
    int marginLeft = (WIDTH - (edge * (columns * 3 / 2 + 1))) / 2;
    int marginTop = (HEIGHT - (height * columns * 2)) / 2;
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    graphics.setColor(Color.BLACK);
    for (int i = 0; i < columns; i++) {
      for (int j = 0; j < columns; j++) {
        int xPos = j * edge * 3 / 2 + marginLeft;
        int yPos = i * height * 2 + marginTop;
        int fromCenter = Math.abs(center - j);
        if ((j + center) % 2 == 1 && i <= (columns - fromCenter) / 2 + center - 1 && i >= fromCenter / 2) {
          yPos += height;
          drawHexagon(xPos, yPos, edge, height, graphics);
        } else if ((j + center) % 2 == 0 && i < (columns - fromCenter / 2) && i >= (fromCenter / 2)) {
          drawHexagon(xPos, yPos, edge, height, graphics);
        }
      }
    }
  }

  public static void drawHexagon(int xPos, int yPos, int edge, int height, Graphics graphics) {
    graphics.drawLine(xPos, yPos + height, xPos + edge / 2, yPos);
    graphics.drawLine(xPos + edge / 2, yPos, xPos + edge * 3 / 2, yPos);
    graphics.drawLine(xPos + edge * 3 / 2, yPos, xPos + edge * 2, yPos + height);
    graphics.drawLine(xPos + edge * 2, yPos + height, xPos + edge * 3 / 2, yPos + height * 2);
    graphics.drawLine(xPos + edge * 3 / 2, yPos + height * 2, xPos + edge / 2, yPos + height * 2);
    graphics.drawLine(xPos + edge / 2, yPos + height * 2, xPos, yPos + height);
  }

  // region Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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