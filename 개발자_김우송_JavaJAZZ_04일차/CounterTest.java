import java.awt.*;
import javax.swing.*;

public class CounterTest extends JFrame {
    private int count = 0;
    private JLabel label;

    CounterTest() {
        setTitle("카운터");

        JPanel p = new JPanel();
        JPanel p2 = new JPanel();
        label = new JLabel("개수 = 0");
        p.add(label);
        add(p, BorderLayout.NORTH);
        JButton b1 = new JButton("증가");
        b1.addActionListener(e -> { // 버튼에 증가효과 추가(count를 하나씩 추가함, 라벨에 개수 = count를 추가)
            count++;
            label.setText("개수 = " + count);
        });
        JButton b2 = new JButton("초기화");
        b2.addActionListener(e -> {
            count = 0;
            label.setText("개수 = 0");
        });

        p2.add(b1);
        p2.add(b2);

        add(p2, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterTest();
    }
}
