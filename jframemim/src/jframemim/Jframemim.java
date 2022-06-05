/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframemim;

import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Jframemim extends JFrame{
    JButton tt;
    Label l;
public Jframemim(){
this.setTitle("tablo");
this.setSize(300,250);

this.setVisible(true);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   double d=Double.parseDouble(tt.getText());
l.setText(String.valueOf(d));

}
    
    public static void main(String[] args) {
        new Jframemim();
        
    }

    private void setText(String hava) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
