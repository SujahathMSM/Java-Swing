import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

class Calculator extends JFrame{
    JButton nButton;
    JButton sButton;
    JButton eButton;
    JButton wButton;
    JButton cButton;
    
    Calculator(){  // Default Constructor
        setSize(400, 300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER)); // Default is Centered
        // inside the FlowLayout(FlowLayout.RIGHT/LEFT/CENTER/LEADING/TRAILING)

        nButton = new JButton();
        nButton.setText("North Btn");
        add("North", nButton);

        sButton = new JButton();
        sButton.setText("South Btn");
        add("South", sButton);

        eButton = new JButton();
        eButton.setText("East Btn");
        add("East", eButton);

        cButton = new JButton();
        cButton.setText("Center Btn");
        add("Center", cButton);

        wButton = new JButton();
        wButton.setText("West Btn");
        add("West", wButton);

        setVisible(true);
    }
}

public class Flwlayout {
    public static void main(String[] args) {
        new Calculator();
    }
}
