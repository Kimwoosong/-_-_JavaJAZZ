import javax.swing.*;

public class AdjustmentListenerDemo extends JFrame {
    AdjustmentListenerDemo() {
        setTitle("스크롤바 손잡이 움직이기");

        JLabel label = new JLabel("", JLabel.CENTER);

        JScrollBar bar = new JScrollBar(JScrollBar.HORIZONTAL); // 수평 스크롤바 생성
        bar.setValues(50, 10, 0, 100);
        // 초깃값이 50, 단추크기가 10, 범위가 0부터 100미만인 스크롤바 생성

        bar.addAdjustmentListener(e -> {
            int v = e.getValue();
            label.setText("위치 : " + v);
        }); // 스크롤바에 AdjustmentEvent가 발생하면 처리할 리스너 등록

        add("Center", label);
        add("North", bar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdjustmentListenerDemo();
    }
}
