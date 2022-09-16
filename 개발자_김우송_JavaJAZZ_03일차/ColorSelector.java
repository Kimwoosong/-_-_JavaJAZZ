import java.awt.*;
import javax.swing.*;

public class ColorSelector extends JFrame {
    ColorSelector() {
        setTitle("색상 선택기");

        setLayout(new BorderLayout(4, 10));
        showcombo();
        showcheck();
        showbutton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 170);
        setVisible(true);

    }

    void showcombo() {
        String[] color = { "빨간색", "초록색", "파란색" };

        JPanel p = new JPanel();
        JComboBox<String> cb = new JComboBox<>(color);
        p.add(cb);

        add(p, BorderLayout.NORTH);
    }

    void showcheck() {
        JPanel p = new JPanel();
        JCheckBox c1 = new JCheckBox("배경색");
        JCheckBox c2 = new JCheckBox("전경색");

        p.add(c1);
        p.add(c2);

        add(p, BorderLayout.CENTER);
    }

    void showbutton() {
        JPanel p = new JPanel();
        JButton b1 = new JButton("예");
        JButton b2 = new JButton("아니오");

        p.add(b1);
        p.add(b2);

        add(p, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new ColorSelector();
    }
}
