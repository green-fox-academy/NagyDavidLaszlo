import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {

    public static void gettingTieForm(int a, int c, Graphics graphics) {
        a = 5;
        c = 5;

        for (int i = 0; i < 9; i++) {

            a = c + a;
            c = c + i * 6;

            graphics.setColor(Color.magenta);
            graphics.fillRect((5 + a), (5 + a), c, c);

        }
    }

    public static void mainDraw(Graphics graphics)
        {// Reproduce this:
            // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]

            int x = 0;
            int y = 0;

            gettingTieForm(x, y, graphics); }




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