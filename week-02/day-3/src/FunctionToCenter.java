import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int distance=0;
        int green=255;//complementer color of red
        for (int i = 0; i <= 15; i++) {
            graphics.setColor(new Color(255,green,122));
            drawLineToCenter(distance,0,graphics);
            drawLineToCenter(distance,HEIGHT,graphics);
            drawLineToCenter(0,distance,graphics);
            drawLineToCenter(WIDTH,distance,graphics);
            distance+=20;
            green-=16;
        }
    }
    public static void drawLineToCenter(int x, int y, Graphics graphics) {
        graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
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