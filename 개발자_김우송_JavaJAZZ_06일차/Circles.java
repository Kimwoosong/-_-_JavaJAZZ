import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circles extends JFrame {
    Circles() {
        setTitle("동심원 색깔넣기");

        class MyPanel extends JPanel {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                Color[] c = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                        Color.BLUE, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                        Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                        Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                        new Color(0x000080), new Color(0x800080) };
                for (int i = 0; i < c.length; i++) {
                    int d = delta(i);
                    g.setColor(c[i]);
                    g.drawOval(100 + d, 100 + d, 500 - d * 2, 500 - d * 2);
                }
            }
        }
        add(new MyPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
    }

    int delta(int x) {
        double diagonal = Math.sqrt(240 * 240);
        return (int) (diagonal * 15 * x / 240);
    }

    public static void main(String[] args) {
        new Circles();
    }
}
