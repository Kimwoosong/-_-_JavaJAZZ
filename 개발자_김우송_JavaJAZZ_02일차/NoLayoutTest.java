import javax.swing.*;

public class NoLayoutTest extends JFrame {
    NoLayoutTest() {
        setTitle("절대 좌표");

        JPanel p = new JPanel();
        p.setLayout(null);

        JButton b1 = new JButton("B1");
        b1.setBounds(10, 10, 60, 30);
        JButton b2 = new JButton("B2");
        b2.setBounds(80, 20, 80, 25);
        JButton b3 = new JButton("B3");
        b3.setBounds(150, 30, 100, 30);
        JButton b4 = new JButton("B4");
        b4.setBounds(100, 40, 50, 10);
        JButton b5 = new JButton("B5");
        b5.setBounds(140, 70, 90, 40);
        JButton b6 = new JButton("B6");
        b6.setBounds(110, 50, 120, 60);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NoLayoutTest();
    }
}
