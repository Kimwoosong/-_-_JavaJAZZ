import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Circle extends JFrame {
    JTextField t1, t2;
    JTextArea area;
    JButton cal, reset;
    JComboBox cb;

    Circle() {
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 220);
        setVisible(true);

        addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("마우스 클릭");
            }

            public void mousePressed(MouseEvent e) {
                System.out.println("마우스 버튼 누르기");
            }

            public void mouseReleased(MouseEvent e) {
                System.out.println("마우스 버튼 놓기");
            }

            public void mouseEntered(MouseEvent e) {
                System.out.println("마우스 입장");
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("마우스 퇴장");
            }
        }); // MouseListener 익명개체를 이벤트 소스인 프로그램(자신)에 등록

        addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e) {
                System.out.println("마우스 드래그(" + e.getX() + ", " + e.getY() + ").");
            }

            public void mouseMoved(MouseEvent e) {
                System.out.println("마우스 이동(" + e.getX() + ", " + e.getY() + ").");
            }
        }); // MouseMotionListener 익명개체를 이벤트 소스인 프로그램(자신)에 등록
    }

    void showNorth() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2, 0));

        JLabel l1 = new JLabel("원의 반지름");
        JLabel l2 = new JLabel("원의 넓이");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t2.setEnabled(false);

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        panel.add(p1);
        panel.add(p2);

        add(panel, BorderLayout.NORTH);

        KeyListener listener2 = new KeyListener() {
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar() + "를 입력했습니다.");
            } // 키보드를 입력하면 입력한 문자를 화면에 출력

            public void keyReleased(KeyEvent e) {

            } // KeyListener 인터페이스에 있는 추상메서드이므로 사용하지 않아도 필요하다.

            public void keyPressed(KeyEvent e) {

            } // KeyListener 인터페이스에 있는 추상메서드이므로 사용하지 않아도 필요하다.
        };
        t1.addKeyListener(listener2); // 텍스트 필드에 생성된 KeyListener 객체를 등록

    }

    void showCenter() {
        JPanel panel = new JPanel();

        area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타납니다.");
        area.setEditable(false);
        area.setForeground(Color.RED);

        panel.add(area);

        add(panel, BorderLayout.CENTER);
    }

    void showSouth() {
        String[] color = { "red", "blue" };

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        cal = new JButton("계산");
        cb = new JComboBox<>(color);
        reset = new JButton("리셋");

        panel.add(cal);
        panel.add(cb);
        panel.add(reset);

        add(panel, BorderLayout.SOUTH);

        ActionListener listener1 = e -> {
            if (e.getSource() == cal) { // ActionEvent의 소스가 계산버튼인지 조사
                if (t1.getText().isEmpty())
                    area.setText("반지름을 입력하세요");
                else {
                    String s = t1.getText();
                    double radius = Double.parseDouble(s);
                    double result = radius * radius * 3.14;
                    t2.setText("" + result);
                    area.setText(radius + " * " + radius + " * 3.14 = " + result);
                } // 반지름 텍스트 필드에 입력 데이터가 있는지 조사하고 입력데이터가 없다면 오류 메시지를 텍스트 영역에 추가
                // 입력데이터가 있다면 넓이를 계싼 후 넓이 텍스트 필드에 추가하고 계산과정도 텍스트 영역에 추가
            } else {
                t1.setText("");
                t2.setText("");
                area.setText("");
            } // ActionEvent의 소스가 리셋 버튼이므로 반지름과 넓이의 텍스트 필드와 텍스트 영역에 있는 내용을 지움
        };

        cal.addActionListener(listener1); // 버튼에 리스너 등록
        reset.addActionListener(listener1); // 버튼에 리스너 등록

        // 콤보박스에 ItemListener 객체를 람다식으로 등록
        cb.addItemListener(e -> {
            int index = ((JComboBox) cb).getSelectedIndex(); // 콤보박스 항목의 인덱스를 가져온다
            if (index == 0)
                area.setForeground(Color.RED); // 콤보박스의 선택한 항목에 따라 글자색 변경
            else
                area.setForeground(Color.BLUE); // 콤보박스의 선택한 항목에 따라 글자색 변경
        });
    }

    public static void main(String[] args) {
        new Circle();
    }
}
