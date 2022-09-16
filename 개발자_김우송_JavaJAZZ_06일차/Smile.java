import java.awt.*;
import javax.swing.*;

public class Smile extends JFrame {
    public Smile() {
        setTitle("얼굴");
        add(new CustomePanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260, 260);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Smile();
    }

    class CustomePanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // yellow face
            g.setColor(Color.ORANGE);
            g.fillOval(10, 10, 200, 200);

            // outline of face
            g.setColor(Color.BLACK);
            g.drawOval(10, 10, 200, 200);

            // left eye white
            g.setColor(Color.WHITE);
            g.fillOval(35, 35, 30, 50);

            // left eye outline
            g.setColor(Color.BLACK);
            g.drawOval(35, 35, 30, 50);

            // left eye ball
            g.setColor(Color.BLACK);
            g.fillOval(40, 40, 15, 25);

            // right eye white
            g.setColor(Color.WHITE);
            g.fillOval(110, 35, 30, 50);

            // right eye outline
            g.setColor(Color.BLACK);
            g.drawOval(110, 35, 30, 50);

            // right eye ball
            g.setColor(Color.BLACK);
            g.fillOval(115, 40, 15, 25);

            // nose color
            g.setColor(Color.ORANGE.brighter());
            g.fillOval(66, 76, 30, 25);

            // nose outline
            g.setColor(Color.BLACK);
            g.drawOval(66, 76, 30, 25);

            // mouth inside
            g.setColor(Color.RED);
            g.fillArc(30, 110, 140, 50, 0, -180);

            // mouth inside
            g.setColor(Color.ORANGE);
            g.fillOval(30, 110, 140, 40);
        }
    }
}
