import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]
        int howManyRectDoYouWant = 7;
        int size = 10;
        int x=size;
        int y=size;
        for (int i = 0; i < howManyRectDoYouWant; i++) {
            drawFilledRect(x, y, size * i, graphics);
            x += size*i;
            y += size*i;
        }

    }

    public static void drawFilledRect(int x, int y, int size, Graphics graphics) {
        graphics.setColor(Color.magenta);
        graphics.fillRect(x, y, size, size);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, y, size, size);
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