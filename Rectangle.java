/*The 2D Shape API is actually really powerful, one of my favourite classes is the Path2D, it allows you to simply "draw" a virtual shape, for example*/

public class Diamond extends Path2D.Double {

    public Diamond(double width, double height) {
        moveTo(0, height / 2);
        lineTo(width / 2, 0);
        lineTo(width, height / 2);
        lineTo(width / 2, height);
        closePath();
    }

}

/*Now, you need to make use of an AffineTransformation or translate the Graphics context to position it, but that's not that hard

Diamonds are forever*/

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JavaApplication251 {

    public static void main(String[] args) {
        new JavaApplication251();
    }

    public JavaApplication251() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        private Diamond diamond;

        public TestPane() {
            diamond = new Diamond(100, 100);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            int x = (getWidth() - diamond.getBounds().width) / 2;
            int y = (getHeight()- diamond.getBounds().height) / 2;
            AffineTransform at = AffineTransform.getTranslateInstance(x, y);
            Shape shape = at.createTransformedShape(diamond);
            g2d.setColor(Color.YELLOW);
            g2d.fill(shape);
            g2d.setColor(Color.RED);
            g2d.draw(shape);
            g2d.dispose();
        }

    }

    public class Diamond extends Path2D.Double {

        public Diamond(double width, double height) {
            moveTo(0, height / 2);
            lineTo(width / 2, 0);
            lineTo(width, height / 2);
            lineTo(width / 2, height);
            closePath();
        }

    }

}

