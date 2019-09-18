import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        int starSize=1;
        int starNumbers=100;
        Random random=new Random();
        int x,y;
        //graphics.setColor(Color.BLACK);
        //graphics.fillRect(0,0,WIDTH,HEIGHT);
        for (int i = 0; i < starNumbers; i++) {
            setRandomColor(random,graphics);
            x=random.nextInt(WIDTH);
            y=random.nextInt(HEIGHT);
            graphics.fillRect(x, y, starSize, starSize);
        }

    }
    public static void setRandomColor(Random random,Graphics graphics){
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

        panel.setBackground(Color.BLACK);

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