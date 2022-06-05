
package pkg5msadsoyad10ms.yazan.kod.thread.ve.applet;

import java.util.logging.Level;
import java.util.logging.Logger;



class AA extends Thread{
public void run(){
for(int i=0;i<100;i++){
    System.out.println("havva guzle ,,,");
    try {
        Thread.sleep(5);System.out.println("DEVRIM..");
    } catch (InterruptedException ex) { System.out.println("DEVRIM..");
        Logger.getLogger(AA.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        Thread.sleep(10);System.out.println("ÖZÇAY..");
    } catch (InterruptedException ex) {System.out.println("ÖZÇAY..");
        Logger.getLogger(AA.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
}
public class YAZANKODTHREADVEAPPLET {

    public static void main(String[] args) {
        AA x=new AA();
       
        x.start();
        
    }
    
}
