import java.awt.*;
import javax.swing.*;

public class Addtion extends JFrame {
    Addtion() {
        setLayout(new BorderLayout(10, 10));
        String s1, s2;
		int sum;

		s1 = JOptionPane.showInputDialog("첫 번째 숫자는?");
		s2 = JOptionPane.showInputDialog("두 번째 숫자는?");

		sum = Integer.parseInt(s1) + Integer.parseInt(s2);
		JOptionPane.showMessageDialog(null, "합 = " + sum);
    }

	public static void main(String[] args) {
		new Addtion();
	}
}