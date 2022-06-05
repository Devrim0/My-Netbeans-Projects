class ogrenci{
int yas;String isim;
public ogrenci(String isim,int yas){
this.yas=yas;this.isim=isim;
}
}
public class KUYRUK
{
    int bas,son,esayisi;
  ogrenci[] d;
  int N;
  
  public KUYRUK(int N){
      son=-1;bas=0; esayisi=0;
  this.N=N;
  d=new ogrenci[N];
  }
  public boolean bosmu(){
  return son==-1;
  }
  public boolean dolumu(){
  return son==N;
  }
  
  
   void ekle(ogrenci yeni){
  if(dolumu()){System.out.println("kuyruk dolu");}
  else {
    son += 1;
  d[son]=yeni;

  esayisi++;
  }
      System.out.println("sonuc kuyruk="+yeni.isim);
  }
   
   
  ogrenci sil(){
  if(bosmu()){System.out.println("kuyruk bos"); return null;}
  else{
      ogrenci silinen=d[0];
      esayisi--; 
      for(int i=1;i<=son;i++){
          
          d[i-1]=d[i];
      son -= 1;
      }
      
  
  return silinen;
  }
  }
  
    public static void main(String[] args) {
     KUYRUK k=new KUYRUK(4);
     k.ekle(new ogrenci("ayse",5));
     k.ekle(new ogrenci("tuna",6));
     k.ekle(new ogrenci("didem",7));
     k.ekle(new ogrenci("hasan",3));
    System.out.println( k.sil().isim+k.sil().yas);
     System.out.println( k.sil().isim+k.sil().yas);
System.out.println( k.sil().isim+k.sil().yas);
     System.out.println( k.sil().isim+k.sil().yas);

    }
 
}
