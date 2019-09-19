import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        /*int[][]triangle={{},{},{},{}};
        a harmadik a kövi tömb elsője? ArrayList-tel
        1.2.3. sorváltás 1.:=3. & soron belül 2.:=1.
        +nested for+ piramis logika
         */
        //pitagoraszi számhármas: 17,15,8; 65,56,33;
        int triangleHeigth = 15;//65
        int triangleWidth = 16;//56
        int rows = 10;
        Integer[][] tmp = new Integer[3][2];
        ArrayList<Integer[][]> coordinateList = new ArrayList<>();

        Integer[] seed = {WIDTH / 2 - triangleWidth / 2, triangleHeigth};
        for (){

        for () {
            //zero coordinates
            tmp[0] = seed;
            //1. coord
            tmp[1][0] = tmp[0][0] + triangleWidth / 2;
            tmp[1][1] = tmp[0][1] - triangleHeigth;
            //2. coord
            tmp[2][0] = tmp[1][0] + triangleWidth / 2;
            tmp[2][1] = tmp[1][1] + triangleHeigth;
            //adding to array list.
            coordinateList.add(tmp);
            //new zero coord
            seed = tmp[1];
        }}

        //2.3. szamítás
        //add array list ++

    }

    public static void connector(int[][] dots, Graphics graphics) {
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < dots.length; i++) {
            if (i != dots.length - 1) //last index
            {
                graphics.drawLine(dots[i][0], dots[i][1], dots[i + 1][0], dots[i + 1][1]);
            } else {
                graphics.drawLine(dots[i][0], dots[i][1], dots[0][0], dots[0][1]);
            }

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