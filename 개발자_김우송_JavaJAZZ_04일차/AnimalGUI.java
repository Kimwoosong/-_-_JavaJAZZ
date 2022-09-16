import java.awt.*;
import javax.swing.*;
// import java.awt.event.*;

public class AnimalGUI extends JFrame {
    AnimalGUI() {
        setTitle("애완 동물");
        setLayout(new BorderLayout(10, 10));
        JPanel p = new JPanel();
        JRadioButton pet[] = new JRadioButton[3];
        String animal[] = { "강아지", "고양이", "금붕어" };
        ImageIcon[] image = {
                new ImageIcon(".jpg"), new ImageIcon(".jpg"),
                new ImageIcon(".jpg")
        };
        ButtonGroup bg = new ButtonGroup();

        for (int i = 0; i < pet.length; i++) {
            pet[i] = new JRadioButton(animal[i]);
            bg.add(pet[i]);
            p.add(pet[i]);
        }

        add(p, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 110);
        setVisible(true);

    }

    public static void main(String[] args) {
        new AnimalGUI();
    }

}
