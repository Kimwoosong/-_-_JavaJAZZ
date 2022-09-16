import java.awt.*;
import javax.swing.*;

public class TrafficS extends JFrame {
    class CustomPanel extends JPanel {
        public void paintComponent(Graphics g) {
            int circleRadius = 30;
            int circleDiameter = circleRadius * 2;

            int centerX = 140;
            int centerY = 50;

            int top = centerY - circleRadius;

            int yellowLeft = centerX - circleRadius;
            int redLeft = yellowLeft - circleDiameter;
            int greenLeft = yellowLeft + circleDiameter;

            super.paintComponent(g);

            g.setColor(Color.GRAY);
            g.fillRoundRect(redLeft, top, circleDiameter * 3, circleDiameter, circleRadius, circleRadius);

            g.setColor(Color.RED);
            g.fillOval(redLeft, top, circleDiameter, circleDiameter);

            g.setColor(Color.YELLOW);
            g.fillOval(yellowLeft, top, circleDiameter, circleDiameter);

            g.setColor(Color.GREEN);
            g.fillOval(greenLeft, top, circleDiameter, circleDiameter);
        }
    }

    public TrafficS() {
        setTitle("신호등");

        add(new CustomPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TrafficS();
    }
}
