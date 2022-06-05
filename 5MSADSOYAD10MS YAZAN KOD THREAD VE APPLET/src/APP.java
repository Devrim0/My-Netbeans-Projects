
import java.applet.Applet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class APP extends Applet implements Runnable {
public void init(){
Thread x=new Thread(new APP());
x.start();
x.notify();
}
    public void run() {
        for(int i=0;i<20;i++){
            try {
                Thread.sleep(100);
                System.out.println("DEVRİM...");
            } catch (InterruptedException ex) {
                Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(200);
                System.out.println("ÖZÇAY");
            } catch (InterruptedException ex) {
                Logger.getLogger(APP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
