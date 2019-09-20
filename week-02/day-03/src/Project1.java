

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Project1 {

    public static void mainDraw(Graphics graphics) {

        for (int i = 0; i <500 ; i+=20) {
            graphics.setColor(new Color(0x5E2155));
            graphics.drawLine(i,0,500,i);
        }

        for (int i = 0; i <500 ; i+=20) {
            graphics.setColor(new Color(0x194E59));
            graphics.drawLine(0,i,i,500);
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
