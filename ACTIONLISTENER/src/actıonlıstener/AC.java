
package actıonlıstener;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AC extends Applet implements Runnable{
public int x,y,yaricap,degisim=20;
  
    public void init() {
        setSize(500,500);
      x=getWidth()/2;
      y=getHeight()/2;
     Thread th=new Thread(this);
     th.start();
    }
   public void paint(Graphics g){
   g.setColor(java.awt.Color.red);
   g.drawOval(200+x, 100+y, yaricap, yaricap);
   yaricap+=degisim;
   x-=degisim/2;
   y-=degisim/2;
   }
    public void run() {
        while(true){
            try {
                Thread.sleep(100);
          
      if(x<=0&& y<=0){
      degisim*=-1;
      }
       if(x>getWidth()/2&&
      y>getHeight()/2){
      degisim*=-1;
      }
     else  if(degisim==0){degisim*=+1;}
      else yaricap++;
       repaint();
         } catch (InterruptedException ex) {
                Logger.getLogger(AC.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
    }
}
