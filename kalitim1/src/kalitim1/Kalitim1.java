/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalitim1;


class ATA {
public void dede(){
String gozrengi="mavi";
    System.out.println("dede ya da torun goz rengi: "+gozrengi);
}

    }
class baba extends ATA{
    
public void genaktarimi(){
    System.out.println("babadan ogula dogrudur tersi mumkun degildir");
}
}
class torun extends baba{
    ATA bb=new ATA();
public void soru(){
    System.out.println("torun goz rengi mavi ya da babasinin ki ile aynidir");
}
}
public class Kalitim1 {
ATA bb=new ATA();
    public static void main(String[] args) {
     Kalitim1 v=new Kalitim1();
    v.bb.dede();
    }
    
}
