import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame{

    JTextField text;
    JButton[] btnArrays;
    Calculator(){
        setSize(400, 300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        text = new JTextField();
        text.setPreferredSize(new Dimension(400, 50));
        add("North", text);

        JPanel main = new JPanel();
        main.setLayout(new GridLayout(4, 4));
        btnArrays = new JButton[16];
        String[] buttons = {"7", "8", "9", "*", "4", "5", "6", "/", "1", "2", "3", "+", "0", ".", "=", "-"};

        for (int i = 0; i < btnArrays.length; i++){
            btnArrays[i] = new JButton(buttons[i]);
            main.add(btnArrays[i]);
        }
        add(main);
        setVisible(true);
    }
}
public class NewCalc {
    public static void main(String[] args) {
        new Calculator();
    }
}
