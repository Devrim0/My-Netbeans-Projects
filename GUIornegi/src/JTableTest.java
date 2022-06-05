
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class JTableTest extends JFrame {

    String data[][] = {{"Didem", "Damla", "Berna"},
    {"Volkan", "Koray", "İlknur"},
    {"Merve", "Fehime", "Sabri"},
    {"Neslihan", "Ceyda", "Mine"},};
    String fields[] = {"Kolon1", "Kolon2", "Kolon3"};

    public static void main(String[] argv) {
        JTableTest jtt = new JTableTest("JTable Örneği");
    }

    public JTableTest(String title) {

        super(title);
        setSize(150, 150);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
                System.exit(0);
            }
        });
        init();
        pack();
        setVisible(true);
    }

    private void init() {
        JTable jt = new JTable(data, fields);
        JScrollPane pane = new JScrollPane(jt);
        getContentPane().add(pane);
    }
}
