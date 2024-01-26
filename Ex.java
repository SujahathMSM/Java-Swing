import javax.swing.*;
import javax.swing.table.*;

class ViewCustomer extends JFrame {
    JTable customerTable;
    DefaultTableModel model;

    ViewCustomer() {
        setSize(600, 500);
        setTitle("Vew Customer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columnNames = { "id", "Name", "Address", "NIC" };
        model = new DefaultTableModel(columnNames, 0);

        customerTable = new JTable(model);
        String[] rowData = { "C001", "Customer 1", "Panadura", "675567890V" };
        model.addRow(rowData);

        JScrollPane jScrollPane = new JScrollPane(customerTable);
        add("Center", jScrollPane);
        setVisible(true);
    }
}

class Ex{
    public static void main(String[] args) {
        new ViewCustomer();
    }
}
