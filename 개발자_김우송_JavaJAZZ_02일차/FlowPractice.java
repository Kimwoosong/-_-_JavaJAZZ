import java.awt.*;
import javax.swing.*;

public class FlowPractice extends JFrame {
    FlowPractice() {
        setTitle("플로우 레이아웃!");

        JPanel p = new JPanel(new FlowLayout());
        p.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); // 버튼배열을 오른쪽에서 왼쪽으로

        JButton b1 = new JButton("1번");
        JButton b2 = new JButton("2nd");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button Four");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110); // 창크기 늘리면 버튼이 일자로 서고, 줄이면 버튼이 왼쪽에서 오른쪽으로 가다가 아래로내려감.
        setVisible(true);

    }

    public static void main(String[] args) {
        new FlowPractice();
    }
}
