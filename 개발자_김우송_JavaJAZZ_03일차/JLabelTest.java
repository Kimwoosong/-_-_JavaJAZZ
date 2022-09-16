import javax.swing.*;

public class JLabelTest extends JFrame {
    JLabelTest() {
        setTitle("도장 이미지 출력하기");

        ImageIcon icon = new ImageIcon(this.getClass().getResource("도장.jpg"));
        JLabel label = new JLabel("도장", icon, JLabel.CENTER);
        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelTest();
    }
}