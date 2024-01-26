import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class ViewCustomer extends JFrame{
    JTable customerTable;
    DefaultTableModel defaultTableModel;
    ViewCustomer(){
        setSize(600, 500);
        setTitle("Customer Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columnNames = {"ID", "Name", "Address", "NIC"};
        defaultTableModel = new DefaultTableModel(columnNames);

        customerTable = new JTable(defaultTableModel);

        String[] rowData = {"001", "Customer11", "Colombo", "87473148V"};
        defaultTableModel.addRow(rowData);

        JScrollPane jScrollPane = new JScrollPane(customerTable);
        add("Center", jScrollPane);


        setVisible(true);
    }
}

public class Example {
    public static void main(String[] args) {
        new ViewCustomer();
    }
}
