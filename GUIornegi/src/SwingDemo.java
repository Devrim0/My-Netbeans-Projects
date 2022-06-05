import java.awt.GraphicsConfiguration;
import java.awt.Label;
import javax.swing.JFrame;
public class SwingDemo extends JFrame {
 private javax.swing.JLabel jLabel = null;
 private javax.swing.JTextField jTextField = null;
 private javax.swing.JButton jButton = null;
    private Label label;
    int b=0,a=0,c=0;
 public SwingDemo() {
 
 this.setSize(300, 200);
 this.getContentPane().setLayout(null);
 this.add(getJLabel(), null);
 this.add(getJTextField(), null);
 this.add(getJButton(), null);
 this.setTitle("Merhaba Swing");
 } 

 private javax.swing.JLabel getJLabel() {
 if (jLabel == null) {
 jLabel = new javax.swing.JLabel();
 jLabel.setBounds(34, 49, 53, 18);
 jLabel.setText("hazirla");

 }
 
 return jLabel;
 }
 private javax.swing.JTextField getJTextField() {
 if (jTextField == null) {
 jTextField = new javax.swing.JTextField();
 jTextField.setBounds(96, 49, 160, 20);
  a=Integer.parseInt(jTextField.getText());
 }

    return jTextField;
 }
 private javax.swing.JButton getJButton() {
 if (jButton == null) {
 jButton = new javax.swing.JButton();
 jButton.setBounds(103, 110, 71, 27);
 jButton.setText("OK");
 }
 return jButton;
 }
public  Label label(){
   if(label==null){
      label.setBounds(103, 110, 71, 27);
       c+=a+b;
   label.setText(String.valueOf(c));
   }  
 return label;
}

 public static void main(String[] args) {
 SwingDemo sd = new SwingDemo();
 sd.setVisible(true);
 }
}
