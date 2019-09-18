import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void functionRectanle (int a , float v, Graphics draw)
    {


    }



    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        for (int i = 0; i <4; i++) {


            createRectangle(graphics);

        }


/*
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

        Color randomColor = new Color(r, g, b);
        int n = rand.nextInt(300);
        int m = rand.nextInt(300);
        int k = rand.nextInt(300);



        graphics.setColor(new Color(r,b,g));
        // graphics.drawLine(25,25, 75,25);

        graphics.drawRect(n,m,k,k);

        float v = rand.nextFloat(); */


      //  functionTest(5,3,2,4);

         // 500 canvas oldala, ennél nem akartam nagyobbat




    }

    public static void createRectangle(Graphics graphics) {

        Random rand = new Random();

        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();

        Color randomColor = new Color(r, g, b);
        int n = rand.nextInt(300);
        int m = rand.nextInt(300);
        int k = rand.nextInt(300);



        graphics.setColor(new Color(r,b,g));
        // graphics.drawLine(25,25, 75,25);

        graphics.drawRect(n,m,k,k);

        float v = rand.nextFloat();






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