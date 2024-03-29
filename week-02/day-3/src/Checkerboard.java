import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int size = 16; //height & width should be dividable by this
        int rowLength = WIDTH / size;
        int columnLength = HEIGHT / size;


        /*
        for (int i = 0; i < rowLength; i++) {
            if (i % 2 != 1) {
                for (int j = 0; j < columnLength; j++) {
                    if (j % 2 != 1) {
                        drawBlackSquares(j, i, size, graphics);
                    } else {
                        drawWhitSquares(j, i, size, graphics);
                    }
                }
            } else {
                for (int j = 0; j < columnLength; j++) {
                    if (j % 2 != 0) {
                        drawBlackSquares(j, i, size, graphics);
                    } else {
                        drawWhitSquares(j, i, size, graphics);
                    }
                }
            }*/
        }



    public static void drawBlackSquares(int numberX, int numberY, int size, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(numberX * size, numberY * size, size, size);
    }

    public static void drawWhitSquares(int numberX, int numberY, int size, Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(numberX * size, numberY * size, size, size);
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