import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class DrawRectangle extends JFrame {


        public DrawRectangle() {
            super("Rectangles Drawing Demo");

            getContentPane().setBackground(Color.WHITE);
            setSize(480, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        }

        void drawRectangles(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            double x = 100d;
            double y = 48.8d;
            double width = 213.2d;
            double height = 100.6d;

            Rectangle2D.Double rect = new Rectangle2D.Double(x, y, width, height);
            g2d.draw(rect);



        }

        public void paint(Graphics g) {
            super.paint(g);
            drawRectangles(g);
        }

        public static void main(String[] args) throws Exception {

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new DrawRectangle().setVisible(true);
                }
            });
        }
    }

