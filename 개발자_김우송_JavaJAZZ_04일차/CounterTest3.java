import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CounterTest3 extends JFrame implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JButton b1;
    Thread thread;

    CounterTest3() {
        setTitle("카운터");

        JPanel p = new JPanel();
        label = new JLabel("개수 = 0");
        p.add(label);
        add(p, BorderLayout.CENTER);

        JPanel p2 = new JPanel();
        b1 = new JButton("시작");
        b1.addActionListener(this);
        p2.add(b1);
        add(p2, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (thread == null || thread.isAlive() == false) {
            b1.setText("중지");
            thread = new Thread(new Counter());
            thread.setDaemon(true);
            thread.start();
        } else {
            b1.setText("계속");
            thread.interrupt();
        }
    }

    public static void main(String[] args) {
        new CounterTest3();
    }

    class Counter implements Runnable {
        public void run() {
            while (true) {
                count++;
                label.setText("개수 = " + count);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    return;
                }
            }
        }
    }
}
