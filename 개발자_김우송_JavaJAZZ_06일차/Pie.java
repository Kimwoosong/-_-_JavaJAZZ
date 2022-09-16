import java.awt.*;
import javax.swing.*;

public class Pie extends JFrame {
    int i = 0;

    Pie() {
        setTitle("파이 돌리기");

        JButton button = new JButton("클릭");
        JPanel panel = new JPanel();
        panel.add(button);
        button.addActionListener(e -> {
            i = ++i % 5;
            System.out.println(i);
            repaint();
        });

        class MyPanel extends JPanel {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Color[] c = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.BLACK };

                g.setColor(c[i]);
                g.fillArc(40, 30, 150, 150, i * 72, 72);
            }
        }

        add(panel, BorderLayout.NORTH);
        add(new MyPanel(), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280, 280);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Pie();
    }
}
