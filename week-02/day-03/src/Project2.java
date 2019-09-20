import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class Project2 {

        public static void getDrawing (Graphics graphics)
        {
            for (int i = 0; i <WIDTH/2; i+=10) {
                graphics.setColor(new Color(0x194E59));
                graphics.drawLine(WIDTH/2,i,WIDTH/2+i,HEIGHT/2);
                graphics.drawLine(WIDTH/2,i,WIDTH/2-i,HEIGHT/2);
                graphics.drawLine(i, HEIGHT/2, WIDTH/2,HEIGHT/2+i);
                graphics.drawLine(WIDTH/2+i,HEIGHT/2,WIDTH/2,HEIGHT-i);
            }


        }



        public static void mainDraw(Graphics graphics) {

           getDrawing(graphics);


/*
            for (int i = 0; i <WIDTH/2; i+=10) {
                graphics.setColor(new Color(0x194E59));
                graphics.drawLine(WIDTH/2,i,WIDTH/2+i,HEIGHT/2);
                graphics.drawLine(WIDTH/2,i,WIDTH/2-i,HEIGHT/2);
                graphics.drawLine(i, HEIGHT/2, WIDTH/2,HEIGHT/2+i);
                graphics.drawLine(WIDTH/2+i,HEIGHT/2,WIDTH/2,HEIGHT-i);
            }
*/
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




