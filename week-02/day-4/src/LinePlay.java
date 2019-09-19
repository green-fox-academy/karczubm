import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {

        int distanceBetweenLines = 64; //20
        int lineDensity = WIDTH / distanceBetweenLines;
        int x = distanceBetweenLines;
        int y2 = distanceBetweenLines;

        for (int i = 0; i < lineDensity; i++) {
            graphics.setColor(Color.BLUE);
            graphics.drawLine(x, 0, WIDTH, y2);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(y2, WIDTH, 0, x);
            y2 += distanceBetweenLines;
            x += distanceBetweenLines;
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