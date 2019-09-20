import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles2 {
    public static void mainDraw(Graphics graphics) {
        int triangleHeigth = 15;//65
        int triangleWidth = 16;//56
        int rows = 20;
        for (int i = 0; i < rows; i++) {
            if (i == 0) {
                graphics.setColor(Color.RED);
            } else {
                graphics.setColor(Color.BLACK);
            }

            graphics.drawLine(WIDTH / 2 - (triangleWidth / 2 * i), triangleHeigth * i,
                    WIDTH / 2 + (triangleWidth / 2 * i), triangleHeigth * i);

            graphics.drawLine((WIDTH / 2 + (rows - 1) * triangleWidth / 2) - triangleWidth * i, (rows - 1) * triangleHeigth,
                    WIDTH / 2 - i * triangleWidth / 2, triangleHeigth * i);

            graphics.drawLine((WIDTH / 2 - (rows - 1) * triangleWidth / 2) + triangleWidth * i, (rows - 1) * triangleHeigth,
                    WIDTH / 2 + i * triangleWidth / 2, triangleHeigth * i);
            //graphics.drawLine((WIDTH / 2 - rows * triangleWidth / 2)+triangleWidth/2,(rows - 1) * triangleHeigth,WIDTH,HEIGHT);

        }


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