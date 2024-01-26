import javax.swing.*;
import java.awt.*;

class Note extends JFrame{
    TextArea textArea;

    JMenuBar mainMenuBar;
    JMenu fileMenu, editMenu, viewMenu;
    JMenuItem item1, item2, item3, item4, item5,item6, item7;

    Note(){
        setSize(600, 500);
        setTitle("Note Pad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        textArea = new TextArea();
        textArea.setFont(new Font("", 1, 16));

        JScrollPane scrollpane = new JScrollPane(textArea);
        add("Center", scrollpane);

        mainMenuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");

        item1 = new JMenuItem("New");
        fileMenu.add(item1);

        item2 = new JMenuItem("Save");
        fileMenu.add(item2);

        item3 = new JMenuItem("Preferences");
        editMenu.add(item3);

        item4 = new JMenuItem("Rename");
        editMenu.add(item4);



        mainMenuBar.add(fileMenu);
        mainMenuBar.add(editMenu);
        setJMenuBar(mainMenuBar);

        setVisible(true);
    }
}

public class Notepad {
    public static void main(String[] args) {
        new Note();
    }
}
