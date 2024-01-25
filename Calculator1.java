import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Calculator extends JFrame{

    JButton button;
    JLabel lable;

    Calculator() {  // Adding Constuctor
        setSize(400, 300);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // setLayout(new BorderLayout);

        button = new JButton();
        button.setText("Button");
        add("South",button);

        lable = new JLabel();
        lable.setText("This is a label");
        add("North", lable);

        setVisible(true);

    }

}
public class Calculator1 {
    public static void main(String[] args) {
        new Calculator();
    }
}
