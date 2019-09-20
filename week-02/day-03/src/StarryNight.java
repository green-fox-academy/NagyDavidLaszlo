import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {

    public static void starGenerator(Graphics graphics)
    {
        for (int i = 0; i <200 ; i++) {
            Random rand = new Random();
            int g = rand.nextInt(255);
            int c = rand.nextInt(485);
            int b = rand.nextInt(485);
            graphics.setColor(new Color(g, g, g));
            graphics.fillRect(c, b, 10, 10);
        }
        }


    public static void mainDraw(Graphics graphics){
            // Draw the night sky:
            //  - The background should be black
            //  - The stars can be small squares
            //  - The stars should have random positions on the canvas
            //  - The stars should have random color (some shade of grey)

            graphics.setColor(Color.BLACK);
            graphics.fillRect(0, 0, WIDTH, HEIGHT);

            starGenerator(graphics);



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