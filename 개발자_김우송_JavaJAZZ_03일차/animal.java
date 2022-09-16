import java.awt.*;
import javax.swing.*;

public class animal extends JFrame {
    animal() {
        setTitle("애완 동물");
        setLayout(new BorderLayout(10, 10));
        JPanel p = new JPanel();
        JRadioButton r1 = new JRadioButton("강아지");
        JRadioButton r2 = new JRadioButton("고양이");
        JRadioButton r3 = new JRadioButton("금붕어");

        ButtonGroup bg = new ButtonGroup();

        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        p.add(r1);
        p.add(r2);
        p.add(r3);

        add(p, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);

    }

    public static void main(String[] args) {
        new animal();
    }
}
