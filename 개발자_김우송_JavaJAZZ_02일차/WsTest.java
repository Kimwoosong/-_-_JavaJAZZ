import javax.swing.*;

public class WsTest extends JFrame {
    WsTest() {
        setTitle("안녕 스윙!"); // 제목값

        JPanel p = new JPanel(); // 새 패널
        JLabel l = new JLabel("안녕, 스윙!"); // 새 라벨값
        JButton b = new JButton("버튼"); // 버튼에 "버튼" 넣기

        p.add(l); // 라벨 추가
        p.add(b); // 버튼 추가
        add(p); // 패널 추가

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setSize(300, 100);
        pack(); // pack()은 아주 작은 사이즈로 창 출력
        setVisible(true);
    }

    public static void main(String[] args) {
        new WsTest(); // 함수 실행
    }
}
