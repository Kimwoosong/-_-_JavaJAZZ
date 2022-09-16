import java.awt.*;
import javax.swing.*;

public class BorderLayoutTest extends JFrame {
    BorderLayoutTest() {
        setTitle("보더 레이아웃!");
        setLayout(new BorderLayout());

        add("East", new JButton("백호"));
        add("West", new JButton("청룡"));
        add("South", new JButton("주작"));
        add(new JButton("현무"), BorderLayout.NORTH); // 대문자를 소문자로 바꾸면 오류발생
        add(new JButton("개발자_김우송"), BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);

    }

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
