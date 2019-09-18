import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void centeredRectangles(Graphics graphics)


    {
        Random rand = new Random();
        int n = rand.nextInt(300);  //éle

        graphics.setColor(Color.magenta);
        graphics.drawRect(250 - (n / 2), 250 - (n / 2), n, n);
    }


    public static void mainDraw(Graphics graphics) {
        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.


        for (int i = 0; i < 3; i++) {


            centeredRectangles(graphics);

        }




/*
        Random rand = new Random();
        int n = rand.nextInt(300);  //éle


        graphics.setColor(Color.magenta);
        graphics.drawRect(250-(n/2), 250-(n/2),n,n);
*/
// 1.pozi x = 250-(n/2)


    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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