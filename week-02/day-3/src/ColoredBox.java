import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
        int x=20;
        int y=30;
        /*
        graphics.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
        graphics.drawLine(x, y, x + WIDTH - 1, y);
        graphics.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
        graphics.drawLine(x + WIDTH, y, x + WIDTH, y + HEIGHT - 1);
        graphics.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
        graphics.drawLine(x + WIDTH, y + HEIGHT, x + 1, y + HEIGHT);
        graphics.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
        graphics.drawLine(x, y + HEIGHT, x, y + 1);
        */
        getRandomColor(graphics);
        graphics.drawLine(x, y, x + WIDTH - 1, y);
        getRandomColor(graphics);
        graphics.drawLine(x + WIDTH, y, x + WIDTH, y + HEIGHT - 1);
        getRandomColor(graphics);
        graphics.drawLine(x + WIDTH, y + HEIGHT, x + 1, y + HEIGHT);
        getRandomColor(graphics);
        graphics.drawLine(x, y + HEIGHT, x, y + 1);
    }

    public static void getRandomColor(Graphics graphics){
        Random random=new Random();
        graphics.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
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