
package veri.yapilari.iknci.odevogrenci.txt.ders.txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class bliste{

static class ogrenci{
ogrenci ileri;

     int numara;String isim,soyad,String ,sinif;  //ogrencilerin bilgisi....
public ogrenci(int numara,String isim,String soyad,String sinif){
this.numara=numara; this.isim=isim; this.soyad=soyad; this.sinif=sinif;
ileri=null;

}

}
static class ders {
String derskodu,dersadi,derssinif;  //ders bilgilerin tanimlanmasi....
ders asagi;

public ders(String derskodu,String dersadi,String derssinifi){
    this.derskodu=derskodu; this.dersadi=dersadi; this.derssinif=derssinifi;
asagi=null;
}
    
}      //OGRENCİ VE DERS BİLGİLERİ BLİSTEDE GOSTERİLECEK.....

ogrenci bas,tmp ,tmpders;
ders bas1,son1,bas2,son2,bas3,son3;
ders tmp1;
ogrenci son,ogrsonu;


public bliste(){
bas=null;  son=null;  son1=null;
}
void sonaekle(ogrenci yeni){ //A) ŞIKKI;
  
if(bas==null){
bas=yeni;
son=yeni;


 System.out.print(yeni.numara+"   "+yeni.isim+"  "+yeni.soyad+"   "+yeni.sinif+"===>");
}
else{
son.ileri=yeni;
son=yeni;
   
   System.out.print(yeni.numara+"   "+yeni.isim+"  "+yeni.soyad+"   "+yeni.sinif+"===>");


}  
     
}       
void ders1ekle(ogrenci yeni1,ders yeni ){ //D ŞIKKI
    
      tmp=bas;
    tmpders=bas;
    
  while( tmpders!=null){
    if(son1==null ){
  son1=yeni;
  bas1=yeni;
 
 System.out.println(yeni1.numara+"  "+yeni1.isim+"  "+yeni1.soyad+"  "+yeni1.sinif+"  aldigidersler----> "+yeni.derskodu+"  "+yeni.dersadi+"  "+yeni.derssinif+" ");
    }
else  { 
         tmpders=tmpders.ileri; 
        son1.asagi=yeni;
son1=yeni;
        
System.out.println(yeni1.numara+"  "+yeni1.isim+"  "+yeni1.soyad+"  "+yeni1.sinif+"  aldigidersler----> "+yeni.derskodu+"  "+yeni.dersadi+"  "+yeni.derssinif+" ===>");

   }
    tmp=tmp.ileri;
  }
   tmp1=null;
   
}
void ogrencivarmi(ogrenci varmi){//C) şıkkı
tmp=bas; //ogrencileri gosterir;
tmp1=bas1; //dersleri gosterir;
while(tmp!=null && tmp1!=null){
    
    
if(tmp.isim != null ? varmi.isim != null : tmp.isim.equals(varmi.isim)){
   tmp1=tmp1.asagi;
 System.out.println(varmi.isim+"'nin  derslerini listele--->"+tmp1.derskodu+"   "+tmp1.dersadi+"   "+tmp1.derssinif+" ===>");
}

   if(tmp1.asagi!=null){
  
     System.out.println(varmi.isim+"'nin  derslerini listele--->"+tmp1.derskodu+"   "+tmp1.dersadi+"   "+tmp1.derssinif+" ===>");

  
   }
   tmp=tmp.ileri;
}



}


    

    public static void main(String[] args){
        String isim[]=new String[3];
             String soyad[]=new String[3];
             String derslik[]=new String[3];
        int numaraoku[]=new int[3];
        //ders tanimlamalari
        String derskodu[]=new String[4];
        String dersismi[]=new String[4];
        String derssinifi[]=new String[4];
       // String dosya2oku;
                
        //yukarıdakiler dosyadan okunan degerler;
        int  velininnumarasi=1234;int alininnumarasi=9989;int ahmetinnumarasi=3453;
        String veli="veli",ali="ali",ahmet="ahmet",velininsoyadi="oz",alininsoyadi="özal",ahmetinsoyadi="ozturk";
        String velisinif="BD3",alisinif="BD4",ahmetsinif="BD4";
        String okunanogrenci = null;
        String okunanders=null;
        File f1=new File("ogrenci.txt");
        File f2=new File("ders.txt");
       try {
            PrintWriter p1=new PrintWriter(f1);
           p1.println(velininnumarasi+"  "+veli +"  "+velininsoyadi+"  "+velisinif);
           p1.println(alininnumarasi+"  "+ali+"  "+alininsoyadi+"  "+alisinif);
           p1.println(ahmetinnumarasi+"  "+ahmet+" "+ahmetinsoyadi+"  "+ahmetsinif);
            p1.close();
        } catch (FileNotFoundException ex) {
           
        }
       String ders1kodu="bmu200",ders1adi="veri",ders1sinifi="BD3";
       String ders2kodu="bmu123",ders2adi="algoritma",ders2sinifi="BD5";
       String ders3kodu="bmu300",ders3adi="mikro",ders3sinifi="BD2";
       String ders4kodu="mat400",ders4adi="matematik",der4sinifi="BD1";
        try {
            PrintWriter p2=new PrintWriter(f2);
            p2.println(ders1kodu+"  "+ders1adi+"  "+ders1sinifi);
            p2.println(ders2kodu+"  "+ders2adi+"  "+ders2sinifi);
            p2.println(ders3kodu+"  "+ders3adi+"  "+ders3sinifi);
            p2.println(ders4kodu+"  "+ders4adi+" "+der4sinifi);
            p2.close();
        } catch (FileNotFoundException ex) {}  
        
        System.out.println("OGRENCİ TXT");
        try {
            
            Scanner k1=new Scanner(f1);
       
            while(k1.hasNext()){     
             for(int i=0;i<3;i++){
               numaraoku[i]=k1.nextInt();
             isim[i]=k1.next();
              soyad[i]=k1.next();
              derslik[i]=k1.next();
                 System.out.println(numaraoku[i]+" "+isim[i]+" "+soyad[i]+" "+derslik[i]);}
                   k1.nextLine();
             }
         
        }
            
         catch (FileNotFoundException ex) {}
        System.out.println("DERS TXT");
        try { 
            Scanner k2=new Scanner(f2);
            while(k2.hasNext()){
           for(int i=0;i<4;i++){
             derskodu[i]=k2.next();
             dersismi[i]=k2.next();
             derssinifi[i]=k2.next();
                System.out.println(derskodu[i]+"  "+dersismi[i]+"  "+derssinifi[i]);}
            k2.nextLine();
            
            }
            
        } catch (FileNotFoundException ex) {
        }
        
        System.out.println("LİSTEYE EKLEME KISMI");
         bliste b=new bliste();
         for(int i=0;i<3;i++){
           b.sonaekle(new ogrenci( numaraoku[i],isim[i],soyad[i],derslik[i]));}
        System.out.println("null");
   
         
       // DERSLERİ LİSTEYE EKLEME KISMI;
     
b.ders1ekle(new ogrenci( numaraoku[0],isim[0],soyad[0],derslik[0]),new ders(derskodu[0],dersismi[0],derssinifi[0]));
b.ders1ekle(new ogrenci( numaraoku[0],isim[0],soyad[0],derslik[0]),new ders(derskodu[1],dersismi[1],derssinifi[1]));
        System.out.println("null");
b.ders1ekle(new ogrenci( numaraoku[1],isim[1],soyad[1],derslik[1]),new ders(derskodu[0],dersismi[0],derssinifi[0]));
b.ders1ekle(new ogrenci( numaraoku[1],isim[1],soyad[1],derslik[1]),new ders(derskodu[2],dersismi[2],derssinifi[2]));
        System.out.println("null");
b.ders1ekle(new ogrenci( numaraoku[2],isim[2],soyad[2],derslik[2]),new ders(derskodu[1],dersismi[1],derssinifi[1]));
b.ders1ekle(new ogrenci( numaraoku[2],isim[2],soyad[2],derslik[2]),new ders(derskodu[3],dersismi[3],derssinifi[3])); 
        System.out.println("null");
        System.out.println("ARAMA KISMI"); 
b.ogrencivarmi(new ogrenci( numaraoku[1],isim[1],soyad[1],derslik[1]));

    
    }    
    
}
