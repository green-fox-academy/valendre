import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {

    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);


    int steps = 15;
    int parts = 16;

    int rows = (int) Math.sqrt(parts);
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < rows; j++) {
        linePLayPattern(steps, rows, i * WIDTH / rows, j * WIDTH / rows, graphics);
      }
    }

  }

  public static void linePLayPattern(int steps, int rows, int leftMargin, int topMargin, Graphics graphics) {
    for (int i = 1; i < steps; i++) {
      int patternWidth = WIDTH / rows;
      int distance = i * patternWidth / steps;
      graphics.setColor(new Color(88, 216, 97));
      graphics.drawLine(leftMargin, distance + topMargin, distance + leftMargin, patternWidth + topMargin);
      graphics.setColor(new Color(177, 69, 243));
      graphics.drawLine(patternWidth + leftMargin, distance + topMargin, distance + leftMargin, topMargin);
    }
  }

  // region Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

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