import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {



    public static void createRectangles (Graphics graphics)
    {
        Random rand = new Random();
        int x = rand.nextInt(300);
        int y = rand.nextInt(300);


        graphics.setColor(Color.magenta);
        graphics.drawRect(x,y,50,50);




    }





    public static void mainDraw(Graphics graphics){
        // create a function that draws one square and takes 3 parameters:
        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.

/*
        Random rand = new Random();
        int x = rand.nextInt(300);
        int y = rand.nextInt(300);


        graphics.setColor(Color.magenta);
        graphics.drawRect(x,y,50,50);


*/

        for (int i = 0; i <3 ; i++) {


            createRectangles(graphics);
        }

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