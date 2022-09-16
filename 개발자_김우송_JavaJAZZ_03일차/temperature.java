import java.awt.*;
import javax.swing.*;

public class temperature extends JFrame {
    temperature() {
        setTitle("섭씨->화씨 변환");

        setLayout(new BorderLayout(50, 50));
        showtemp();
        showbutton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    void showtemp() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2, 0));

        JLabel l1 = new JLabel("섭씨");
        JLabel l2 = new JLabel("화씨");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);

        panel.add(p1);
        panel.add(p2);
        add(panel, BorderLayout.NORTH);
    }

    void showbutton() {
        JPanel p = new JPanel();
        JButton b = new JButton("변환");

        p.add(b);

        add(p, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new temperature();
    }
}
