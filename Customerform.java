import javax.swing.*;
import java.awt.*;

class Customer extends JFrame{
    JLabel header, id, name, address, nic ;
    JButton btnAdd, btnCancel;
    JTextField idTxt, nameTxt, addressTxt, nicTxt; 
    Customer(){
        setSize(400, 400);
        setTitle("Customer Add Form...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        header = new JLabel("Customer Forum");
        header.setFont(new Font("", 1, 30));
        header.setHorizontalAlignment(JLabel.CENTER);
        add("North", header);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnAdd = new JButton("Add");
        btnAdd.setFont(new Font("", 1, 15));
        buttonPanel.add(btnAdd);

        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("", 1, 15));
        buttonPanel.add(btnCancel);

        add("South", buttonPanel);

        JPanel centerPanel = new JPanel(new GridLayout(4, 2));

        /// ID
        id = new JLabel("ID");
        id.setFont(new Font("", 1, 15));

        JPanel idPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idPanel.add(id);
        centerPanel.add(idPanel);


        idTxt = new JTextField(15);
        idTxt.setFont(new Font("", 1, 15));

        JPanel idTextPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        idTextPanel.add(idTxt);
        centerPanel.add(idTextPanel);

        ///

        /// Name
        name = new JLabel("Name");
        name.setFont(new Font("", 1, 15));

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePanel.add(name);
        centerPanel.add(namePanel);

        nameTxt = new JTextField(15);
        nameTxt.setFont(new Font("", 1, 15));

        JPanel nameTextPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        nameTextPanel.add(nameTxt);
        centerPanel.add(nameTextPanel);
        ///


        address = new JLabel("Address");
        address.setFont(new Font("", 1, 15));
        centerPanel.add(address);

        addressTxt = new JTextField(20);
        addressTxt.setFont(new Font("", 1, 15));
        centerPanel.add(addressTxt);


        nic = new JLabel("Address");
        nic.setFont(new Font("", 1, 15));
        centerPanel.add(nic);

        nicTxt = new JTextField(10);
        nicTxt.setFont(new Font("", 1, 15));
        centerPanel.add(nicTxt);


        add("Center", centerPanel);
        setVisible(true);
    }
}

public class Customerform {
    public static void main(String[] args) {
        new Customer();
    }
}
