import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Draw a box that has different colored lines on each edge.
    int size = WIDTH/2;
    int red = 255;
    int blue= 0;
    int step = 255/3;
    graphics.setColor(new Color(red,0,blue));
    graphics.drawLine((WIDTH-size)/2, (HEIGHT-size)/2, (WIDTH+size)/2, (HEIGHT-size)/2);
    red-=step;
    blue+=step;
    graphics.setColor(new Color(red,0,blue));
    graphics.drawLine((WIDTH+size)/2, (HEIGHT-size)/2, (WIDTH+size)/2, (HEIGHT+size)/2);
    red-=step;
    blue+=step;
    graphics.setColor(new Color(red,0,blue));
    graphics.drawLine((WIDTH+size)/2, (HEIGHT+size)/2, (WIDTH-size)/2, (HEIGHT+size)/2);
    red-=step;
    blue+=step;
    graphics.setColor(new Color(red,0,blue));
    graphics.drawLine((WIDTH-size)/2, (HEIGHT+size)/2, (WIDTH-size)/2, (HEIGHT-size)/2);



  }

  // Don't touch the code below
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
}