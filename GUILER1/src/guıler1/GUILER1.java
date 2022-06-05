
package guıler1;
import java.applet.Applet;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JApplet;

public class GUILER1 extends Applet{
    
public void init(){
   
    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    setLayout(gbl);
    gbc.fill=GridBagConstraints.BOTH;
    gbc.gridx=0;gbc.gridy=0;gbc.gridwidth=5;gbc.gridheight=1;
    Label lb1 = new Label("Username");
    gbl.setConstraints(lb1, gbc);
    add(lb1);
    gbc.gridx=6;gbc.gridy=0;gbc.gridwidth=5;gbc.gridheight=1;
 TextField t1=new TextField(25);
 gbl.setConstraints(t1, gbc);
 add(t1);
 gbc.gridx=0;gbc.gridy=1;gbc.gridwidth=5;gbc.gridheight=1;
 Label l2=new Label("password");
 gbl.setConstraints(l2, gbc);
 add(l2);
 gbc.gridx=6;gbc.gridy=1;gbc.gridwidth=5;gbc.gridheight=1;
 TextField t2=new TextField(25);
 gbl.setConstraints(t2, gbc);
 add(t2);
  gbc.gridx=6;gbc.gridy=4;gbc.gridheight=2;gbc.gridwidth=5;
  Button b=new Button("Giriş");
  gbl.setConstraints(b, gbc);
  add(b);
   gbc.gridx=6;gbc.gridy=6;gbc.gridheight=2;gbc.gridwidth=5;
  Button bb=new Button("Kaydol");
  gbl.setConstraints(bb, gbc);
  add(bb);
    gbc.gridx=5;gbc.gridy=34;gbc.gridheight=6;gbc.gridwidth=5;
  Button bbb=new Button("Şifremi Unuttum");
  gbl.setConstraints(bbb, gbc);
  add(bbb);
}
}
