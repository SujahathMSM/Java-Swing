import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

class Calculator extends JFrame{
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;

    Calculator(){
        setSize(400, 300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 2));

        btn1 = new JButton();
        btn1.setText("Button1");
        add(btn1);

        btn2 = new JButton();
        btn2.setText("Button2");
        add(btn2);

        btn3 = new JButton();
        btn3.setText("Button3");
        add(btn3);

        btn4 = new JButton();
        btn4.setText("Button4");
        add(btn4);

        setVisible(true);
    }
}

public class Grdlayout {
    public static void main(String[] args) {
        new Calculator();
    }
}
