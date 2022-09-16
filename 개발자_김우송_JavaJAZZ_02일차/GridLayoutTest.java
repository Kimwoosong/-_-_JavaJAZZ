import java.awt.*;
import javax.swing.*;

public class GridLayoutTest extends JFrame {
    GridLayoutTest() {
        setTitle("그리드 레이아웃!");
        setLayout(new GridLayout(0, 3));
        // borderlayout방식과는 달리 행과열을 고정으로 지정하여 사용가능

        add(new JButton("B 1"));
        add(new JButton("버튼2"));
        add(new JButton("Button 3"));
        add(new JButton("Button Four"));
        // 순서는 위에서부터 아래로 차례로 들어감

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutTest();
    }
}
