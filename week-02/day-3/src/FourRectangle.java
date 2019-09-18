import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangle {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        Random random=new Random();
        for (int i = 0; i < 3; i++) {

            int squareSizeA=random.nextInt(40);;
            int squareSizeB=random.nextInt(40);;
            int x=random.nextInt(WIDTH-squareSizeA);
            int y=random.nextInt(HEIGHT-squareSizeB);
            setRandomColor(graphics);
            graphics.drawRect(x,y,squareSizeA,squareSizeB);
        }

    }
    public static void setRandomColor(Graphics graphics){
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