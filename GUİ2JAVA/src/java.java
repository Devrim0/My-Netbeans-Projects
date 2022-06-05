
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class java extends JFrame{
private Label l,l1;
public Button button;
public TextField t;

public java(){

}
 public void init(){
 l=new Label("sainye giriniz");
 
 t=new  TextField(30);
 l1=new Label("sonuc");
 }
 public void buttonActionPerformed(){
 button=new Button("Hesapla");
 add(button);
 }
    public static void main(String[] args) {
        JFrame j=new JFrame("uygulamam");
        
        j.setBounds(20,30,500,400);
        
    j.setVisible(true);}
            
}