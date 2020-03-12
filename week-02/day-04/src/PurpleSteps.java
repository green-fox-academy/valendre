import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]

    int size = 10;
    Color purple = new Color(177,69,243);
    int margin = 10;
    graphics.setColor(Color.WHITE);
    graphics.fillRect(0,0,WIDTH,HEIGHT);
    for (int i = 0; i < 19; i++) {
      graphics.setColor(purple);
      graphics.fillRect(margin+i*size,margin+i*size, size, size);
      graphics.setColor(Color.BLACK);
      graphics.drawRect(margin+i*size,margin+i*size, size, size);
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