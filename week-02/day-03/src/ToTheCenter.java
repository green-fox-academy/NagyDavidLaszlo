import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {


    public static void function (int a, int b ,  Graphics draw)    //METHOD
    {

        for (int i = 0; i <3 ; i++) {
            draw.setColor(Color.RED);
            draw.drawLine((a*i), (b+10*i), 250, 250);
        }

    }




    public static void mainDraw(Graphics graphics) {                //PROGRAM
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.



        int x = 0;
        int y= 0;
        function(x,y,graphics);




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