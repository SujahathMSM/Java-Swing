import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {
    JButton buttonArray[]; // Array of Buttons

    Calculator() {
        setSize(400, 300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 4));
        buttonArray = new JButton[16]; // 4x4 = 16 buttons
        String[] buttonNames = { "7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "+", "0", ".", "=", "-" };

        for (int i = 0; i < 16; i++) {
            buttonArray[i] = new JButton(buttonNames[i]);
            add(buttonArray[i]);
        }

        setVisible(true);
    }
}

public class Calcbtn {
    public static void main(String[] args) {
        new Calculator();
    }
}
