import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    graphics.setColor(Color.WHITE);
    graphics.fillRect(0,0,WIDTH,HEIGHT);


    int steps = 15;
    for (int i = 1; i < steps; i++) {
      graphics.setColor(new Color(88,216,97));
      graphics.drawLine(0, i * WIDTH / steps, (i * WIDTH / steps), WIDTH);
      graphics.setColor(new Color(177,69,243));
      graphics.drawLine(WIDTH, i * WIDTH / steps, (i * WIDTH / steps), 0);
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