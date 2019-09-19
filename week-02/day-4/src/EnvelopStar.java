import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopStar {
    public static void mainDraw(Graphics graphics) {
        int distanceBetweenLines = 10; //20
        int lineDensity = WIDTH / 2 / distanceBetweenLines;
        int a = distanceBetweenLines;

        graphics.setColor(Color.black);
        for (int i = 0; i < lineDensity; i++) {
            /*It shows the 1st line of a loop.
            if(i==0) {
                graphics.setColor(Color.RED);
            }else{
                graphics.setColor(Color.BLACK);
            }*/
            graphics.drawLine(WIDTH - a, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 - a);
            graphics.drawLine(WIDTH - a, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + a);
            graphics.drawLine(a, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 + a);
            graphics.drawLine(a, HEIGHT / 2, WIDTH / 2, HEIGHT / 2 - a);

            a += distanceBetweenLines;
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