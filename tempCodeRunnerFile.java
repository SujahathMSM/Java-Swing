import javax.swing.*;
import java.awt.*;

class Customer extends JFrame{
    JLabel header;
    Customer(){
        setSize(400, 400);
        setTitle("Customer Add Form...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        header = new JLabel("Customer Forum");
        header.setFont(new Font("", 1, 