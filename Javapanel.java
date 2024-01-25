import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {

    JLabel hLabel;
    JLabel fLabel;
    JLabel lLabel;
    JLabel rLabel;

    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;

    Calculator() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        hLabel = new JLabel("Header");
        hLabel.setPreferredSize(new Dimension(400, 75));
        hLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add("North", hLabel);

        fLabel = new JLabel("Footer");
        add("South", fLabel);

        rLabel = new JLabel("Right");
        add("East", rLabel);

        lLabel = new JLabel("left");
        add("West", lLabel);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2));

        btn1 = new JButton("1");
        centerPanel.add(btn1);
        btn2 = new JButton("2");
        centerPanel.add(btn2);
        btn3 = new JButton("3");
        centerPanel.add(btn3);
        btn4 = new JButton("4");
        centerPanel.add(btn4);

        add("Center", centerPanel);

        setVisible(true);
    }
}

public class Javapanel {
    public static void main(String[] args) {
        new Calculator();
    }
}
