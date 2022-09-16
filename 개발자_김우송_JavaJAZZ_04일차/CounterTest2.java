import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CounterTest2 extends JFrame implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JButton b1;

    CounterTest2() {
        setTitle("카운터");

        JPanel p = new JPanel();
        label = new JLabel("카운트 = 0");
        p.add(label);
        add(p, BorderLayout.CENTER);

        JPanel p2 = new JPanel();
        b1 = new JButton("시작");
        b1.addActionListener(this);
        JButton b2 = new JButton("초기화");
        b2.addActionListener(e -> {
            count = 0;
            label.setText("카운트 = 0");
        });
        p2.add(b1);
        p2.add(b2);
        add(p2, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Thread(() -> {
            while (true) {
                count++;
                label.setText("카운트 = " + count);
                try {
                    Thread.sleep(500);
                } catch (Exception ex) {
                }
                if (count == 0) {
                    break;
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new CounterTest2();
    }
}
