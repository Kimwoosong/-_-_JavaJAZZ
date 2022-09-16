import java.awt.*;
import javax.swing.*;

public class BoxLayoutP extends JFrame {

    BoxLayoutP() {
        setTitle("박스 레이아웃");
        JPanel p = new JPanel();
        BoxLayout boxLayout = new BoxLayout(p, BoxLayout.X_AXIS);
        p.setLayout(boxLayout);

        p.add(new JButton("버튼 1"));
        p.add(new JButton("버튼 2"));
        p.add(new JButton("버튼 3"));
        p.add(new JButton("버튼 4"));
        p.add(new JButton("버튼 5"));
        add(p, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        new BoxLayoutP();
    }
}
