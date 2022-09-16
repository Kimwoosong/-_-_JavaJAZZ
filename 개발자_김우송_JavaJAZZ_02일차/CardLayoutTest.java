import java.awt.*;
import javax.swing.*;

public class CardLayoutTest extends JFrame {
    CardLayout layout; // 카드 레이아웃 초기화

    public void rotate() {
        while (true) {
            try {
                Thread.sleep(500); // 0.5초에 한번씩 반복되게 설정
            } catch (Exception e) {
            }
            layout.next(this.getContentPane()); // 트라이문이 완료되면 실행(다음 카드레이아웃으로 넘기기)
        }
    }

    CardLayoutTest() {
        setTitle("카드 레이아웃!");
        layout = new CardLayout();
        setLayout(layout);

        add(new JButton("버튼 0"));
        add(new JButton("버튼 1"));
        add(new JButton("버튼 2"));
        // 역시 순서는 위에서 아래로 넣어짐

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutTest().rotate();
    }
}
