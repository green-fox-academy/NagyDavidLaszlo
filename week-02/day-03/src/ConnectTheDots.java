import com.sun.xml.internal.fastinfoset.util.ValueArray;
import sun.awt.SunHints;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

   public static void drawLines(int[][]x , Graphics graphic) {
       for (int i = 0; i < x.length - 1; i++) {

           graphic.drawLine(x[i][0], x[i][1], x[i + 1][0], x[i + 1][1]);


       }
   }



    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}


            //              1       2           3           4
        int [][] box ={{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int [][] hex = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                {120, 100}, {85, 130}, {50, 100}};
        //     graphics.drawLine(box[0][0],box[0][1], box[1][0], box[1][1]);





drawLines(box,graphics);

graphics.drawLine(10,290,10,10);

drawLines(hex,graphics);






  /*      ArrayList<Integer> points = new ArrayList<>();




        for (int i = 0; i <4; i++) {
            for (int j = 0; j <2; j++) {
                points.add(box[i][j]);
            }
        }

*/











/*
        for (int mypoint: points                // tesitong values for ArrayList points
             ) {
            System.out.println(mypoint);
        }

*/






    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

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