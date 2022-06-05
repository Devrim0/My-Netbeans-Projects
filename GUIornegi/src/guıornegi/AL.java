
package guıornegi;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
public class AL extends JFrame implements ActionListener {
 TextField text = new TextField(20);
 Button b;
private int numClicks = 0; 

public static void main(String[] args) {
 AL myWindow = new AL("Window Örneği");
 myWindow.setSize(350,100);
 myWindow.setVisible(true);
 }
public AL(String title) {
 super(title);
 setLayout(new FlowLayout());

 b = new Button("Tıkla");
 add(b);
 add(text);
 b.addActionListener(this);
 }
public void actionPerformed(ActionEvent e) {
 numClicks++;
 text.setText("Düğme " + numClicks + " kez tıklandı");
 }
} 
    

