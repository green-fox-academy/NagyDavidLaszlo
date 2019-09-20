
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {

    public static void mainDraw(Graphics graphics) {


        // alap:16 (és 8), magasság: 15- > egyenlőszárú ezekkel mozgatom (a szára egyébként 17, de az nem kell)








        int a = 6;
        int x;
        int h = 490;


        //   for (int i = 0; i <a ; i=16) {
        //  graphics.drawPolygon(new int[]{10, 26, 18}, new int[]{490, 490, 475}, 3); -> a kezdő háromszögem

        for (int j = 0; j < a; j++) {           // "a"-szor lefut,ez az alsó sor háromszögeinek száma
            x = 10 + (j + 1) * 8;               // kezdő háromszög bal alső csücske (10,490)
            h = h - 15;

            for (int i = 0; i < a - j; i++) {

                x = x + 16;
                graphics.drawPolygon(new int[]{x, x + 16, x + 8}, new int[]{h, h, h - 15}, 3);
            }
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