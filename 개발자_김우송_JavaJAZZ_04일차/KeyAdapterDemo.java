import java.awt.event.*;
import javax.swing.*;

public class KeyAdapterDemo extends JFrame {
    public KeyAdapterDemo() {
        setTitle("키 어댑터");

        JLabel l = new JLabel("", JLabel.CENTER);
        JTextField t = new JTextField(10);

        add("North", t);
        add("Center", l);

        t.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    l.setText("입력한 문자열: " + t.getText());
                } // KeyListener와 달리 필요한 메서드만 오버라이딩 하면 된다.
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyAdapterDemo();
    }
}
