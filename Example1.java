import javax.swing.*;
import java.awt.*;

public class Example1{
    public static void main(String[] args) {
        JFrame f1 = new JFrame();  // Creating the UI container/ Window
        f1.setSize(400, 300);
        f1.setTitle("My Frame");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);

        JButton button = new JButton();
        button.setText("Click");
        button.setFont(new Font("", 1, 25));
        
        f1.add(button);
        f1.setVisible(true);
    }
}