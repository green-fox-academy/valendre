import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    int steps = 15;
    int rows = 1;
    int patternWidth = WIDTH / 2;
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0, 0, WIDTH, HEIGHT);
    graphics.setColor(new Color(88, 216, 97));
    for (int l = 1; l < steps; l++) {
      int distance = l * patternWidth / steps;
      graphics.drawLine(WIDTH / 2, distance, (WIDTH / 2) - distance, WIDTH / 2);
      graphics.drawLine(WIDTH / 2, WIDTH - distance, (WIDTH / 2) - distance, WIDTH / 2);
      graphics.drawLine(WIDTH / 2, WIDTH - distance, WIDTH / 2 + distance, WIDTH / 2);
      graphics.drawLine(WIDTH / 2, WIDTH / 2 - distance, WIDTH - distance, WIDTH / 2);
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