/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.uml.sinifi;

/**
 *
 * @author Devrim
 */
abstract class person {
public abstract void haklidir();
}
abstract class patient extends person{
public  abstract void hastahaklari();
}
class gorevli extends patient{
public void hastahaklari(){}
public void haklidir(){System.out.println("hayat yasanmali diyenler");}
}
class doktor extends gorevli{ void hesapla(){
int a=8,b=5;
if(b>a){System.out.println(b);}else System.out.println(a);
}
}
class start extends  person{
public void haklidir(){System.out.println("hayat boş");}
deparment dd=new deparment();
}
class deparment{
    hospital hh=new hospital();
}
 class hospital{}
 public class calistir{
      gorevli cc=new gorevli();
    public static void main(String[] args) {
       calistir bb=new calistir();
    start ss=new start();
    ss.haklidir();
    bb.cc.haklidir();
   doktor dd=new doktor();
   dd.hesapla();
    }
}
