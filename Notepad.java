import javax.swing.JFrame;

class Note extends JFrame{
    Note(){
        setSize(400, 300);
        setTitle("Note Pad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);
    }
}

public class Notepad {
    public static void main(String[] args) {
        new Note();
    }
}
